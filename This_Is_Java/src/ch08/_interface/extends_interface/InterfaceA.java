package ch08._interface.extends_interface;

public interface InterfaceA {

	/*
	 * 자바에서는 다중 상속을 허용하지 않는다 하지만 인터페이스에서는 허용한다
	 * 
	 * 인터페이스도 다른 인터페이스를 상속 할수 있으며 클래스와는 달리 다중 상속을 허용한다.
	 * 다음과 같이 extends 키워드 뒤에 상속할 인터페이스들을 나열하면 된다.
	 * 
	 * public interface 자식인터페이스 extends 부모인터페이스1, 부모인터페이스2{...}
	 * 
	 * 자식 인터페이스의 구현 클래스는 자식 인터페이스의 메소드 뿐만 아니라 부모 인터페이스의 모든 추상 메소드를
	 * 재정의한다. 그리고 구현 객체는 다음과 같이 자식 및 부모 인터페이스 변수에 대입 될 수 있다.
	 * 
	 * 자식인터페이스 변수 = new 구현 클래스(...);
	 * 부모인터페이스1 변수 = new 구현 클래스(...);
	 * 부모인터페이스2 변수 = new 구현 클래스(...);
	 * 
	 * 구현 객체가 자식 인터페이스 변수에 대입되면 자식 및 부모 인터페이스에 추상 메소드를 모두
	 * 호출 할수 있으나, 부모 인터페이스 변수에 대입되면 부모 인터페이스에 선언된 추상 메소드만 호출 가능하다.
	 * 다음 예제를 통해 알아보자
	 * 
	 * 추상 메소드와 디폴트 메소드 정적메소드는 상속의 대상이된다.
	 * private 메소드와 인터페이스 필드는 상속 대상이 아니다 
	 */
	
	//추상 메소드
	void methodA();
	
}
