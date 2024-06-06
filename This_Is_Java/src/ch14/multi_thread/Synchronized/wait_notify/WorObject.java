package ch14.multi_thread.Synchronized.wait_notify;

/*<wait()와 notify()를 이용한 스레드 제어>
 * 경우에 따라서는 두 개의 스레드를 교대로 번갈아 가며 실행할 때도 있다. 정확히
 * 교대 작업이 필요할 경우. 자신의 작업이 끝나면 상대방 스레드를 일시 정지 상태에서 풀어주고 자신은
 * 일시 정지 상태로 만들면 된다.
 * 
 * 이 방법의 핵심은 공유 객체에 있다. 공유 객체는 두 스레드가 작업할 내용을 각각 동기화 메소드로 정해놓는다.
 * 한 스레드가 작업을 완료하면 notify() 메소드를 호출해서 일시 정지 상태에 있는 다른 메소드를 실행 대기 상태로
 * 만들고, 자신은 두 번 작업을 하지 않도록  wait() 메소드를 호출하여 일시 정지 상태로 만든다.
 * 
 * 현재 스레드가 실행하고 있는데 wait를 하면 그럼 현재 스레드는 일시 정지상태가 되서 waiting Pool로 넘어간다,
 * 그럼 일시정지된 스레드가 언제 실행 대기 상태가 되냐면 다른 스레드가 notify 또는 notifyAll 을 호출하면 Waiting Pool에서
 * 일시 정지된 스레드 들이 실행 대기 상태가 된다. wait랑 notify notifyAll은 전부 동기화 메소드이다. 그래서 동기화 블록 안에서만 사용할수 있다.
 * 
 */
public class WorObject {

	public synchronized void mrthodA() {
		
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		notify();//다른 스레드를 일시 정지 상태로 만들고
		try {
			wait();// 자신을 일시정지로 만든다
		}catch(InterruptedException e) {
			
		}//35:56
		
	}
	
}
