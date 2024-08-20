package JDBC.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDCBC_Test {
	
	public static void main(String[] args) {
		
		User user = new User();
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstm = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 연결");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:yun","yun","12345");
			System.out.println("DB연결 성공");
			
			String sql = new StringBuilder()
							.append("SELECT * FROM ? ")
							.toString();
		
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, "USERS");
			
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				
				user.setUserID(rs.getString(1));
				user.setUserName(rs.getString(2));
				user.setUserPassword(rs.getString(3));
				user.setUserAge(rs.getInt(4));
				user.setUserEmail(rs.getString(5));
				
				System.out.println(user.toString());
				
			}
			
			
			
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
