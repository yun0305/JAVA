package JDBC.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_TEST {

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	TEST_DTO testDto = new TEST_DTO();
	
	class Table{
		
		int count = 0;
		String tableStruct = null;
		
	}
	
	
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	public JDBC_TEST(){
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 연결 성공");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/yun","hr","hr");
			System.out.println("DB연결 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void create() throws SQLException, IOException {
		
		Table tb = new Table();
		
		StringBuilder sql = new StringBuilder();	
		
		System.out.println("생성할 테이블의 이름을 입력해주세요.");
		sql.append("create table ")
		.append(bf.readLine())
		.append("( ");
		System.out.println("컬럼을 몇개 생성하시겠습니까?");
		
		String[] col = new String[Integer.parseInt(bf.readLine())];
		for(int i=1; i<col.length+1;i++) {
			tb.count = col.length;
			System.out.println(i+"번째 컬럼명");
			String colName = bf.readLine();
			System.out.println(i+"번째 컬럼타입");
			String colType = bf.readLine();
			System.out.println(i+"번째 컬럼을 기본키로 지정하시겠습니까? yes OR no");
			String colPrimary = bf.readLine().equals("yes") ? "primary key":"not null" ;
			
			if(!(i==col.length)) {
				sql.append(colName+" "+colType+" "+colPrimary+", ");
			}else {
				System.out.println("마지막 컬럼입니다.");
				sql.append(colName+" "+colType+" "+colPrimary+") ");
			}
		}
		tb.tableStruct = sql.toString();
		pstmt = conn.prepareStatement(sql.toString());
		pstmt.executeUpdate();
		System.out.println("테이블 생성");
		pstmt.close();
	}
	
	public void delete() throws SQLException, IOException {
		
		System.out.println("삭제할 테이블을 입력해 주세요.");
		String table=table = bf.readLine();
			
		
		String sql = new StringBuilder()
				.append("drop table ")
				.append(table)
				.toString();
		pstmt = conn.prepareStatement(sql);
		pstmt.executeUpdate();
		System.out.println("테이블 삭제");
		pstmt.close();
	}
	
	public void insert() throws SQLException, NumberFormatException, IOException {
		
		System.out.println("테이블을 선택해 주세요");
		
		
		String sql = new StringBuilder()
				.append("Insert into ")
				.append(bf.readLine())
				.append(" values(?,?,?,sysdate) ")
				.toString();
		
		pstmt = conn.prepareStatement(sql);
		System.out.println("추가할 사용자의 번호,이름,제목을 입력해 주세요");
		pstmt.setInt(1, Integer.parseInt(bf.readLine()));
		pstmt.setString(2, bf.readLine());
		pstmt.setString(3, bf.readLine());
		pstmt.executeUpdate();
		pstmt.close();
		
	}
	
	public void update() throws SQLException, IOException {
		
		String colum = bf.readLine();
		System.out.println(" 테이블의"+colum+" 컬럼명을 입력해 주세요.");
		
		try {
			String sql = new StringBuilder()
					.append("update test set ")
					.append(colum)
					.append("= ?")
					.toString();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bf.readLine());
			pstmt.executeUpdate();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public void select() throws SQLException, IOException {
		
		System.out.println("조회할 테이블을 입력해 주세요");
		String sql = new StringBuilder()
				.append("select * from ")
				.append(bf.readLine())
				.toString();
		
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			testDto.setTestNum(rs.getInt(1));
			testDto.setTestName(rs.getString(2));
			testDto.setTestTitle(rs.getString(3));
			testDto.setTestDate(rs.getString(4));
		}
		
		System.out.println(testDto.toString());
		
		pstmt.close();
		
	}
	
	public void DataBase() throws IOException, SQLException {
		
		while(true){
			System.out.println("테이블 조작 예제");
			System.out.println("---------------");
			System.out.println("1.테이블 생성");
			System.out.println("2.테이블 삭제");
			System.out.println("3.테이블 행 추가");
			System.out.println("4.테이블 컬럼 수정");
			System.out.println("5.테이블 조회");
			System.out.println("---------------");
			String number = bf.readLine();
			if(number.equals("1")) {
				create();
			}
			else if(number.equals("2")) {
				delete();
			}
			else if(number.equals("3")) {
				insert();
			}
			else if(number.equals("4")) {
				update();
			}
			else if(number.equals("5")) {
				select();
			}
			else {
				System.out.println("종료");
				conn.close();
				break;
			}
		
		
		}
	
	}
	
}
