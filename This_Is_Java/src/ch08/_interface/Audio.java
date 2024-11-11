package ch08._interface;

public class Audio implements RemoteControl{
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다");
	
	}
}
