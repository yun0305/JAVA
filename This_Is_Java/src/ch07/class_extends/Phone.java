package ch07.class_extends;

public class Phone {

	//필드 선언
	private String model;
	private String color;
	
	//메소드 선언
	public void bell(){
		System.out.println("벨이 울립니다");
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void sendVoice(String message) {
		System.out.println("본인: "+message);
	}
	public void receiveVoice(String message) {
		System.out.println("상대: "+message);
	}
	public void hangup(){
		System.out.println("전화를 끊습니다");
	}
	
}

