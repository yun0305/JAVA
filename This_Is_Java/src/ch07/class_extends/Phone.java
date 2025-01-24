package ch07.class_extends;

public class Phone {

	/*<주의>
	 * 상속은 인스턴스 기반 즉 객체 기반의 개념이다.
	 * 
	 * static 메소드와 static 필드는 상속의 대상이 아니다.
	 * 왜냐면 클래스 수준에서 관리가 되기때문에 인스턴스 기반의 상속
	 * 개념과는 별도로 취급된다.
	 * 
	 * private 접근제한자를 가지면 자식 클래스에서 직접 접근할수 없다.
	 * 상속 자체는 되지만, 자식 클래스에서 직접 사용할 수 없다.
	 * 간접적으로는 부모 클래스에 다른 public protected 메소드로 private 멤버에 접근할수 있다.
	 * ex)getter/setter 메소드
	 * 
	 * 정확히 말하면 직접 접근만 안되는거지 상속은된다.
	 * 
	 * 결론적으로 상속의 대상이 되는 것은 클래스와 그 안의 필드, 메소드이고,
	 * 생성자와 private 요소, 그리고 static 요소는 상속이 직접적으로 되지 않는다.
	 */
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

