package ch08._interface.abstract_method;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		/*
		 * 인터페이스의 사용 방법은 같다 어떤 객체를 사용하냐의 따라서 결과가 달라진다.
		 * 하지만 지금 해본 예제처럼 사용하는 경우는 없다 앞으로 다형성을 배울건데 예전에 배운 다형성의 형태로 사용된다
		 * 지금해본건 기본적인 사용 방법이다 
		 */
		
		/*
		 * 인터페이스로 구현 객체를 사용하려면 다음과 같이 인터페이스 변수를 선언하고 구현 객체를 대입해야 한다
		 * 인터페이스의 변수는 참조 타입이기 때문에 구현 객체가 대입되면 구현 객체의 번지를 저장한다.
		 * 
		 *  구현 객체가 대입되면 인터페이스 변수로 추상 메소드를 호출할 수 있게된다 이때 어떤 구현
		 *  객체가 대입되었는지에 따라
		 *  실행 내용이 달라진다. Television이 대입되었다면 Television 의 재정의된 메소드가,
		 *  Audio가 대입되었다면 Audio에
		 *  재정의된 메소드가 실행된다. 
		 */
		
		RemoteControl rc = new Television();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		

	}

}
