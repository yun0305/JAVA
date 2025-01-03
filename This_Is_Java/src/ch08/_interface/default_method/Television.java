package ch08._interface.default_method;

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
	
	
		@Override//추상 메소드
		public int getVolume() {
			return volume;
		}
	
		@Override//디폴드 메소드 재정의 가능
		public void setMute(boolean mute) {
			// TODO Auto-generated method stub
			RemoteControl.super.setMute(mute);
		}
	
	

}
