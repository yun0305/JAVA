package ch09.Nested_Interpace;

public class Main {

	public static void main(String[] args) {
		
		//버튼 객체 생성
		Button okBt = new Button();
		
		//버튼 클릭 이벤트 처리 클래스(Listener 객체) 정의
		class OkListenner implements Button.ClickListener{
			
			@Override
			public void onClick() {
				System.out.println("버튼을 클릭합니다.");
				
			}
			
		}
		
		okBt.setClickListener(new OkListenner());
		
		okBt.click();
//////////////////////////////////////////////////////////////////////
		
		Button canCelBt = new Button();
		
		class CancelLister implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("창을 닫습니다");
				
			}
		}
		
		canCelBt.setClickListener(new CancelLister());
		canCelBt.click();
		
//////////////////////////////////////////////////////////////////////
		
		
		Button exitBt = new Button();
		
		class exitButton implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("시스템 종료");
				
			}
		}
		
		exitBt.setClickListener(new exitButton());
		exitBt.click();
	}

}
