package ch14.multi_thread.Thread_Status.Join;

public class JoinExample {
	
	public static void main(String[] args) {
		
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();//sumThread 가 종료할때까지 기다려 라는 뜻
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1~100까지의 합 : "+sumThread.getSum());
	}
}
