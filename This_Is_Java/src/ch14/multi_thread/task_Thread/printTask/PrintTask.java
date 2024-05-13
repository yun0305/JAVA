package ch14.multi_thread.task_Thread.printTask;


/*
 * 같은 기능의 스레드가 여러곳에서 사용된다고 한다면 명시적으로 만들어 놓는편이 더 합리적이다.
 * 
 * 그리고 이건 쓰레드가 아니라 작업 공간을 가지고 있는 Runnable이다
 */
public class PrintTask implements Runnable{
	@Override
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
