package ch06.method;

public class Calculator {
		//리턴값없는 메소드 선언
		/*
		 * 반환해야 하는 값이 없는 메소드(실행만 시키는 메소드 전원을 켜고 끈다 예시)
		 * 숫자만 더하고 값은 리턴시키지 않을경우)
		 */
	    void powerOn() {
			System.out.println("전원을 켭니다.");
		}
		void powerOff() {
			System.out.println("전원을 끕니다");
		}
		//호출 시 두 정수 값을 전달받고,
		//호출한 곳으로 결과값 int를 리턴하는 메소드 선언
		int plus(int x,int y) {
			int result = x+y;
			return result;
		}
		
		double divide(int x,int y) {
			double result = (double)x/(double)y;
			return result;
		}
}
