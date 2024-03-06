package ch07.class_extends._final;

public class SportCar extends Car {

	@Override
	public void speedUp() {
		
		speed += 10;
		
	}
	//@Override// fianal을 붙여줘서 재정의(오버라이딩)을 할수 없다
	/*public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}*/
		
	
}
