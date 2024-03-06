package ch08._interface.multiple_interface_다중구현;

public class SmartTelevision implements RemoteControl,Searchable{
	
	
	@Override
	public void trunOn() {
		System.out.println("TV를 킵니다");		
	}

	@Override
	public void trunOff() {
		System.out.println("TV를 끕니다");
		
	}

	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
		
	}
	
}
