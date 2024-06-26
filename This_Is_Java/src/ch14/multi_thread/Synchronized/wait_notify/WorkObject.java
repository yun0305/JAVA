package ch14.multi_thread.Synchronized.wait_notify;

/*<wait()와 notify()를 이용한 스레드 제어>
 * 
 * wait()와 notify()는 동기화와 관련되어 있다. 이 3개의 메소드는 Thread가 가지고 있는게 아니라
 * Object가 가지고 있다.
 * 
 * wait()를 호출하면 일시정지 상태가된다. notify()를 호출하면 다른 메소드를 깨워주는 역할을 한다.
 * 예를 들어 wait() 를 해서 A라는 스레드가 일시 정지가 되면 A를 실행대기 상태로 만드는 역할을 누가 하나면
 * A스레드가 아니고 다른 스레드가 notify라고 호출해주면 A가 wait()에서 벗어나서 실행 대기로 간다.
 * 
 * 다시 설명하면
 * 현재 스레드가 wait()를 하면 일시 정지 상태로 간다. 그러면 일시정지된 스레드가 언제 실행 대기로 가냐이다.
 * 다른 스레드가 notify() notifyall()을 호출하면 된다. 
 * 
 * 여기서 중요한점은 wait() notify() notifyall()메소드는 동기화 메소드 또는
 * 동기화 블록 내에서만 사용할 수 있다는 것이다.
 * 
 * 그리고 이 3개의 메소드들은 final 메소드라서 재정의할수 없다.
 * 
 * 다음 예제는 WorkObject에 두 스레드가 해야 할 작업을 동기화 메소드인 methodA()와 methodB()로 각각 정의해 두고, ThreadA와 ThreadB가 교대로 mrthodA()와
 * methodB()를 호출하도록 한 것이다.
 * 
 */
public class WorkObject {

	public synchronized void mrthodA() {
		
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+" methodA 작업 실행");
		notify();//일시 정지되어있는 스레드를 실행대기 상태로 만들고
		try {
			wait();// 자신을 일시정지로 만든다
		}catch(InterruptedException e) {
			
		}
		
	}
	
	public synchronized void methodB() {
		
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+" methodB 작업 실행");
		
		notify();
		
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
