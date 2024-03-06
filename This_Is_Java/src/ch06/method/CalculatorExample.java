package ch06.method;

public class CalculatorExample {

	public static void main(String[] args) {

		//객체 생성
		Calculator cal = new Calculator();
		//리턴값없는 메소드 호출
		cal.powerOn();
		//리턴값이 있는 메소드 호출
		int result = cal.plus(5,6);//변수에 넣어서 출력해줘도 되고 바로 print메소드로 출력해 줘도 된다 
		System.out.println(result);
		int x = 10;
		int y = 4;
		//divide() 메소드 호출 시 변수 x와 y의 값을 매개값으로 제공하고,
		//나눗셈 결과를 리턴 받아 result2 변수에 대입
		double result2 = cal.divide(x, y);
		System.out.println(result2);
		//리턴값 없는 메소드 호출
		cal.powerOff();

	}

}
