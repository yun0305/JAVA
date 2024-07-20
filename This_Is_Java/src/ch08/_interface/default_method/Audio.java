package ch08._interface.default_method;

public class Audio implements RemoteControl {

	private int volume;
	
	@Override//추상 메소드
	public void trunOn() {
		System.out.println("오디오를 켭니다");
		
	}

	@Override//추상 메소드
	public void trunOff() {
		System.out.println("오디오를 끕니다");
		
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
		
		System.out.println(" 현재 Audio 볼륨 " + Volume );
		
	}
	
	
	@Override
	public int getVolume() {
		return volume;
	}



	private int memoryVolume;// 추가 필드 선언
	
	@Override//디폴트 메소드
	/*
	 * 재정의한 디폴트 메소드는 인터페이스에 있는 디폴트 메소드를 숨기고 재정의한 디폴트 메소드를 호출한다
	 * default 메소드는 구현을 강제하지 않는다
	 * 재정의는 가능
	 */
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리 합니다");
			setVolume(RemoteControl.MIN_VOLUME);
		}
		else {
			System.out.println("무음해제");
			setVolume(this.memoryVolume);//mute가 false일 경우 원래 볼륨으로 복원하는 코드
		}
		
	}

}
