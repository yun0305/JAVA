package ch06.method;

public class ComputerExampel {

	public static void main(String[] args) {
		//객체생성
		Computer myCom = new Computer();
		//sum메소드 호출 시 매개값 1, 2, 3을 제공하고 합산 결과를 리턴받아 result 변수에 대입
		int result1 = myCom.sum(1,2,3);
		System.out.println("result1 : "+result1);
		//sum() 메소드 호출시 매개값 1,2,3,4,5를 제공하고
		//합산 결과를 리턴받아 result2 변수에 대입
		int result2 = myCom.sum(1,2,3,4,5);
		System.out.println("result2 : "+result2);
		//sum() 메소드 호출시 배열 제공하고
		//합산 결과를 리턴받아 result3 변수에 대입
		int[] values = new int[] {1,2,3,4,5};
		int result3 = myCom.sum(values);
		System.out.println("result3 : "+result3);
		//sum() 메소드 호출시 배열 제공하고
		//합산 결과를 리턴받아 result3 변수에 대입
		int result4 = myCom.sum(new int[] {1,2,3,4,5});
		System.out.println("result3 : "+result3);
	}

}
