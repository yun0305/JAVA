package ch14.multi_thread.Thread_Status.Sleep;

import java.awt.Toolkit;

/*
 * <주어진 시간 동안 일시 정지>
 * 실행 중인 스레드를 일정 시간 멈추게 하고 싶다면 Thread 클래스의 정적 메소드인 sleep()을 이용하면 된다.
 * 매개값에는 얼마동안 일시 정지 상태로 있을 것인지 밀리세컨드(1/1000)단위로 시간을 주면 된다. 다음 코드는 1초 동안 일시 정지 상태를 만든다.
 * 
 * 일시 정지 상태에서는 InterruptedException이 발생할 수 있기 떄문에 sleep()은 예외 처리가 필요한 메소드이다.
 * InterruptedException에 대해서는 14.7에서 자세히 설명한다.
 * 
 * 다음 예제는 3초 주기로 비프음을 10번 발생시키는 코드이다
 * 
 */

public class SleepExample {

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

	}

}
