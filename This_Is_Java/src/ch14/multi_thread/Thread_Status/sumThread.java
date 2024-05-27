package ch14.multi_thread.Thread_Status;

import java.awt.Toolkit;

public class sumThread {
  public static void main(String[] args) {
	 
	  Toolkit tk = Toolkit.getDefaultToolkit();
	  Thread thread = new Thread() {
		  public void run() {
			  
			for(int i=0;i<3;i++){  
				
			
			  tk.beep();
			
			  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			  
		  }
		  }
	  };
	  thread.start();
	  
	  for(int i=0; i<3; i++) {
		  
		  System.out.println("띵");
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	  
  }
}
