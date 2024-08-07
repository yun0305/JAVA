package ch14.multi_thread.task_Thread.test;

import java.awt.Toolkit;

public class task implements Runnable {
	
	@Override
	public void run() {
			
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		for(int i=0;i<3;i++) {
			
			tk.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
