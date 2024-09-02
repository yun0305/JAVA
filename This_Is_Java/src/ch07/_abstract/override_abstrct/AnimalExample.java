package ch07._abstract.override_abstrct;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
			
		Animal A = dog;
	
		animalSound(cat);
		animalSound(dog);						
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
		
	}
	
}
