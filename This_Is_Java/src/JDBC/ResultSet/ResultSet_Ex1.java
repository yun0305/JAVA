package JDBC.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * <데이터 읽기>
 *PreparedStatement를 생성할 때 SQL문이 INSERT,UPDATE,DELETE일 경우에는
 *excuteUpdate() 메소드를 호출하지만, 데이터를 가져오는 SELECT 문일 경우에는 excuteQuery() 메소드를 
 *호출해야 한다. excuteQuery() 메소드는 가져온 데이터를 ResultSet에 저장하고 리턴한다.
 *
 *<ResultSet의 구조>
 *ResertSet은 SELECT 문에 기술된 컬럼으로 구성된 행의 집합이다, 예를들어 다음 SELECT 문은 userid, username, userage
 *컬럼으로 구성된 ResultSet을 리턴한다
 * 
 * SELECT userid, username, userage, FROM users
 * 
 * 위의 SELECT 문이 가져온 데이터 행이 4개라면 ResultSet의 내부 구조는 다음과 같다
 * 
 * brforeFirst행   데이터 없음		최초 커서 위치   <--(커서) next하면 다음으로 넘어감
 * 
 * firest행        
 * .
 * .
 * .
 * last행
 * afterLast행 	  데이터 없음
 * 
 * ResultSet의 특징은 커서가 있는 행의 데이터만 읽을 수 있다는 것이다. 여기서 커서는 행을 가르키는 포인터를 말한다,
 * ResultSet에는 실제 가져온 데이터 행의 앞과 뒤에 beforeFirst 행과 afterLast 행이 붙는데, 최초 커서는 
 * beforeFirst를 가르킨다 따라서 첫번쨰 데이터행인 first 행을
 * 읽으려면 커서를 이동 시켜야 한다. 이때 next() 메소드를 사용한다 리턴타입은 boolean이다.
 * 
 * next()메소드는 커서를 다음 행으로 이동시키는데, 이동한 행에 데이터가 있으면 true를  없으면 false를
 * 리턴한다. 앞의 그림을 보면 last행까지는 true를 리턴하고 afterLast행으로 이동하면 false를 리턴하는걸 볼수 있다.
 * 
 * 만약 SELECT문으로 가져온 데이터 행이 없다면 beforeFirst행과 afterLast행이 붙어 있기 때문에 
 * 첫 번째 next() 결과는 false가 된다. 다음은 SELECT 문으로 가져온 행의 수에 따라서 커서를 이동시키는 코드이다.
 * 
 * <1개의 데이터 행만 가져올 경우>
 * ResultSet rs = pstmt.excuteQuery();
 * 
 * if(rs.next){
 * 		첫번째 데이터 행 처리
 * }
 * else{
 *  	afterLast행으로 이동했을 경우
 * }
 * 
 * <n개의 데이터 행을 가져올 경우>
 * 
 * ResultSet rs = pstmt.excuteQurey();
 * while(rs.next){
 * 		last 행까지 이동하면서 데이터 행 처리
 * 
 * }
 * 		afterLast행으로 이동했을 경우
 * 	
 * 1개의 데이터 행만 가져올 경우에는 if 조건식에서 next 메소드를 1번 호출한다, true일 경우 (첫번째 데이터 행이 있을 경우)
 * 와 false일 경우 (afterLast 행으로 이동했을 경우)에 따라서 적절한 처리를 해야 한다. 주로 SELECT문이 기본키를 조건으로 데이터를 
 * 가져오는 경우에 해당한다. n개의 데이터 행을 가져올 경웅는 while 문을 이용해서 next() 메소드를 반복 호출해 true가 리턴될 동안
 * (last행 까지 이동할 떄까지) 데이터 행을 처리하고 false가 리턴되면(afterLast 행으로 이동할떄) 반복을 종료시킨다.
 * 
 * SELECT 문에 따라 ResultSet에는 많은 데이터 행이 저장될 수 있기 떄문에 ResultSet을 더 이상 사용하지 않는다면
 * close() 메소드를 호출해서 ResultSet이 사용한 메모리를 해제하는 것이 좋다.
 * 
 * <데이터 행 읽기>
 * 커서가 있는 데이터 행에서 각 컬럼의 값은 getter 메소드로 읽을수 있다. 컬럼의 데이터 타입에 따라 getXxx() 메소드가
 * 사용되며, 매개값으러 컬럼의 이름 떠는 컬럼 순번을 줄 수 있다.
 * ResultSet에서 컬럼 순번은 1부터 시작하기 때문에 userid = 1, username = 2, userage = 3이 된다.
 * 
 *  여기서 getter메소드는 컬럼의 이름을 받을수 있는 메소드와 순번을 받는 메소드로 둘다 오버로딩 되어 있기 때문에
 *  두 방법다 써도 된다.
 *  
 *  <컬럼 이름으로 읽기>
 *  
 *  String userID = rs.getString("userid");
 *  String userName = rs.getString("username");
 *  String userAge = rs.getInt("userage");
 *  
 *  
 *  <컬럼 순번으로 읽기>
 *  String userid = rs.getString(1);
 *  String username = rs.getString(2);
 *  String userAge = es.getInt(3);
 *  
 *  만약 select 문에 연산식이나 함수 호출이 포함 되어 있다면 컬럼 이름 대신 컬럼 순번으로 읽어야 한다.
 *  예를 들어 다음과 같은 select문에서 userage -1 연산식이 사용되면 컬럼 순번으로만 읽을 수 있다.
 *  userage-1은 컬럼명이 아니기 때문이다. 하지만 별칭을 써서 하면 별칭이 컬럼 이름이 된다.
 *  
 * 
 *  
 *  
 */

public class ResultSet_Ex1 {

	public static void main(String[] args) {
		
		Connection conn = null;
		User user = new User();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.err.println("드라이버 연결성공");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/yun","yun","12345");
			System.err.println("DB연결 성공");
			String sql = new StringBuilder()
					.append("SELECT * FROM ")
					.append("USERS ")
					.append("WHERE userId = ? ")
					.toString();
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "nana");
			
			ResultSet rs = pstmt.executeQuery();
			
			
			if(rs.next()) { //현재 sql 조건문이 아이디 기본키에 해당하는 걸 비교하기떄문에 아이디는 1개의 행만 나온다 그렇기떄문이 if문 을 새용했다.
				user.setUserID(rs.getString(1));
				user.setUserName(rs.getString(2));
				user.setUserPassword(rs.getString(3));
				user.setUserAge(rs.getInt(4));
				user.setUserEmail(rs.getString(5));
			}
			
			rs.close();
			pstmt.close();
			System.out.println(user.toString());
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
			
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
}
