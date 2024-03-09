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
 * 1과 2는 클래스 이름만 가지고 Class 객체로부터 Class객체를 얻는 방법이다.
 * 셋 중 어떤 방법을 사용하더라도 동일한 Class 객체를 얻을 수 있다. 예를 들어, String
 * 클래스의 Class 객체는 다음과 같이 얻을 수 있다.
 * 
 * Class clazz = String.class;
 * 
 * Class clazz = Class.forName("java.lang.String");
 * 
 * String str = "감자바";
 * Class clazz = str.getClass();
 * 
 * <패키지와 타입 정보 얻기>
 * 패키지와 타입(클래스, 인터페이스) 이름 정보는 다음 메소드를 통해 얻을 수 있다.
 * 
 * 메소드						용도
 * Package getPackage()		패키지 정보 읽기
 * String getSimpleName()	패키지를 제외한 타입 이름
 * String getName()			패키지를 포함한 전체 타입 이름
 * 
 * 다음 예제는 Car 클래스의 Class 객체를 얻고, 패키지와 클래스의 이름을 얻어 출력한다.
 * 
 */

public class GetClassExample {

	public static void main(String[] args) {
		
		//how1
		Class clazz = Car.class;
		
		//how2
		//Class clazz = Class.format("ch12.sec11.exam01.Car");
		
		//how3
		//Car car = new Car();
		//Class clazz = car.getClass();
		
		System.out.println("패키지: "+ clazz.getPackage().getName());
		System.out.println("클래스 간단 이름: "+ clazz.getSimpleName());
		System.out.println("클래스 전체 이름: " + clazz.getName());
		
	}

}
