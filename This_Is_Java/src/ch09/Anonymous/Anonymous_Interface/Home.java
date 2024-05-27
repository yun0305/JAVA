package ch09.Anonymous.Anonymous_Interface;

public class Home {
	
	private RemoteControl rc = new RemoteControl(){//선언명을 보면 인터페이스지만 엄연히 익명구현객체이다.
		
		@Override
		public void turnOff() {
			System.out.println("Tv를 끕니다");
			
		}@Override
		public void turnOn() {
			System.out.println("Tv를 켭니다");
			
		}
		
	};
	
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use2() {
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOff() {
			System.out.println("에어컨을 끕니다");	
				
			}
			@Override
			public void turnOn() {
				System.out.println("에어컨를 켭니다");
				
			}
		};
		
		rc.turnOn();
		rc.turnOff();
		
	}
	
	public void use3(RemoteControl rc) {
		
		rc.turnOn();
		rc.turnOff();
		
	}
	
}
