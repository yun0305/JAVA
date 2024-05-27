package ch09.Nested_Interpace;

public class Button {

	// 내부 인터페이스 선언
	public static interface ClickListener{//버튼 안에서만 사용하기도 하고 굳이 객체 없이 접근해도 된까 static으로한듯
		//추상 메소드선언
		public void onClick();
		
	}
	
	//이 다음은 Button 클래스의 필드이다.
	
	//OOP 
	private ClickListener clockListener;
	
	//OOP setter
	public void setClickListener(ClickListener clockListener) {		
		this.clockListener = clockListener;	
	}
	
	public void click() {
		this.clockListener.onClick();
		
	}
	
}
