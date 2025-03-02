package ch14.multi_thread;

import java.awt.Toolkit;

public class test {

	public static void main(String[] args) throws InterruptedException {
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Task taskThread = new Task();
		Thread TaskThread = new Task();
		
		System.out.println(taskThread.getName());
		TaskThread.start();
		for(int i=0;i<5;i++) {
			kit.beep();
			Thread.sleep(1000);
		}
		
	}
	
}

class Task extends Thread{
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
