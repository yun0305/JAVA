package ch08._interface.interface_type_conversion.casting_converstion_interface;

public interface Vehicle {

	/*//강제 타입 변환
	 * 강제 타입 변환은 캐스팅 기호를 사용해서 인터페이스 타입을 구현 클래스 타입으로 변환 시키는 것을 말한다.
	 * 구현 객체가 인터페이스 타입으로 자동 변환되면, 인터페이스에 선언된 메소드만 사용가능하다.
	 * RemoteControl 인터페이스에 3개의 메소드가 있고 Television 클래스에는 5개의 메소드가 있다면
	 * RemoteControl 인터페이스로 호출 가능한 3개의 메소드만 호출 가능하다.
	 * 
	 * 자동 타입 변환 후에 Television에만 정의된 2개의 메소드를 호출하고 싶다면 다음과 같이 캐스팅 기호를 사용해서
	 * 원래 Television으로 강제 타입 변환 해야 한다.
	 * 
	 * 
	 */
	
	//인터페이스 추상 메소드
	
	void run();
	
}
