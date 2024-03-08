package ch08._interface;

public interface RemoteControl {

	/*
	 * 인터페이스 선언 
	 * 인터페이스 선언은 class 키워드 대신 interface 키워드를 사용한다. 접근 제한자로는
	 * 클래스와 마찬가지로 같은 패키지 내에서만 사용 가능한 default 키워드와 public 을 붙일수 있다.
	 * 
	 * 중괄호 안에는 인터페이스가 가지는 멤버들을 선언할수 있는데 다음과 같은 종류가 있다
	 * 
	 * 
	 * public static final 상수 필드
	 * public 추상 메소드
	 * pulibc 디폴드 메소드
	 * public|private 정적 메소드
	 * private 메소드 (디폴트와 짝궁 왜냐면 디폴트 메소드 안에서만 호출하고 사용된다. 사용 용도 또한 디폴트의 중복을
	 * 줄이기 위함이다)
	 * private & static 정적 메소드() private 정적 메소드는 정적 메소드 안에 중복 코드를 줄이기 위해서 사용된다.
	 *   
	 *   
	 * 지금 해볼것은 추상메소드를 사용해 볼거다
	 */
	
	//추상메소드 선언
	public void turnOn();// 인터페이스에서 추상메소드는 기본이 public 이다. 그리고 abstract는 생략이 가능하다.
	/*Remortcontol로 turnOn 메소드를 사용할수 있게 해준다 실제 작동하지는 않고
		구현 클래스에서 작동된다 구현 클래스는 인터페이스가 가지고 있는 기능을 그대로 가지고 있어야 한다.
		구현 객체는 인터페이스를 implements 받으면 인터페이스가 가지고 있는 추상 메소드를 받아와서
		재정의 한 다음에 사용한다. 인터페이스에 선언된 추상 메소드는 "모두" 구현객체가 가지고 있어야 한다.
		
		구현 객체 구현 방법 "public class B implements 인터페이스명{}" 인터페이스를 통해서 B라는 객체를 구현하겠다는
		뜻이다.
	*/
	
	
}
