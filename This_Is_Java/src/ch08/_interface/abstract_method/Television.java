package ch08._interface.abstract_method;

public class Television implements RemoteControl{
	
	private int volume;
	
	/*
	 * Tellevision 객체를 RemoteControl 인터페이스의 구현객체로 만들겠다
	 *  
	 * 인터페이스가 가지고 있는 추상 메소드 3개를 선언해서 재정의한다
	 * 그러면 Tellevision객체는 메소드 3개를 재정의 함으로서 고유의 특성을 가진다
	 */
	
	
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	
	}
		@Override
	public void turnOff() {
			System.out.println("TV를 끕니다");
		
	}
		
		/*
		 * setVolume 메소드는 볼륨값을 외부에서 매개변수로 받아서 Television 클래스의 필드 volume에 값을 넣어준다
		 * 하지만 RemoteControl 인터페이스에 정의된 최대볼륨은 10이다 그러니까 설계할때 우리는
		 * 최대 볼륨을 10으로 맞춰줄거다.
		 * 외부에서 볼륨값을 10보다 크게 설정한다고 하면 100을 넣어줘도 11을 넣어줘도 볼륨값은 10이 들어가야 하기 때문에
		 * 볼륨값이 인터페이스 상수 필드에 정의된 max 값보다 크면 최대치로 10을 넣어주고
		 * min값보다 작으면 0을 넣어줄 것이다
		 */
		@Override
		public void setVolume(int volume) {
			if(volume > RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			}
			else if(volume<RemoteControl.MIN_VOLUME){
				this.volume = RemoteControl.MIN_VOLUME;
			}
			else {
				this.volume = volume;
			}
			System.out.println("현재 TV 볼륨 :"+this.volume);
		}
		
}
