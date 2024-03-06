package ch08._interface.abstract_method;

public interface RemoteControl {

	int MAX_VOLUME = 10;//인터페이스에서 선언된 모든 필드는 상수이다.
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
