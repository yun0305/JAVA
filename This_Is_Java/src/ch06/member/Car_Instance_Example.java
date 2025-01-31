package ch06.member;

import ch06.member.메모리에서_메소드_실행과정.Car_Instance;

public class Car_Instance_Example {
	
	public static void main(String[] args) {
		
		Car_Instance cie1 = new Car_Instance("포르쉐");
		Car_Instance cie2 = new Car_Instance("벤츠");
		double result = Car_Instance.pi;
		cie1.run();
		cie2.run();
		
	}
}
