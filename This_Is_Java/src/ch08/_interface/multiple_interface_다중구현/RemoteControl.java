package ch08._interface.multiple_interface_다중구현;

public interface RemoteControl {

	/*
	 * 구현 객체는 여러개의 인터페이스를 implements할 수 있다. 구현 객체가 인터페이스 A와
	 * 인터페이스 B를 구현하고 있다면, 각각의 인터페이스를 통해 구현 객체를 사용할 수 있다.
	 * 
	 * 구현 클래스는 다음과 같이 인터페이스 A와 인터페이스 B를 implements 뒤에 쉼표로 구분해서
	 * 작성한다. 모든 인터페이스가 가진 추상 메소드를 재정의 한다.
	 *  
	 * 예) public class 구현 클래스명 implements 인터페이스A, 인터페이스B{
	 * 	//모든 추상 메소드 재정의
	 *}
	 *  
	 */
	
	//추상 메소드
	void trunOn();
	void trunOff();
}
