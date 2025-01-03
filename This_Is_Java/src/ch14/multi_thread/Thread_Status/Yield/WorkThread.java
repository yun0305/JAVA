package ch14.multi_thread.Thread_Status.Yield;

public class WorkThread extends Thread {
	
	public boolean work = true;
	
	public WorkThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			if(work) {
				System.out.println(getName()+" : 작업처리");
			}
			else{
				Thread.yield();
				//실행기회가 오면 yield로 다른 스레드에게 실행기회를 넘겨주고
				//그리고 다음 실행기회가 올떄까지 실행 대기 상태가 된다.
			}
		}
		
}
	
	
	
}
