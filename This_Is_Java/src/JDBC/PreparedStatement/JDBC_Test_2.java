package JDBC.PreparedStatement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_Test_2 {
	
	
//	USERID	VARCHAR2(50 BYTE)	No	
//	USERNAME	VARCHAR2(50 BYTE)	No	
//	USERPASSWORD	VARCHAR2(50 BYTE)	No	
//	USERAGE	NUMBER(3,0)	No	
//	USEREMAIL	VARCHAR2(50 BYTE)	No	
	
	public static void main(String[] args) throws FileNotFoundException {
		
//		Connection conn = null;
//		
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			System.out.println("드라이버 연결 성공");
//			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:yun","yun","12345");
//			System.out.println("DB연결 성공");
//			
//			String sql = new StringBuilder()
//							.append("INSERT INTO USERS(USERID, USERNAME, USERPASSWORD, USERAGE, USEREMAIL) ")
//							.append("VALUES(?,?,?,?,?)")
//							.toString();
//			PreparedStatement pstm = conn.prepareStatement(sql);
//			
//			pstm.setString(1, "heuyoon17");
//			pstm.setString(2, "yun");
//			pstm.setString(3, "heoyoon909734");
//			pstm.setInt(4, 24);
//			pstm.setString(5,"heuyoon19@gmail.com");
//			
//			int row = pstm.executeUpdate();
//			System.out.println(row+" 행이 적용됨");
//			pstm.close();
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		finally {
//			
//			if(conn != null) {
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
		
//		Connection conn = null;
//		
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			System.out.println("드라이버 연결 성공");
//			
//			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:yun","yun","12345");
//			System.out.println("DB연결 성공");
//			
//			String sql = new StringBuilder()
//						.append("UPDATE USERS SET ")
//						.append("USERID = ?, ")
//						.append("USERNAME = ?, ")
//						.append("USERPASSWORD = ?, ")
//						.append("USERAGE = ?, ")
//						.append("USEREMAIL = ? ")
//						.append("WHERE USERID = 'heuyoon18'")
//						.toString();
//			
//			PreparedStatement pstm = conn.prepareStatement(sql);
//			
//			pstm.setString(1,"heoyun4739");
//			pstm.setString(2, "admin");
//			pstm.setString(3, "admin909734");
//			pstm.setInt(4, 99);
//			pstm.setString(5, "admin909734@localhost.com");
//			
//			int row = pstm.executeUpdate();
//				
//			System.out.println(row+"행이 입력 되었습니다.");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 연결");
				
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:yun","yun","12345");
			
			String sql = new StringBuilder()
							.append("DELETE FROM USERS WHERE ")
							.append("USERID = ?")
							.toString();
			
			PreparedStatement pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, "heoyun4739");
			
			int row = pstm.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}