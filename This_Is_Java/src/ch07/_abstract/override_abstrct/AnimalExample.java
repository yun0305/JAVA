package ch07._abstract.override_abstrct;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
	
		animalSound(cat);
		animalSound(dog);						
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
		Animal.test();// 추상 클래스 소속 정적메소드 호출
	}
	
}
