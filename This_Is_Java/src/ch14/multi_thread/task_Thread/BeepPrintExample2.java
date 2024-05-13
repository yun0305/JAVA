package ch14.multi_thread.task_Thread;

import java.awt.Toolkit;

import ch14.multi_thread.task_Thread.printTask.Print_Thread;

public class BeepPrintExample2 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new Thread() {
			
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			@Override
			public void run() {
				
				for(int i=0;i<5;i++) {
					toolkit.beep();
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				
				}
				
			}
			
		}	;
			thread.start();
			
//			for(int i=0;i<5;i++) {
//				System.out.println("띵");
//				Thread.sleep(1000);
//			}
			Print_Thread pt = new Print_Thread();// 이런식으로 해도 된다
			pt.start();
			
			Thread thread2 = new Print_Thread();  
			thread2.start();
			
		
		
	}
}
