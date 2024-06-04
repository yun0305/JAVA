package ch14.multi_thread.Synchronized;



public class User2Thread extends Thread {

	private Calculator cal;
	
	public User2Thread() {
		
		setName("User2Thread");
		
	}
	
	public void setCalculator(Calculator cal) {
		this.cal = cal;
	}
	
	@Override
	public void run() {
		cal.setMemory(50);
	}
	
}
