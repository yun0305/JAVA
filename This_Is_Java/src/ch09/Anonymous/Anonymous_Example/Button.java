package ch09.Anonymous.Anonymous_Example;

public class Button {

	
	// 내부 인터페이스 선언
	public static interface ClickListener{
		//추상 메소드선언
		public void onClick();
		
	}
	
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
