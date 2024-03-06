package ch06.object;

public class CarExample {

	public static void main(String[] args) {
		
		//Car 객체 생성
		Car mycar = new Car("그랜져",60,true);
		//Car 객체의 필드값 읽기
		System.out.println("모델명: "+mycar.model);
		System.out.println("시동여부: "+mycar.start);
		System.out.println("현재속도: "+mycar.speed);
		mycar.speed = 60;
		System.out.println(mycar.speed);
		
	}

}
