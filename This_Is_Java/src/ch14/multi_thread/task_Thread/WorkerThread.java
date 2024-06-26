package ch14.multi_thread.task_Thread;

/*
 * 작업 스레드 객체를 생성하는 또다른 방법은 Thread의 자식 객체로 만드는 것이다. Thread 클래스를 상속한 다음
 * run()메소드를 재정의해서 스레드가 실행할 코드를 작성하고 객체를 생성하면 된다.
 * 
 * *주의*
 * 여기서 주의할 할점은 Thread 클래스로 재정의 하는 run()메소드는 Runnable 인터페이스가 가지고 있는 run()이
 * 아니라 Thread가 가지고 있는 별개의 메소드다 하지만 똑같다.
 * 
 * 작업 스레드를 실행하는 방법은 동일하다. start() 메소드를 호출하면 작업 스레드는 재정의 된 run()을 실행 시킨다.
 * 
 * 
 */

//명시적 스레드 작성
public class WorkerThread extends Thread{
	
	@Override
	public void run() {
		//스레드가 실행할 코드
	}
	
	public static void main(String[] args) {
		//명시적 스레드 사용
		Thread thread01 = new WorkerThread();
		
		thread01.start();// 스레드 실행
		
		//익명객체로 스레드 생성
		Thread thread02 = new Thread() {
			@Override
			public void run() {
				//스레드가 실행할 코드
			}
		};
	
		
		thread02.start();//스레드 실행
		
		
	}
	
	
}
