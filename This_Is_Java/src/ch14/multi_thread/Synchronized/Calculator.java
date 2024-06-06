package ch14.multi_thread.Synchronized;

public class Calculator {
	
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
//이메소드를 하나의 메소드가 사용할때 Calculator를 잠그기위해서 synchronized를 붙였다
//하지만 Calculator객체를 잠그더라도 synchronized가 붙지 않은 일반 메소드는 객체에 락이 걸리더라도 다른 스래드가 접근할수 있다.
		this.memory = memory;
	
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);	
	}
	
	public  void setMemory2(int memory) {
		//만약 특정 부분만 하나의 스레드가 사용하게 만들고 싶다면 동기화 블록으로
		//작성하면된다
			
		synchronized(this) {//공유 객체에 대한 참조 쉽게말해 실행될때 잠글 객체를 참조시켜주면 된다
			
			this.memory = memory;
			
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);	
		}
		
				
			}
	
	
}
