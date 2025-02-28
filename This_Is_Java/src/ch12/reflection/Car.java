package ch12.reflection;

	/*
	 *<자바 리플렉션>
	 *		실행시간(Runtime)에 클래스, 메소드, 필드, 등의 정보를 조회하고 수정할 수 있는 기능
	 *		컴파일 타임이 아니라 실행 중에 동적으로 클래스의 구조를 분석하고 조작할 수 있음
	 *		주로 프레임 워크에서 객체를 동적으로 생성하고 메소드를 호출할 때 사용 
	 * 
	 * 
	 * <멤버 정보 얻기>
	 * 타입(클래스. 인터페이스)가 가지고 있는 멤버 정보는 다음 메소드를 통해 얻을 수 있다.
	 * 
	 * 메소드										용도
	 * Constructor[] getDeclaredConstructors()  생성자 정보 읽기
	 * 				 getConstructor()			public 접근제어자를 가진 생성자만 가져옴 
	 * 
	 * Field[] getDeclaredFields()				필드 정보 읽기
	 * 		   getField()						public 접근제어자를 가진 field만 가져옴
	 * 
	 * Method[] getDeclaredMethod()				메소드 정보 읽기	
	 * 			getMethod()						public 접근제어자를 가진 method만 가져옴
	 * 
	 * 
	 * 
	 * 메소드 이름에서 알 수 있듯이 각각 Constructor 배열, Field 배열, Method 배열을 리턴한다.
	 * Constructor, Field, Method 클래스는 모두 java.lang.reflect 패키지에 있는데 각각 생성자, 필드,
	 * 메소드에 대한 선언부 정보를 제공한다. 다음은 Car 클래스에서 선언된 생성자, 필드, 메소드의 선언부 정보를
	 * 얻고 출력하는 예제이다.
	 */
public class Car {
	
	//필드
	private String model;
	private int owner;
	
	//생성자
	public Car() {
		
	}
	
	public Car(String model,int owner) {
		this.model = model;
		this.owner = owner;
	}
	
	//메소드
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getOwner() {
		return owner;
	}
	
	public void setOwner(int owner) {
		this.owner = owner;
	}
	
	
}
