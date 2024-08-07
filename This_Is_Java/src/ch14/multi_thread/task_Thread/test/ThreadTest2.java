package ch14.multi_thread.task_Thread.test;

import java.awt.Toolkit;

public class ThreadTest2 {
	
	public static void main(String[] args) throws InterruptedException {
		
//		task tk = new task();
//		Runnable rn_tk = new task();
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0;i<3;i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					tk.beep();	
				}
				
			}
			
		});
		
		thread.start();
		
		for(int i=0;i<3;i++) {
			Thread.sleep(1000);
			System.out.println("띵");
		}
		
	}
}
