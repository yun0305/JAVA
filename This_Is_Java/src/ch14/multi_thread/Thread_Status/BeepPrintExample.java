package ch14.multi_thread.Thread_Status;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*<스레드 상태>
 * 스레드 객체를 생성(new)하고 start()메소드를 호출하면 곧바로 스레드가 실행되는 것이 아니라
 * 실행 대기 상태(RUNNABLE)가 된다. 실행 대기 상태란 실행을 기다리고 있는 상태를 말한다.
 * 
 * CPU는 끊임없이 다른 작업을 계속 하고 있다. 작업 관리자를 보면 엄청나게 많은 프로세스 들을 볼수 있다.
 * 그런 와중의 내가 만든 Thread를 start 하게 되면 곧바로 스레드를 실행하는 것이 아니라 스레드가 실행할 순번이
 * 돌아오게 되면 그때 내가 만든 스레드가 동작을 한다. CPU 스케줄링이란 CPU가 수 많은 스레드를 한번씩 실행을 시켜줘야 한다는 것이다.
 * 
 * 그래서 start()를 한다고 해서 바로 실행되는 것이 아니라 내가만든 스레드가 실행 순번이 되면 그때 실행되기 떄문에
 * 실행 대기(RUNNABLE)라는게 있다. 실행 스레드는 run()메소드를 모두 실행하기전에 스케줄링에 의해
 * 다시 실행 대기 상태로 돌아갈 수 있다. 그리고 다른 스레드가 실행 상태가된다.
 * 
 * 그럼 내가 만든 스레드가 동작하는 과정을 설명하겠다.
 * 
 * 스레드 객체를 생성하고
 * Thread thread = new Thread(){
 * 
 *  run(){
 *  	
 *  }
 * 
 * }
 * 
 * thread.start();
 * 
 * start() 메소드를 만나면 일단 실행 대기 상태가 된다. 만약 스레드가 종료할떄가지 10초가 걸린다고하면
 * CPU가 여러 스레드를을 1번씩 왔다갔다 하면서 스레드당 1초씪 10번 왔다갔다해서 스레드를 끝낸다.  (예시로 1초지 사실 더 빨라서 우리는 느끼지 못함)  
 * 
 * 정확히 말하면 CPU가 스레드를 실행하는게 아니라 CPU의 코어가 실행시킨다.
 * 
 * 이렇게 스레드는 실행 대기 상태와 실행 상태를 번갈아 가면서 자신의 run() 메소드를 조금씩 실행한다.
 * 실행 상태에서 run()메소드가 종료되면 더 이상 실행할 코드가 없기 떄문에 스레드의 실행은 멈추게 된다.
 * 이 상태를 종료 상태 (TERMINATED)라고 한다
 * 
 * 실행 상태에서 일시 정지 상태로 가기도 하는데 일시 정지 상태는 스레드가 실행할 수 없는 상태를 말한다 다시 실행 상태로 가기 위해서는 일시 정지 * 
 * 상태에서 실행 대기 상태로 가야만 한다. 다음은 일시 정지로 가기 위한 메소드와 벗어나기 위한 메소드를 보여준다
 * (일시정지는 Thread.sleep()메소드를 하면 일시정지가 된다)
 * 
 * 
 * 우리는 작업 스레드의 상태도 볼수 있다. getState()라는 메소드인데 
 * Thread.State 중첩 열거형이다. 
 * 도큐먼트를 보면 5가지 열거상수타입의 상태를 볼수 있다.
 * 
 * 1.BLOCKED : 일시정지상태 (특정 조건이 만족되면 풀림 == Scanner 입력을 받기위한 대기) 어떤 조건이 만족 될떄까지 막연하게 기다림
 * 
 * 2.NEW : 스레드 생성
 * 
 * 3.RUNNABLE : 스레드 실행
 * 
 * 4.TERMINATED : 스레드 종료
 * 
 * 5.TIMED_WATING : 일시정지상태 (시간이 지나면 자동이로 일시정지가 풀림 == Thread)
 * 
 * 6.WATTING :
 * 
 * 스레드는 상태를 가지는데 가장 기본적인 상태는 NEW RUNNABLE TERMINATEED 이다
 * 
 * 
 * 
 * 
 */


