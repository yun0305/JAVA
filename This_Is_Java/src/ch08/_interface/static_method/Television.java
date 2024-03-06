package ch08._interface.static_method;

public class Television implements RemoteControl {

private int volume;
	
	@Override//추상 메소드
	public void trunOn() {
		System.out.println("tv를 켭니다");
		
	}

	@Override//추상 메소드
	public void trunOff() {
		System.out.println("tv를 끕니다");
		
	}

	@Override//추상 메소드
	public void setVolume(int Volume) {
		if(Volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(Volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = Volume;
		}
		
		System.out.println(" 현재 tv 볼륨 " + Volume );
		
	}
	
	
	@Override
	public int getVolume() {
		return volume;
	}
}
