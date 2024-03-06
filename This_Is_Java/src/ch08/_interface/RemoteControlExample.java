package ch08._interface;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl tvRc = new Television();
		// 인터페이스 타입에 implements한 구현객체 Television 대입
		//의미적으로 해석하면 인터페이스로 Television 객체를 사용한다로 해석하면 된다
		//tvRc.test(); 사용불가 현재 tvRc는 인터페이스 타입이다 구현객체에서 재정의된 메소드만 호출 가능하다.
		//사용해주려면 tvRc를 구현객체 타입으로 형변환 해줘야 한다
		Television tv = (Television)tvRc;//인터페이스 다운캐스팅
		tv.test();//구현객체에에서 생성한 메소드
		tv.turnOn();// 구현객체 안에 인터페이스를 통해 재정의 받은 메소드는 인터페이스 없이 사용할수도 있다.
					// 왜냐면 재정의한 메소드도 구현객체 소속이니까
		
		RemoteControl adRc = new Audio();
		controler(tvRc);
		controler(adRc);
	}

	public static void controler(RemoteControl rc) {
		rc.turnOn();
	}
	
}
