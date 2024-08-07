package ch12.System;

	/*

	 * 자바 프로그램은 운영체제상에서 바로 실행되는 것이 아니라 자바 가상머신 위에서 실행된다.
	 * 따라서 운영체제의 모든 기능을 자바 코드로 직접 접근하기란 어렵다. 하지만 java.lang 패키지에 속하는 
	 * System 클래스를 이용하면
	 * 운영체제의 일부 기능을 이용할 수 있다. 
	 * 
	 * System 클래스의 정적 필드와 메소드를 이용하면 프로그램 종료, 키보드 입력, 콘솔(모니터) 출력, 현재 시간 읽기,
	 * 시스템 프로포티 읽기 등이 가능하다.
	 * 
	 * 정적멤버								용도
	 * 		
	 * 		-out					콘솔 모니터에 문자 출력	
	 * 필드	-err					콘솔 모니터에 에러 내용 출력
	 * 		-in						키보드 입력
	 * 
	 * 		
	 * 		  -exit(int status)			프로세스 종료
	 * 		  -currentTimeMillis()		현재 시간을 밀리초 단위의 long 값으로 리턴
	 * 메소드 -nanoTime()				현재 시간을 나노초 단위의 long 값으로 리턴		
	 * 		  -getProperty()			운영체제와 사용자 정보 제공
	 * 		  -getenv() 				운영채제의 환경 변수 정보 제공
	 * 
	 * 
	 * 콘솔 출력
	 * 
	 * out 필드를 이용하면 콘솔에 원하는 문자열을 출략할 수 있다. err 필드도 out필드와 동일한데, 차이점은 콘솔 종류에 따라
	 * 에러 내용이 빨간색으로 출력된다는 것이다. 다음은 err 필드의 println() 메소드로 에러 내용을 출력하는 예제이다
	 * 
	 * 
	 * 
	 */


public class ErrExample {
	
	public static void main(String[] args) {
		
		try{
			int value = Integer.parseInt("1oo");
		}catch(NumberFormatException e) {
			System.err.println(e.getMessage());
			
		}

	}

}
