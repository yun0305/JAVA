package ch09.Anonymous.Anonymous_Class;

public class Car {
	
	//필드값
	private Tire tire1 = new Tire();
	private Tire tire2 = new Tire() {
		
		@Override
		public void roll() {
			System.out.println("익명자식 객체2가 실행됩니다.");
		} 
		public void test() {
			 System.out.println("테스트 메소드가 실행되었습니다.");
		}
		
	};
	
	public void run1() {
		tire1.roll();
		tire2.roll();
//		tire2.test();사용불가 현재 익명 객체는 자식 객체라서 익명 자식 객체가 가지고있는 멤버는 사용불가
//		익명 자식 객체에 새롭게 정의된 필드와 메소드는 익명 자식 객체 내부에서만 사용되고 외부에서는 접근할수 없다
//		자식객체가 부모 타입에 대입되기 때문에 부모 타입에 선언된 필드와 메소드만 접근할수 있기 때문이다.
		
		
	}
	
//---------------------------------------------------------------
	//로컬변수
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 객체2가 굴러갑니다.");
			
			}
		};
		
		tire.roll();
	}
//---------------------------------------------------------------	
	//매개변수
	public void run3(Tire tire) {
		
		tire.roll();
		
	}
	
}
