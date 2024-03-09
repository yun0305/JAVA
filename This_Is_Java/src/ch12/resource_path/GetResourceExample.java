package ch12.resource_path;

	/*
	 * 바이트 코드가 존재하는 곳에는 바이트 코드 파일만 있는것이 아니라 리소스 파일이 있을수 있다
	 * 여기서 리소스 파알은 데이터가 있는 파일을 뜻한다 대표적으로 그림파일이 있다 클래스와 같은 위치에 있다.
	 * 그리고 텍스트 파일도 데이터 파일이다.(XML 포함)
	 * 
	 * 제공 되는 메소드는 다음과 같다
	 * 
	 * 메소드												용도
	 * URL getResource(String name)						리소스 파일의 URL 리턴
	 * inputStream getResourceAsStream(String name)		리소스 파일의 inputStream 리턴
	 * 
	 * 
	 * 
	 * 이 두 메소드는 클래스 객체가 가지고 있다 클래스 객체는 클래스를 기준으로 해서 상대경로로 리소스 파일의 경로를 알아내는 기능도 있다
	 * 
	 * URL getResource(String name)는 경로의 대한 정보만 리턴한다
	 * inputStream getResourceAsStream(String name)는 하당 경로에 있는 파일을 오픈해서 안에 있는 데이터를 읽어 들일수 있는 inputStream 갹체를 리턴한다.
	 * 
	 * String photo1Path = clazz.getResource("photo1.jpg").getPath(); (클래스 기준 경로)
	 *	 
	 * String photo2Path = clzz.getResource("photo1.jpg").getPath();
	 * 
	 * 여기서 getPath()는 URL(URL은 클래스타입이다) 객체의 메소드로 절대 경로를 리턴한다. 실습을 통해서 확인해보자.
	 * getResource 는 자원의 개한 정보를 가지고 있고 이를 getPath로 전체 경로를 가져온다.
	 * 
	 */


public class GetResourceExample {

	public static void main(String[] args) {
		
		Class clazz = Car.class; //car 클래스와 동일한 위치에 있는 파일을 불러온다.
		
		String photo1Path = clazz.getResource("image_1.jfif").getPath(); //찾는다면 getPath로 전체 경로를 가져온다.
		String photo2Path = clazz.getResource("images/image_1.jfif").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}

}
/*
 * 자바도 윈도우 프로그램읆 만들수 있다. 자바 스윙이나 자바fx로 윈도우 프로그램을 만들때 고정적인 이미지나
 * 바뀌지 안는 이미지 같은경우 바이트 코드와 같이 저장을 한다. 그래서 특정 클래스를 기준으로 어디있는지 상대결로로 표현을 해주면
 * 운영체제의 전체경로가 나온다 전체경로는 파일안에 있는 데이터를 읽을떄 사용된다.
 * 
 */
