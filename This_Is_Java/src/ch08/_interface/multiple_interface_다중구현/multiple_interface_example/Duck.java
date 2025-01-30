package ch08._interface.multiple_interface_다중구현.multiple_interface_example;

public class Duck implements Bird {

	/*
	 * Duck 클래스는 Bird 를 구현하는데 
	 * Bird와 flyable과 swimmalble 인터페이스를 동시에 구현한다.
	 * Duck 클래스는 Bird와 Bird가 상속받은 두 인터페이스에 정의된 모든 메소드를 구현해야 한다.
	 * 
	 * 
	 */
	
	public Duck() {
		fly();
		swim();
		chirp();
	}
	
	@Override
	public void fly() {
		System.out.println("오리 날다");
		
	}

	@Override
	public void swim() {
		System.out.println("오리 수영한다");
		
	}

	@Override
	public void chirp() {
		System.out.println("오리 꿱꿱");
		
	}

	
	
}
