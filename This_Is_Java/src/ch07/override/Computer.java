package ch07.override;

public class Computer extends Calculator {
	
	//Ctrl space바를 누르면 재정의 할수있는 메소드가 뜬다
	
	/*
	 * 매개변수도 같아야한다 매개변수의 이름은 달라도 되지만 타입이 같아야 하고 매개변수에 다른 변수를 추가하면
	 * 컴파일 오류가뜬다 아니면 오버로딩을 해서 부모 메소드에 다른 메소드를 추가해 줘야한다//
	 */
	@Override 
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle 실행");
		return Math.PI*r*r;
	}
	
}
