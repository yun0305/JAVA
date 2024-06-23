package ch14.multi_thread.ThreadSafeStop;

/*<Interrupt() 메소드 이용>
 * interrupt() 메소드는 스레드가 일시 정지 상태에 있을 때 InteruptedRxception 예외를 발생시키는
 * 역할을 한다. 이것을 이용하면 예외 처리를 통해 run() 메소드를 정상 종료시킬수 있다.
 * 
 * 조건문을 사용한 종료와 맥락은 같다. 가능한 빨리 run()메소드를 종료시키는 것이다
 * 조건문과 다른점은 실행흐름을 방해시키는 것이다. interrupt는 스레드가 일시 정지 상태에 있을떄
 * 예외를 발생시키는 역할을 한다.
 * 
 * 지금까지 사용했던 Thread.Sleep()메소드는 예외처리를 해줘야하는 메소드였다
 * InteruptedRxception 예외는 언제 발생하냐면 interupt()매소드를 호출할때 발생한다.
 * 
 * try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		이 코드는 3초를 기다리게 한다 하지만 3초가 다 지나기 전에 종료하고 싶다면
		interupt()메소드를 호출하면 된다. 그럼 바로 catch문으로 넘어간다.
		
	
 * 
 * join() 과 wait() 도 같은 방식이다.
 * 
 * 일시 정지를 방해하는게 interrupt()메소드다.
 * 
 * interrupt() 메소드는 스레드가 일시정지 상태에 있을때 예외를 발생시킨다.

 *
 * 코드로 간단하게 설명하자면
 * 
 * 메인 메소드에 thread.start() 를 해서 run() 메소드가 실행되었는데
 * run()메소드 안에 이런코드가 있다고 가정하자
 * 
 * try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//스레드가 사용한 리소스 정리
 * 그럼 이제 메인 메소드에서 thread.interrupt() 메소드를 호출하면 3초 전에
 * 에 thread가 종료된다 왜냐면  Thread.sleep은 일시정지 상태니까 interrupt()메소드를 호출하면 바로 예외를
 * 발생시켜 종료하게 된다.
 * 
 * 그럼 만약에 run()메소드 안에 일시정지를 시키는 코드가 없을땐 어떻게 하느냐
 * 그럼 아무일도 안일어난다.
 * 
 * 일시 정지를 만들지 않고도 interrup() 메소드 호출 여를 알수 있는 방법이 있다.
 * Thread 의 interrupted()와 isInterrupted() 메소드는 interrupt() 메소드 호출
 * 여부를 리턴한다. interrupted()는 정적 메소드 이고 isInterrupted()는 인스턴스 메소드이다.
 * 
 *  interrupted()실행전에 한번이라도 interrupt()가 호출되면 true 아니면 false를 리턴한다.
 *  isInterrupted() 객체가 필요하다. 기능은 같다.
 * 
 *
 */

public class PrintThread2 extends Thread {

	@Override
	public void run() {
		try {
			while(true) {
				//Thread.sleep(1);// 일시정지를 위해 어쩔수 없이 넣은것
				if(Thread.interrupted()) {
					break;
				}
				System.out.println("실행중..");
		    }
		}catch (Exception e) {
				
				e.printStackTrace();
			}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
	
	
		
}
		

