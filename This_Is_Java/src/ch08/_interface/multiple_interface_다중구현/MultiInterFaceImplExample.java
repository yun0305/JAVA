package ch08._interface.multiple_interface_다중구현;

public class MultiInterFaceImplExample {

	public static void main(String[] args) {
		
		//RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
		RemoteControl rc = new SmartTelevision();
		//RemoteControl 인터페이스에 선언된 추상 메소드만 호출 가능
		rc.trunOn();
		rc.trunOff();
		
		//Searchable 인터페이스 변수 선언 및 구현 객체 대입
		Searchable Searchable = new SmartTelevision();
		//Searchable 인터페이스에 선언된 추상 메소드만 호출 가능
		Searchable.search("https://youtube.com");
		
		
		
		
		
	}

}
