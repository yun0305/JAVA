package ch14.multi_thread.Synchronized.wait_notify;

public class waitNotifyExample {

	public static void main(String[] args) {
		
		WorkObject workObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();
		

	}

}
