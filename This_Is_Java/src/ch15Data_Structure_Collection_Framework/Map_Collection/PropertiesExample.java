package ch15Data_Structure_Collection_Framework.Map_Collection;

import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
	
	/*
	 * Properties는 Hashtable의 자식 클래스이기 떄문에 Hashtable의 특징을 그대로 가지고 있다.
	 * Properties는 키와 값을 String으로 제한한 컬랙션이다. Properties는 주로 확장자가 .properties
	 * 인 프로퍼티 파일을 읽을 떄 사용한다.
	 * 
	 * 프로퍼티 파일은 다음과 같이 키와 값이 = 기호로 연결되어 있는 텍스트 파일이다. 일반 텍스트 파일과
	 * 다르게 IOS 8859-1 문자셋으로 저장되며, 한글일 경우에는 \ u + 유니 코드로 표현되어 저장된다.
	 * 
	 * 프로퍼티스 객체를 생성하는 방법은 일반 객체를 생성하는 것과 다르지 않다.
	 * 
	 * 
	 * 이전 컬랙션들은 변수 타입은 인터페이스 참조값은 구현 클래스 였는데 Properties는 왜 그러냐면
	 * Properties 내에 별도의 메소드를 사용해야하기 떄문이다. 그중에 하나가 load라는 메소드다
	 * 
	 * Properties properties = new Properties();
	 * properties.load(Xxx.Class.getResourceAsStream("database.properties"));
	 * 
	 * 프로퍼티 파일의 내용을 읽고 propertirs 에 저장하는 메소드이다.
	 * 
	 * Xxx.Class여기까지는 클래스의 정보를 읽어오는 것이고 getResourceAsStream("database.properties")
	 * 여기까지는 Xxx.Class 이 클래스를 기준으로 해서 내가 상대경로에 있는 어떤 파일의 내용을 읽기위해서
	 *  getResourceAsStream 을 쓴거다. 이렇게 하면 properties 키와 값이 저장이 된다.
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		//Properties 컬랙션 생성
		Properties properties = new Properties();
		
		//PropertiesExample.class와 동일한 ClassPath에 있는 database.properties 파일 로드
		try {
			properties.load(PropertiesExample.class.getResourceAsStream("database.properties"));//상대경로 or 절대경로
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//주어진 키에 대한 값 읽기
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");
		
		//값 출력
		String out = new StringBuilder().append(driver+"\n")
										.append(url+"\n")
										.append(username+"\n")
										.append(password+"\n")
										.append(admin+"\n")
										.toString();
		
		System.out.println(out);
	}

}
