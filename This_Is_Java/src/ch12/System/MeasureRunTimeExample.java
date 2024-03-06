package ch12.System;
	
	/*
	 * System 클래스의 currentTimeMillis(10의-3승) 메소드와 nanoTime(10의-9승) 메소드는 1970년 1월 1일 0시 부터 시작해서
	 * 현재까지 진행된 시간을 리턴한다.
	 * 
	 * 이 두 메소드는 프로스램 처리 시간을 측정하는 데 주로 사용된다. 프로그램 처리를 시작할 때 한번 끝날때 한번 읽어서
	 * 그 차이를 구하면 프로그램 처리 시간이 나온다. 다음 예제는 for문을 사용해서 1부터 100000꺼지의 합을 구하는데 걸리는 시간을
	 * 출력한다
	 * 
	 */
public class MeasureRunTimeExample {

	public static void main(String[] args) {
		
		int sum = 0;
		long temp1 = System.currentTimeMillis();
		
			for(int i=1;i<=100000;i++) {
				sum += i;
			}
		long temp2 = System.currentTimeMillis();
		
		System.out.println("1~100000까지합");
		System.out.println("계산에"+(temp2-temp1)+"밀리초가 소요되었습니다.");

	}

}
