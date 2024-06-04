package ch14.multi_thread.Synchronized;



public class User1Thread extends Thread {

	private Calculator cal;
	
	public User1Thread() {
		
		setName("User1Thread");
		
	}
	
	public void setCalculator(Calculator cal) {
		this.cal = cal;
	}
	
	@Override
	public void run() {
		cal.setMemory(100);
	}
	
}
