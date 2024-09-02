package ch07.polymorphism;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		
		
		car.tire = new Tire();
		car.run();
		
		car.tire = new HankookTire();
		car.run();
		
		car.tire = new KumhoTire();
		car.run();
		

	}

}
