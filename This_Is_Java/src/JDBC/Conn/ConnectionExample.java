package JDBC.Conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * <DB연결>
 * 클라이언트 프로그램에서 DB와 연결하려면 해당 DBMS의 JDBC Driver 가 필요하다.
 * 또한 연결 에 필요한 다음 네가지 정보가 있어야 한다.
 * 
 * 1.DBMS가 설치된 컴퓨터의 IP주소
 * 2.DBMS가 허용하는 포트 번호 (1521)
 * 3.사용자(DB계정) 및 비밀번호 (yun)(12345)
 * 4.사용하고자 하는 DB이름(yun) (SELECT name FROM v$database; 데이터 베이스 이름 확인하는법)
 * 
 * 그리고 이제 코드애서 로딩을 할건데 jdbc 라이브러리 안에는 driver 클래스가 있다. 이걸 메모리로 로딩해야한다.
 * 
 * 바이트 코드 파일을 사용하려면 메소드 영역에 로딩을 시켜야 한다.
 * 
 * 
 * 드라이버 로딩하는법 :
 * Class.forName("oracle.jdbc.OracleDriver");
 * 
 * Class.forName 매개값에 문자열로 값을 주면 그 문자열이 클래스 패스상에 있을 경우에 그 클래스의 바이크코드를 읽고 메모리에 올린다.
 * 그리고 Class.forName 는 그 클래스의 대한 클래스 객체를 리턴한다 하지만 메모리에 올리는게는게 목적이라서 Class.forName 이걸 사용한다.
 * 
 * 실제로 oracle.jdbc.OracleDriver 이 클래스가 어디에 있냐면 빌드 패스에 등록해놓은 드라이버 에 있다.
 * 그럼 이제 이 oracle.jdbc.OracleDriver를 로딩하는 순간 DriverManager에 등록이 된다
 * DriverManager는 드라이버를 관리하는 역할을 한다. 그래서 오라클용 드라이버를 DriverManager 에 등록하는 과정이라고 보면 된다.
 * 예로 mysql도 드라이버가 따로 있어서 Class.fromName에 mysql용 드라이버를 로딩 시키면 DriverManager에 mysql용 드라이버가 등록된다.
 * 
 * 이 과정에서 JBBC Driver 클래스의 static 블록이 실행되면서 DriverManager에 JDBC Driver 객체를 등록하게 된다.
 * 만약 Build Path에서 JDBC Driver 클래스를 찾지 못하면 
 * ClassNotFoundException이 발생하므로 예외 처리를 해야 한다.
 * 
 * 그런데 왜 Class.forName("oracle.jdbc.OracleDriver"); 만 사용했는데 어떻게 DriverManager가 OracleDriver을 사용할수 있는 냐하면
 * 
 * OracleDriver 클래스의 구조에 보면 static 블록에 코드가 이런식으로 선언되어있다.
 * 
 * class OracleDriver{
 * static{
 * 	OracleDriver driver = new OracleDriver();
 * 	DriverManager.registeDriver(driver);
 * }
 * }
 * 여기서 OracleDriver를 로딩하는 순간 OracleDriver의 객체를 만들고
 * DriverManager의 registerDriver의 정적 메소드의 매개값으로 Driver타입(인터페이스다)매개값을 받는다
 * OracleDriver은 구현객체이다.
 * 
 * 사실 이건 몰라도 된다.
 * 
 * DriverManager에 JDBC Driver가 등록되면 getConnection() 메소드로 DB와 연결할수 있다.
 * 
 * 
 * 
 * 
 */
public class ConnectionExample {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			//<JDBC Driver를 메모리로 로딩하고, DriverManager에 등록>
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("성공");
			/*
			 *이제 Driver를 메모리에 로딩을 하면 DB에 연결을 할수 있다. DriverManaer로
			 */
			//<DB연결>
			 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/yun","yun","12345");
			System.out.println("연결 성공");
			/*
			 * 데이터 베이스에 접근하기 위해서는 총 4가지의 정보가있다.
			 * DriverManager.getConnection의 3개의 매개값 중 2번째는 데이터 베이스 스키마 2번째는 비밀번호이다.
			 * 그럼 그럼 사용자 계정과 비밀번호를 하나로 본다면 3가지의 정보가 부족한데
			 * 그 3가지 정보가 첫번째 인자값에 있어야한다. 그래야만 연결이 가능하다
			 * 그럼 첫번째 인자에 들어가는 형식 ip,포트,데이터베이스 이름 이 3개를 작성하는 형식이
			 * DBMS 마다 다 다르다.
			 * 
			 * 첫번째 인자값은 연결 문자열인데, 다음 은 Oracle의 연결 문자열 형식이다
			 * 
			 * jdbc:oracle:thin:@localhost(ip):1521(포트)/orcl(DB명) 이다.
			 *       
			 * jdbc:oracle:thin은 TCP용 JDBC Driver를 사용한다는 뜻이고, @localhost는 로컬에
			 * 설치된 Oracle에 연결하겠다는 의미다, 원격으로 Oracle을 연결하려면 @Ip주소로 기술해야 한다.
			 * 1521은 Port번호, orcl은 DB명이다.
			 * 
			 * DriverManager의 정적 메소드인 getConnection 은 3개가 있는데
			 * 그중에 매개값이 3개인 메소드를 사용했다. getConnection은 Connection을 리턴한다.
			 * 
			 * Connection이 뭐냐면 인터페이스다. getConnection은 Connection을 구현한 구현객체를 리턴한다.
			 * 그렇기 때문에 DriverManager.getConnection이 리턴하는 값이 Connection이니까
			 * Connection 타입의 변수로 연결객체를 받아준다
			 */
			//<DB 연결 끊기>
			//<DB작업>
			
			
			//conn.close(); DB작업이 정상적으로 실행하지 않으면 예외가 발생해서 자윈해제가 안되기 때문에 close는 finaly에 작성해주면 된다.
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("실패");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(conn != null) {//conn이 null이면 굳이 close 해줄 필요가 없기 때문에 조건을 걸어줫다
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