/*코드로 상태를 변화할수 있다.
 * 
 * 구분 			메소드 				설명
 * 
 * 일시 정지로		sleep(long milis)	주어진 시간동안 스레드를 일시 정지 상태로 만든다, 주어진 시간이 지나면 자동적으로 실행 대기 상태가 된다
 * 보냄
 * 					join()				join()메소드를 호출한 스레드는 일시 정지 상태가 된다. 실행 대기 상태가 되려면, join()메소드를 가진 스레드가 종료되어야 한다,
 * 									
 * 											
 * 					wait()				동기화 블록 내에서 스레드를 일시 정지 상태로 만든다.
 * 
 * 일시 정지에서	interrupt()			일시 정지 상태일 경우. interruptException을 발생시켜 실행 대기 상태 또는 종료 상태로 만든다.
 * 벗어남
 * 					notify()
 * 					notifyAll()			wait() 메소드로 인해 일시 정지 상태인 스레드를 실행 대기 상태로 만든다.
 * 
 * 실행 대기로
 * 보냄				yield()				실행 상태에서 다른 스레드에게 실행을 양보하고 실행 대기 상태가 된다
 * 
 * 
 * yield()를 호출하면 실행 상태에서 실행 대기가 된다. 이런 경우는 어떤 스레드가 무의미한 작업을 할떄다. 무의미한 작업을 하면서 반복만 할경우에는 CPU스케줄링에 부담되니까 다른 스레드로 넘겨준다.
 * 
 * sleep이나 기타 다른 일시 정지 메소드들의 경우 어떤 실행을 할 조건이 안되는 상태이면 그 조건이 될때 까지 멈춰야 할때 사용한다,
 * 그리고 조건이 만족하면 실행 대기로 넘어가는데 join과 wait는 다른 스레드와 관련이 있다.
 * 
 * 위 표에서 wait()과 notify() notifyAll()은 object 클래스의 메소드이고 그 외는 Thread 클레스의 메소드이다. wait()과 notify() notifyAll()
 * 메소드의 사용 방법은 스레드 동기화에서 알아보기로 하고, 여기서는 Thread 클래스의 메소드만 살펴보자
 * 
 * 
 * 나머지는 예제에서 확인해 보자.
 */									

	/*<주어진 시간동안 일시 정지> 
	 *
	 *실행 중인 스레드를 일정 시간 멈추게 하고 싶다면 Thread클래스의 정적 메소드인 sleep()을 이용하면 된다.
	 *매개값에는 얼마 동안 일시 정지 상태로 있을 것인지 밀리세컨드(1/1000)단위로 시간을 주면 된다. 다음 코드는 1초 동안 일시 정지 상태를 만든다.
	 *
	 *try{
	 *	Thread.sleep(1000);	
	 *
	 *}catch(InterruptedException e){
	 * Interrupt() 메소드가 호출되면 실행
	 *
	 *}
	 *
	 *일시 정지 상태에서는 InterruptedException이 발생할 수 있기 떄문에 sleep()은 예외 처리가 필요한 메소드이다. InterruptedException에 대해서는 14.7에서 자세히 설명한다. 다음 예제는
	 *3초 주기로 비프음을 10번 발생시킨다.
	 *
	 * */


public class BeepPrintExample {
	
	public static void main(String[] args) {

		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0;i<10;i++) {
			
			toolkit.beep();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/*
		 * sleep() 메소드는 2개가 있다(오버로딩) 1개는 밀리단위 1개는 나노단위이다.
		 * 그리고 도큐먼트오 sleep()메소드 내부를 보면 InterruptedException 를 throws하고 있다.
		 * 
		 * InterruptedException 는 일반예외라서 컴파일러가 확인해주기 때문에 꼭 예외 처리를 해줘야 한다.
		 */
	}
}
