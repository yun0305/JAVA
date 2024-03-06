package ch06.member;

public class Static_Block {
	
	boolean remocon;
	static String company = "My Company";
	static String model = "LCD";
	static String info;
	
	static {// 정적 블록은 정적 필드에서 초기화 할수 없는 복잡한 계산식을 작성할때 초기화 해주기 위해 사용한다
		System.out.println(1);
	}
	static {
		System.out.println(2);
		info = company +"-"+ model;
	}
	
	void on(boolean Switch) {
		
		this.remocon = Switch;
		
		if(remocon) {
			System.out.println("화면을 켭니다");
		}
		else {
			System.out.println("화면을 끕니다");
		}
	
	
	
	}
	
	
}

