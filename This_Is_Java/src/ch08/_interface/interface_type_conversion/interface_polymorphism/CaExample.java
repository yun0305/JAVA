package ch08._interface.interface_type_conversion.interface_polymorphism;

public class CaExample {

	public static void main(String[] args) {
		//자동차 객체 실행
		Car car = new Car();
		
		//run() 메소드 실행
		
		//타이어 객체 교체
		car.tire1 = new KumhoTire();
		car.tire2 = new HankookTire();
		
		
		//run()메소드 실행
		car.run();
		
		
	}

}
