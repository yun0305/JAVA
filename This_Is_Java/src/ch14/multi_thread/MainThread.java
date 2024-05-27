package ch14.multi_thread;

/*
 * <메인 스레드>
 * 모든 자바 프로그램은 메인스레드가 main() 메소드를 실행하면서 시작된다. 메인 스레드는 main()메소드의
 * 첫 코드부터 순차적으로 실행하고, main메소드의 마지막 코드를 실행하거나 return문을 만나면 실행을 종료한다.
 * 
 * 메인 스레드는 필요에 따라 추가 작업 스레드들을 만들어서 실행시킬 수 있다.
 * 
 * 싱글 스레드에서는 메인 스레드가 종료되면 프로세스도 종료된다. 하지만 멀티 스레드에서는 실행 중인 스레드가 하나라도
 * 있다면 프로세스는 종료되지 않는다. 메인 스레드가 작업 스레드보다 먼저 종료 되더라도 작업 스레드가 계속 실행 중이라면 프로세스는
 * 종료되지 않는다.
 *  
 *  
 */

public class MainThread {
	
	
	public static void main(String[] args) {
	 System.out.println("시작");
	 
	 //자바에서는 스레드도 하나의 객체로 관리한다.
	 Thread currThread = Thread.currentThread();
	 //현제 이 코드를 실행하는 쓰레드 객체를 참조하는 법 Thread.currentThread(); 현재 쓰레드의 개체를 얻어옴 
	 System.out.println(currThread.getName());
	 //현재 쓰래드의 이름을 출력해보자.
	 //해보면 main이라는 이름이 나온다.
	 //그래서 만약 오류가 발생하면 오류 코드에 in main Thread라고 나온다.
			 
			 
	 System.out.println("종료");
	 
	}
}
