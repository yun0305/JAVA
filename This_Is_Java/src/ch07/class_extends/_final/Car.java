package ch07.class_extends._final;

public class Car {
	
	//final 클래스 final 메소드

	/*
	 * class에 final을 붙이면 상속을 할수 없게 막아준다
	 * 메소드에 붙여주면 오버라이딩을 할수 없다
	 */
	
	//필드 선언
	public  int speed;
	
	//메소드 선언
	public void speedUp() {
		speed += 1;
	}
	
	//final메소드 선언
	public final void stop() {// 순서:  접근제한자 정적유무 final 리턴타입 메소드명 
		System.out.println("차를 멈춤");
		speed = 0;
	}
	
}
