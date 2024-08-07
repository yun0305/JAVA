package ch12.System;

	/*
	 * 운영체제는 실행 중인 프로그램을 프로세스로 관리한다.. 자바 프로그램을 시작하면 JVM 프로세스가 생성되고,
	 * 이 프로세스가 main() 메소드를 호출한다. 프로세스를 강제 종료 하고 싶다면 System.exit(int status); 메소드를
	 * 사용하면 된다.
	 * 
	 * exit() 메소드는 int 매개값이 필요한데, 이 값을 종료 상태값이라고 한다. 종료 상태값으로 어떤 값을 주더라도
	 * 프로세스는 종료되는데 정상 종료일 경우 0, 비정상 종료는 1 또는 -1로 주는것이 관례이다.
	 * 
	 * 
	 * 
	 */


public class ExitExample {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i=0;i<=10;i++) {
			Thread.sleep(1000);
			System.out.println(i);
			if(i==5) {
				System.out.println("프로세스 강제종료");
				System.exit(0);
			}
			
		}

	}

}
