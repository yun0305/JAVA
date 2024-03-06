package ch06.member;

public class Car_Instance_Example {
	
	public static void main(String[] args) {
		Car_Instance cie1 = new Car_Instance("포르쉐");
		Car_Instance cie2 = new Car_Instance("벤츠");
		double result = Car_Instance.pi;
		cie1.run();
		cie2.run();
	}
}
