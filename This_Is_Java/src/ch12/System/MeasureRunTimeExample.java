package ch12.System;
	
/*
 * System 클래스의 currentTimeMillis() 메소드와 nanoTime() 메소드는 프로그램 실행 시간을 측정하는 데 사용된다.
 * 
 * - currentTimeMillis(): 1970년 1월 1일 0시(UTC)부터의 경과 시간을 밀리초 단위(1ms = 1/1000초)로 반환한다.
 * - nanoTime(): 특정 기준(시스템 부팅 이후 등)에서의 상대적인 시간을 나노초 단위(1ns = 1/1,000,000,000초)로 반환하며,
 *   1970년 1월 1일과는 관계가 없다.
 * 
 * 이 두 메소드는 프로그램 처리 시간을 측정하는 데 유용하다. 프로그램 처리를 시작할 때 한 번, 끝날 때 한 번 호출한 후
 * 두 값의 차이를 구하면 프로그램 실행 시간을 구할 수 있다.
 * 
 * 다음 예제는 for문을 사용하여 1부터 100000까지의 합을 구하는 데 걸리는 시간을 출력한다.
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
