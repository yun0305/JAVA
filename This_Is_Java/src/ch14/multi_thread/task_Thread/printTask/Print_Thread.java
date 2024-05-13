package ch14.multi_thread.task_Thread.printTask;


/*
 * 이번건 진짜 쓰레드이다
 */
public class Print_Thread extends Thread{
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
