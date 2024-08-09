package JDBC.PreparedStatement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 이번에는 boards 테이블에 게시물 정보를 저장해보자, 새로운 게시물 정보를 저장하는
 * INSERT 문은 다음과 같다.SEQ_BNO.NEXTVAL은 SEQ_BNO 시퀀스에서 가져올 번호이고,
 * SYSDATE는 현재 시간이다
 * 
 * INSERT INTO boards (bno,btitle,bcontent,bwriter,bdate,bfilename,bfiledata)
 * VALUE(SEQ_BNO.NEXTVAL,?,?,?,SYSDATE,?,?);
 * 
 * SEQ_BNO.NEXTVAL와 SYSDATE를 제외하고 나머지는 ?로 대체한 매개변수화된 INSERT 문으로 만들고 String 타입 변수 sql에 저장한다
 * 
 * 매개변수화된 INSERT문을 실행하기 위해 다음과 같은 preparstatement() 메소드로부터
 * PreparedStatement 객체를 얻는데 이전과 다르게 두 번째 매개값이 있다.
 * 
 * PreparedStatement pstmt = conn.preaparStatement(sql,new String[] {"bno"});//보통 2번째 인자값은 기본키 컬럼이온다.
 * 
 * 두번쨰 매개값은 INSERT문이 실행된 후 가져올 컬럼 값으로,new String[] {"bno"}; 라고 주면
 * bno 컬럼 값을 가져온다. sql문이 실행되기 전까지는 SEQ_BNO.NEXTVAL로 얻은 번호를 모르기 떄문에
 * SQL 문이 실행된 후에bno 컬럼에 실제로 저장된 값을 얻어오는 것이다.
 * 
 * 이제 ?에 해당하는 값을 지정한다. bfiledata 컬럼은 바이너리 타입(blob)이므로 ?에 값을 지정하려면
 * setBinaryStream(), setBolb(), setBytes() 메소드 중 하나를 이용해야 한다. 다음은 setBlob을 이용해서 바이트 입력 스트림을 제공한 것이다.
 * 
 * .
 * .
 * .
 * pstmt.setBlob(5,new FileInputStream("파일 주소"));
 *
 * int rows = pstms.excuteUpdate();
 * if()
 * 
 *INSERT 문을 실행하고 저장된 bno 값을 얻는 방법은 다음과 같다. 게시물 정보가 저장되었을 경우
 *(row가 1일 경우) pstmt.getGeneratedKeys() 메소드로 ResultSet객체를 얻고 
 *ResultSet 의 getInt() 메소드로 bno를 얻는다. ResultSet에 대해서는 다음에 자세히 배우고
 *
 *
 *
 *대충 ResultSet의 구조는 테이블과 비슷하다. 포인터가 있는데 커서라고도 한다 처음에는 아무것도 없는 곳을 가리키면서
 *준비상태에 있다. 그럼 이제 데이터를 읽기 위해서는 커서를 하나씩 내려서 컬럼을 지정해야 하는데
 *커서를 내리는 메소드가 ResertSet이 가지고 있는 next()메소드다. 구조는 대충 이렇고
 * rs.getInt(1)에서 1은 컬럼의 순번이다.
 * 
 *int rows = pstms.excuteUpdate();//sql 문 실행
 *if(row == 1){ 
 *ResertSet  rs = pstmt.getGeneratedKey();//  new String[] {"bno"}에 기술된 컬럼 값을 가져옴
 *}
 *
 *if(rs.next()){ // 값이 있다면
 * int bno = rs.getInt(1);//new String[] {"bno"}의 첫번째 항목 bno 컬럼 값을 읽음
 *}
 *rs.close(); // ResultSet이 사용했던 메모리 해제
 *}
 */

public class PreparedStatementEx2 {

	public static void main(String[] args) throws FileNotFoundException {
	
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 연결 성공");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/yun","yun","12345");
			System.out.println("DB연결 성공");
			
			String sql = new StringBuilder()
					     .append("INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata) ")
					     .append("VALUES(SEQ_BNO.NEXTVAL,?,?,?,SYSDATE,?,?)")
					     .toString(); 
			PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"bno","btitle"});
			
			pstmt.setString(1, "귀여운 냥");
			pstmt.setString(2, "고양양");
			pstmt.setString(3, "아기");
			pstmt.setString(4, "cat.png");
			Blob bolb = null;
			pstmt.setBlob(5, new FileInputStream("src/image/cat.png"));
			
			int row = pstmt.executeUpdate();
			
			if(row == 1) {
				System.out.println("row 1");
				ResultSet rs = pstmt.getGeneratedKeys();
				
				if(rs.next()) {//커서는 데이터가 있는 열을 선택하면 true 없으면 false를 리턴한다.
					
					int bno = rs.getInt(1);
					System.out.println("저장된 bno :"+bno);
					String btitle = rs.getString(2);
					System.out.println("저장된 btitle :"+btitle);
				}
				rs.close();
			}
			else {
				System.err.println("row 0");
			}
			pstmt.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}	
	}	
}