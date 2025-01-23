package ch08._interface.static_method;

public interface RemoteControl {
	
	//정적 메소드
	/*
	 * 인터페이스에는 정적 메소드도 선언이 가능하다, 추상 메소드와 디폴트 메소드는 구현 객체가 필요하지만, 
	 * 정적 메소드는 구현 객체가 없어도 인터페이스만으로 호출할 수 있다. 선언 방법은 클래스 정적 메소드와
	 * 완전히 동일하다 public 을 생략 하더라도 자동으로 컴파일 과정에서 붙는 것이 차이점이다.
	 * [public|private] static 리턴타입 메소드명(매개변수,...){	}
	 * 그리고 구현객체에서 재정의할 대상이 아니다.
	 
	 */
	
	//상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void trunOn();
	void trunOff();
	void setVolume(int Volume);
	int getVolume();
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리 합니다");
			//추상 메소드 호출하면서 상수 필드 사용
			setVolume(MIN_VOLUME);
			
		}
		else {
			System.out.println("무음을 해제합니다");
		}
	}
	//정적 메소드
	static void changeBattery() {//인터페이스 소속
		System.out.println("리모컨 건전지를 교환합니다.");
	}
	
	/*추가필기
	 *
	 * 오라클 공식문서에서는 static 메소드를 인터페이스 에서 helper 메소드로
	 * 사용하는 예시를 들고 있습니다 여기서 말하는 helper 메소드는 주목적으로서 사용되는것이 아닌, 다른
	 * 객체를 돕기 위해 특정 목적으로 만들어진 메소드 입니다 이러한 이유는 클래스의 stiatc 메소드처럼 사용하기 보다는,
	 * 인터페이스 내부적으로 필요한 것을 정의 해두고 사용하는데 목적이 있다고 추측됩니다.
	 * 구현이 강제 되지 않습니다.
	 * 
	 */
	
	
}
