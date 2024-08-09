package JDBC.PreparedStatement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_Test_2 {
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 등록 성공");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:yun","yun","12345");
			System.out.println("db연결 성공");
			
			
			String sql = new StringBuilder()
					 .append("INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata) ")
				     .append("VALUES(SEQ_BNO.NEXTVAL,?,?,?,SYSDATE,?,?)")
				     .toString(); 
			
			
			PreparedStatement pstm = conn.prepareStatement(sql);
			
			pstm.setString(1,"오늘복습");
			pstm.setString(2,"JDBC");
			pstm.setString(3,"허윤");
			pstm.setString(4,"not.jpg");
			pstm.setBlob(5, new FileInputStream("src/image/cat.png"));
			
			pstm.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
		
	
	
}
