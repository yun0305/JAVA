package ch07.class_extends;

public class SmartPhone extends Phone{
	
	private boolean wifi;

	public SmartPhone(String model,String color) {
		this.setColor(color);//private로 선언되면 자식클래스로 직접 접근이 안된다(검증완료)
		this.setModel(model);
	}
	
	//메소드 선언 
	//이미 전화기의 기본적인 기능이나 속성은 Phone 클래스에 정의했고 그걸 상속 받았으니까
	//여기서는 SmartPhone에 대한 메소드나 필드만 선언해 주면 된다
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
		
		
		
	}
	
	public boolean isWifi() {
		return wifi;
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");	
	}
}
