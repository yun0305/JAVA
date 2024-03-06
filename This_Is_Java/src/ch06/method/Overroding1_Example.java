package ch06.method;

public class Overroding1_Example {

	public static void main(String[] args) {
		Overroding1 over = new Overroding1();
		double result1 = Overroding1.areaRectangle(10);
		double result2 = over.areaRectangle(10, 20);
		System.out.println("정사각형의 넓이 : "+result1);
		System.out.println("직사각형의 넓이 : "+result2);

	}


}
