package ch07.polymorphism;

public class Car {
	
	/* 필드의 다형성
	 * 다형성은 메소드의 오버라이딩과 형변환으로 설명이 가능하다
	 */
	public Tire tire;
	
	
	public void run() {
		
		tire.roll();
		
	}
	
}
