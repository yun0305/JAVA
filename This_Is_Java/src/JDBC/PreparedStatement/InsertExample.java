package JDBC.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * 
 *<데이터 저장>
 *이번절에서는 jdbc를 이용해서 insert문을 실행하는 방법을 알이보자. user테이블에 새로운 사용자 정보를 저장하는 insert문은 다음과 같다
 * INSERT INTO users(userid,username,userpassword,userage,useremail)
 * values('yun0305','허윤','12345',25,'heuyoon19@gmail.com');
 * 
 * 이제 이걸 자바코드에서 사용할때는 값을 ?로 대체한 매개변수화된 insert문으로 변경하면
 * 다은과 같다
 * 
 * INSERT INTO users(userid,username,userpassword,userage,useremail)
 * VALUE(?,?,?,?,?)
 * 그리고 INSERT 문을 String 타입 변수 sql에 문자열로 대입한다.
 *
 * <StringBuilder 사용법>
 * String sql = new StringBuilder()
 * 					.append("INSERT INTO user(userid,username,userpasswoed,userage,useremail) ")
 * 					.append("VALUE(?,?,?,?,?)")
 * 					.toStirng();
 * 
 *또는 
 *
 *String sql = ""+
 *"INSERT INTO users(userid,username,userpassword,userage,useremail) "+
 * "VALUE(?,?,?,?,?)";
 * 
 * 이제 문자열로 만든 sql문을 데이터 베이스에서 실행 하려면 PreparedStatement 라는 객체를 생성해야한다.
 * 
 * 이객체는 어떻게 얻냐면 conn 연결객체를 통해서 prepareStatement() 메소드의 매개값으로 sql문을 넣어주면 된다.
 * 참고로 PreparedStatment는 인터페이스다 
 * 
 * PreparedStatment pstmt = conn.prepareStatement(sql); 
 * 
 * 아직은 실행된 상태가 아니다. PreparedStatment 만들고 나서 이제 실행을 할수 있다.
 * 
 * 이제 값을 넣어줄수 있는데 ? 에 들어가는 값을 순서대로 넣어주면 된다 
 * 
 * pstmt.setString(1,"heuyoon19");
 * pstmt.setString(2,"허윤");
 * pstmt.setString(3,"0305");
 * pstmt.setInt(4,25);
 * pstmt.setString(5,"heuyoon19@gmail.com");
 * 
 * 이제 마지막으로 sql 문을 DB에 보내서 실행시키는 명령어가
 * int rows = pstmt.excuteUpdate(); 이다.
 *  
 * excuteUpdate() 메소드가 리턴하는 값은 정수 값인데 데이터 베이스에서 insert를 성공하면 1행이 입력되었습니다.가 뜬다.
 * 그 1을 리턴한다 무슨말이냐면 excuteUpdate() 메소드는 CRUD (쓰기,읽기,수정,삭제)할때 다 사용된다.
 * 리턴하는 값은 저장된 행수가 아니라 데이터 베이스에 반영된 행의 수이다. 실제 데이터베이스에 반영된 행의수다.
 * 
 * 그럼 방금 작성한 insert문의 행의 수는 1개니까 정상적으로 1이나와야한다.
 * 
 * 이제 더이상 pstmt를 사용하지 않을경우에는 close() 메소드로 pstmt가 사용했던 메모리를 해제한다.
 * pstmt.close();
 * 
 * 이번예제는 user테이블에 사용자 정보를 저장하는 전체 코드이다,
 * 
 *
 *
 */
public class InsertExample {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 연결 성공");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/yun","yun","12345");
			System.out.println("DB연결 성공");
			
			String sql = "INSERT INTO users(userid,username,userpassword,userage,useremail) VALUES(?,?,?,?,?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//conn로 통해 준비해 라는 뜻으로 d가 붙지 않는다 prepareStatement
			pstmt.setString(1,"nana");//setter 호출 타입에 맞게 String or int 기타등등.. 으로 설정해줘야 한다.
			pstmt.setString(2,"눈나");
			pstmt.setString(3,"4321");
			pstmt.setInt(4, 26);
			pstmt.setString(5, "nana000104@gmail.com");
			
			int rows = pstmt.executeUpdate();//실행결과 서버로 보냄
			if(rows == -1) {
				System.out.println("insert 실패");
			}
			else {
				System.out.println("insert 성공 "+"저장된 행수"+rows);
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
			
		//동영상1:10;17
		
	}
	
	
}
