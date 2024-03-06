package ch08._interface;

public class Television implements RemoteControl {

	@Override//어노테이션은 정확히 재정의 되었는지 확인 시켜준다 만약 철자가 틀리면 오류가 뜬다
	public void turnOn() {// 기본 public, 재정의 할떈 접근 제한자를 더 강하게 할수 없다.
		System.out.println("TV를 켭니다.");
		
	}
	
	public void test() {
		System.out.println("인터페이스로 재정의 받은 메소드가 아니라 구현객체에서 정의한 메소드");
	}
	
	/*
	 * 인터페이스도 하나의 타입이므로 변수의 타입으로 사용할 수 있다.
	 * 인터페이스는 참조 타입에 속하므로 인터페이스 변수에는 객체를 참조하고 있지 않다는 뜻으로 null을
	 * 대입할수 있다.
	 * 
	 * RemoteControl rc;
	 * RemoteControl rc = null;
	 * 
	 * 인터페이스를 통해 구현 객체를 사용하려면, 인터페이스 변수에 구현 객체를 대입해야 한다.
	 * 정확히 말하면 구현 객체의 번지를 대입해야 한다. 다음은 Television 객체를 생성하고 번지를
	 * 대입하는 코드이다.
	 * 
	 * rc = new Television();
	 * 
	 * 만약 Television 이 implements Remortcontrol로 선언되지 않았다면 Remotecontrol 타입의
	 * 변수 rc에
	 * 대입할 수 없다.(구현 객체가 아니면 사용 할수 없다는 뜻이다)
	 * 인터페이스 변수에 구현 객체가 대입이 되었다면 변수를 통해 인터페이스의 추상 메소드를 호출할수 있게
	 * 된다.
	 * 
	 * rc.turnOn();
	 * 
	 * 인터페이스 변수를 통해 turnOn() 메소드가 호출되면, 실제로 실행되는 것은 Television에서 재정의된 
	 * turnOn() 메소드이다
	 * 이를 확인해 보기 위해 RemoteControlExample을 작성하고 실행해보자.
	 */
	
}
