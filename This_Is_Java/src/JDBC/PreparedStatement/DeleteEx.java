package JDBC.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * 이번 절에서는 JDBC를 이용해서 DELETE문을 실행하는 방법을 알아보자
 * boards 테이블에서 bwtiter 가 writer인 모든 게시물을 삭제하는 DELETE문은 다음과 같다.
 * 
 * DELETE FROM boards WHERE bwriter = 'writer';
 * 
 * 조건절의 값을 ?로 대체한 매개변수화된 DELETE 문으로 변경한다.
 * 
 * DELETE FROM boards WHERE bwriter = ?
 * 
 * 매개변수화된 DELETE문을 String 타입 변수 sql에 대입한다.
 * 
 * String sql = "DELETE FROM boards WHERE bwriter = ?";
 * 
 * 매개변수화된 DELETE문을 실행하기 위해 다음과 같이 prepareStatment() 매소드로부터
 * PreparedStatement를 얻고 ?에 값을 지정한 후, executeUpdate로 sql 문을 실행한다.
 * 리턴 값은 삭제된 행의 수이다.
 * 
 * INSERT UPDATE DELETE 모두 ececuteUpdate로 변경한다.
 * 
 * 1.Class.forName으로 드라이버 로딩하고
 * 2.Connetion 으로 db를 연결한다
 * 3.sql 문을 만들고
 * 4.preparStatement();에 sql을 매개값으러 주거
 * 5.preparStatement (pstmt) 의 setter 메소드로값을 넣어주고
 * 6.executeUpdate해주면 db에 데이터 조작이 가능하다.
 * 
 */
public class DeleteEx {

	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 연결성공");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/yun","yun","12345");
			System.out.println("DB 연결성공");
			
			String  sql = "DELETE FROM boards WHERE bwriter = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "아기");
			
			int row = pstmt.executeUpdate();
			System.out.println(row+"개의 행이 삭제");
			pstmt.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("드라이버 연결 실패");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("DB 연결 실패");
		}finally {
			if(conn!=null) {
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
