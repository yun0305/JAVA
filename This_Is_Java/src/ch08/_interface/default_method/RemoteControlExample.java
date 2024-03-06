package ch08._interface.default_method;

public class RemoteControlExample {

	public static void main(String[] args) {
		//인터페이스 변수 선언
		RemoteControl rc = new Television();
		
		//Television 객체를 생성하고 인터페이스 변수에 대입
		
		rc.trunOn();
		rc.setVolume(5);
		rc.trunOff();
		
		//디폴트 메소드 대입
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		//Audio객체를 생성하고 Rc에 대입
		
		rc = new Audio();
		
		rc.trunOn();
		rc.setVolume(7);
		rc.trunOff();
		
		//디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);//재정의된 setMute();		

	}

}
