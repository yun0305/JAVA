package ch07._abstract.override_abstrct;

public class Cat extends Animal{

	public Cat() {
		this.kind = "포유류";
	}

	@Override
	void sound() {
		System.out.println("냐옹");
		
	}
	
	
	

}
