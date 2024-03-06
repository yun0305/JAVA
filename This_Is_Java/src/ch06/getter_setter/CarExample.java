package ch06.getter_setter;

public class CarExample {

	public static void main(String[] args) {
		//객체생성
		Car car = new Car();
		//잘못된 속도 변경
		car.setSpeed(-50);
		System.out.println("현재 속도: " + car.getSpeed());
		//올바른 속도 변경
		car.setSpeed(60);
		System.out.println("현재 속도: " + car.getSpeed());
		//멈춤
		if(!car.isStop()){
			car.setStop(false);
			System.out.println("현재 속도: " + car.getSpeed());
		}
		else {
			System.out.println("현재 속도: " + car.getSpeed());
		}
	}



}
