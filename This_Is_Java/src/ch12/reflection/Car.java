package ch12.reflection;

	/*
	 * <멤버 정보 얻기>
	 * 타입(클래스. 인터페이스)가 가지고 있는 멤버 정보는 다음 메소드를 통해 얻을 수 있다.
	 * 
	 * 메소드										용도
	 * Constructor[] getDeclaredConstructors()  생성자 정보 읽기
	 * Field[] getDeclaredFields()				필드 정보 읽기
	 * Method[] getDeclaredMethod()				메소드 정보 읽기	
	 * 
	 * 메소드 이름에서 알 수 있듯이 각각 Constructor 배열, Field 배열, Method 배열을 리턴한다.
	 * Constructor, Field, Method 클래스는 모두 java.lang.reflect 패키지에 있는데 각각 생성자, 필드,
	 * 메소드에 대한 선언부 정보를 제공한다. 다음은 Car 클래스에서 선언된 생성자, 필드, 메소드의 선언부 정보를
	 * 얻고 출략하는 예제이다.
	 */
public class Car {
	
	//필드
	private String model;
	private String owner;
	
	//생성자
	public Car() {
		
	}
	
	public Car(String model) {
		this.model = model;
	}
	
	//메소드
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}
