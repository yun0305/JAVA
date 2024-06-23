package ch14.multi_thread.ThreadSafeStop;

public class SafeStopExample {

	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
	
		printThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		printThread.SetStop(true);
	}

}
