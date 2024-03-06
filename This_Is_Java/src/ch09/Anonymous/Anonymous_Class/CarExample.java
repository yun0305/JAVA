package ch09.Anonymous.Anonymous_Class;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.run1();
		
		car.run2();
		
		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 객체3이 굴러갑니다.");	
			}
		});
		
	}

}
