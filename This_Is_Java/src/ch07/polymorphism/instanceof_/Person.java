package ch07.polymorphism.instanceof_;

public class Person {

	public String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	//메소드 선언
	public void walk() {
		System.out.println("겉습니다.");
	}
}
