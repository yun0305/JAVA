package JDBC.ResultSet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSet_Ex2 {

	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Insert();
		
		Connection conn = null;
		Board board = new Board();
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 연결 성공");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/yun","yun","12345");
			System.out.println("DB연결 성공");
			String sql = new StringBuilder()
					.append("SELECT * FROM ")
					.append("BOARDS ")
					.append("WHERE BWRITER = ? ")
					.toString();
		
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "아기고양이");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				board.setbNo(rs.getString(1));
				board.setbTitle(rs.getString(2));
				board.setbContent(rs.getString(3));
				board.setbWriter(rs.getString(4));
				board.setbDate(rs.getString(5));
				board.setbFileName(rs.getString(6));
				board.setbFilData(rs.getBlob(7));
				System.out.println(board);
			}
			
			
			pstmt.close();
			rs.close();
		
			
			
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
	
	private static void Insert() throws FileNotFoundException {
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 연결 성공");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/yun","yun","12345");
			
			String sql = new StringBuilder()
					.append("INSERT INTO BOARDS ")
					.append("VALUES(SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE, ?, ?) ")
					.toString();
					
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "나");
			pstmt.setString(2, "난나나");
			pstmt.setString(3, "아기고양이");
			pstmt.setString(4, "ca.png");
			pstmt.setBlob(5, new FileInputStream("src/image/cat.png"));
			
			int row = pstmt.executeUpdate();
			
			if(row != 0) {
				System.out.println("성공");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//1:28:40
		
		
	}
	
	
}
