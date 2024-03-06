package ch09.Anonymous.Anonymous_Example;

public class Main {

	public static void main(String[] args) {
		
		//버튼 객체 생성
		Button okBt = new Button();
		
		//버튼 클릭 이벤트 처리 클래스(Listener 객체) 정의
		
		okBt.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("ok버튼이 클릭되었습니다.");
				
			}
		});
		
		okBt.click();
		Button canCelBt = new Button();
		
		canCelBt.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("취소 버튼을 누릅니다");
				
			}
		});
		canCelBt.click();
		
	
		Button bt = new Button();
		
		bt.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("시스템 종료");
				
			}
		});
		
		bt.click();
	}

}
