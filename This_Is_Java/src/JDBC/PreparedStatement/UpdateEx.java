package JDBC.PreparedStatement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 *이번 절에는 JDBC를 이용해서 UPDATE문을 실행하는 방법을 알아보자.
 *bords 테이블에 저장된 게시물 중에서 bno가 1인 게시물의 btitle, bcontent, bfiledata를 변경하는 sql문은
 *다음과 같다
 *
 * UPDATE boards SET
 * btitle = '눈사람'
 * bcontent  '눈으로 만든 사람'
 * bfilename = 'snowman.jpg'
 * bfiledata = 'binaryData'
 * WHERE bno=3;
 * 
 * 값을 ?로 대체한 매개변수화된 UPDATE 문으로 변경한다.
 * 
 * UPDATE boards SET
 * btitle = ?
 * bcontent = ?
 * bfilename = ?
 * bfiledata = ?
 * WHERE bno=?;
 * 
 * String 타입 변수에 매개변수화된 UPDATE문을 저장한다.
 * 
 * String sql = new StringBuilder()
 * 				.append("UPDATE boards SET ")
 * 				.append("btitle = ? ")
 * 				.append("bcontent = ? ")
 * 				.append("bfilename = ? ")
 * 				.append("bfiledata = ? ")
 * 				.append("WHERE bno=?")
 * 				.toString();
 * 
 * 매개변수화된 UPDATE문을 실행하기 위해 다음과 같이 prepareStetment()메소드로 부터
 * PreparedStatement를 얻고. ?에 해당하는 값을 지정한다.
 * 
 * PreparedStatement pstmt = conn.prepareStatement(sql);
 * pstmt.setString(1,"눈사람");
 * pstmt.setString(2,"눈으로 만진 지윤");
 * pstmt.setString(3,"눈사람지윤.jpg");
 * pstmt.setBlob(4, new FileInputStream("경로.ㅓㅔㅎ"));
 * pstmt.setInt(5,3);
 * 
 * 값을 모두 지정하였다면 UPDATE 문을 실행하기 위해 excuteUpdate() 메소드를 호출한다 성공적으로
 * 실행되면 수정된 행의 수가 리턴된다. 0이 리턴되면 조건에 맞는 행이 없어 수정된 내용이 없음을 의미한다.
 * 
 * int row = pstmt.excuteUpdate();
 * 
 */
public class UpdateEx {
		
		public static void main(String[] args) throws FileNotFoundException {
			
			Connection conn = null;
			
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				System.out.println("드라이버 연결성공");
				
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/yun","yun","12345");
				System.out.println("DB연결 성공");
			
				String sql = new StringBuilder()
						.append("UPDATE boards SET ")	
						.append("btitle = ?, ")
						.append("bcontent = ?, ")
						.append("bfilename = ?, ")
						.append("bfiledata = ? ")
						.append("WHERE bno <= ?")
						.toString();	
				
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, "눈나");
				pstmt.setString(2, "눈나눈나나");
				pstmt.setString(3, "cat.png");
				pstmt.setBlob(4, new FileInputStream("src/image/cat.png"));
				pstmt.setInt(5, 3);
				
				int row = pstmt.executeUpdate();//INSERT와 다르게 값이 1이 아니라 여러개가 나올수 있다 왜냐면 여러 행을 바꿀수 있기 때문이다.
				
				if(row != -1) {
					System.out.println("수정 성공 "+row+"개의 행이 수정");
				}
				else {
					System.err.println("수정 실패");
				}
				
				
				pstmt.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.err.println("드라이버 연결 실패");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.err.println("DB연결 실패");
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
