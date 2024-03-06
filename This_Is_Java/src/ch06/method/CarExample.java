package ch06.method;

public class CarExample {

	public static void main(String[] args) {
		//객체 생성
		Car car = new Car();
		//리턴값이 없는 setGas() 메소드 호출
		car.setGas(5);
		if(car.isLeftGas()) {
			System.out.println("출발합니다.");
			car.run();
		}
			System.out.println("가스를 주입하세요.");

	}

}
