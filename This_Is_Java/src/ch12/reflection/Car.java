package ch12.reflection;

	/*
	 * 자바는 클래스와 인터페이스의 메타 정보를 Class 객체로 관리한다.
	 * 여기서 메타 정보란 패키지 정보, 타입 정보(클래스나 인터페이스의 이름),멤버(생성자, 필드, 메소드) 
	 * 정보 등을 말한다, 이러한 메타 정보를 프로그램에서 읽고 수정하는 행위를 리플렉션 이라고 한다
	 * 프로그램에서 Class 객체를 얻으려면 다음 3가지 방법중 하나를 이용하면 된다.
	 * 
	 * 1. Class clazz = 클래스이름.class;// 클래스로 부터 얻는 방법
	 * 2. Class clazz = Class.forName("패키지...클래스이름");// 클래스로 부터 얻는 방법
	 * 3. Class clazz = 객체참조변수.getClass(); //객체로 부터 얻는 방법
	 * 
	 */


public class Car {

	public static void main(String[] args) {
		
		

	}

}
