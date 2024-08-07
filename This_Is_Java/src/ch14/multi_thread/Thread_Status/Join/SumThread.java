package ch14.multi_thread.Thread_Status.Join;

/*
 * <다른 스레드의 종료를 기다림>
 * 스레드는 다른 스레드와 독립적으로 실행되지만 다른 스레드가 종료될 때 까지 기다렸다가 실행을 해야 하는 경우도
 * 있다. 예를 들어 계산 스레드의 작업이 종료된 후 그 결과값을 받아 처리하는 경우이다.
 * 
 * 이를 위해 스레드는 join() 메소드를 제공한다. ThreadA가 ThreadB의 join() 메소드를 호출하면
 * ThreadA는 ThreadB가 종료할 때까지 일시 정지 상태가 된다,
 * ThreadB의 run() 메소드가 종료되고 나서야 비로소 ThreadA는 일시정지에서 풀려 다음 코드를 실행한다.
 * 
 * 
 * ThreadB의 run()메소드가 종료되고 나서야 비로소 ThreadA는 일시 정지에서 풀려 다음 코드를 실행한다.
 * 
 *  ThreadA{
 *  
 *  threadB.start();
 *  threadB.join();//ThreadA 일시 정지 되고 ThreadB가 끝날때까지 기다린다
 *  //join은 (ThreadA) 입장에서 ThreadB가 끝날때 까지 기다리겠다 라는 의미다. 
 *  }
 * 다음은 SumThread가 계산 작업을 모두 마칠 때까지 메인 스레드가 일시 정지 상태에 있다가 SumThread가 최종 계산된 결과값을 산출하고
 * 종료하면 메인 스레드가 결과값을 받아 출력하는 예제이다.
 *
/*
 * 일시정시 상태에 있다가 다른 스래드가 종료가되면 일시정지가 풀린다.
 */

public class SumThread extends Thread {

	private long sum;
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	public long getSum() {
		return this.sum;
	}
	
	
	@Override
	public void run() {
		
		for(int i=0;i<=100;i++) {
			sum+=i;
		}
		
	}
	
}
