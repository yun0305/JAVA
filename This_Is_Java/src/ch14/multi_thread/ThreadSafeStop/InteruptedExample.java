package ch14.multi_thread.ThreadSafeStop;

public class InteruptedExample {

	public static void main(String[] args) {
		
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.interrupt();// 반드시 일시정지 코드가 있어야 interrupt가 실행한다.
	}

}
