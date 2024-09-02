package ch07._abstract.override_abstrct;

public abstract class Animal {
	
	public String kind;
	
	public void berathe() {
		System.out.println("숨을 쉽니다");
	}
	
	abstract void sound();//추상 메소드
	
	
}
