/*
 * <스레드 이름>
 * 스레드는 이름을 가지고 있다. 스레드마다 이름을 가질수 있는데 스레드는 기본 이름이 있고 필요에 따라 이름을 줄수 있다.
 * 스레드 이름을 언제 사용하냐면 현재 코드가 어떤 코드를 실행하는지 확인할때 그떄 스레드 이름을 확인해야할 때 사용한다
 * 
 * 메인 스레드는 'main'이라는 이름을 가지고 있다.
 * 작업 스레드는 자동적으로 Thread-n이라는 이름을 가진다. 작업 스레드의 이름을 Thread-n 대싱 다른 이름을 설정하고 싶다면
 * Thread클래스의 setName()메소드를 사용하면 된다.
 * 
 * ex)
 * thread.setName("스레드 이름");
 * 
 * 스레드 이름은 디버깅할 때 어떤 스레드가 작업을 하는지 조사할 목적으로 주로 사용된다.
 * 현재 코드를 어떤 스레드가 실행하고 있는지 확인하려면 정적 메소드인 currentThread()로 스레드 객체의 참조를 얻은 다음 getName() 메소드로
 * 이름을 출력해보면 된다.
 * 
 * ex)
 * Thread thread = Thread.currentThread();//현재 실행중인 Thread 참조
 * System.out.println(thread.getName);//getName()으로 메소드의 이름을 가져올수 있다.
 * 
 * 다음은 현재 실행 중인 스레드의 참조를 얻어 이름을 콘솔에 출력하고, 작업 스레드의 이름을 setName()메소드로 수정하는 방법을 보여준다.
 */

package ch14.multi_thread.Thread_Name;

public class ThreadNameExample {

	public static void main(String[] args) {
	
		Thread thread = Thread.currentThread();// 이 코드를 실행하는 스레드 객체 참조 얻기
		System.out.println(thread.getName());// 

		for(int i=0;i<3;i++){
			Thread threadA = new Thread(){
				
			@Override
			public void run() {
				System.out.println(getName()+"실행");//getName() 메소드는 Thread의 인스턴스 메소드로 스레드의 이름을 리턴
				
				}	
				
			};
			
			threadA.start();
		}
		
		Thread chatThread = new Thread(){
			
			@Override
			public void run() {
				System.out.println(getName()+"실행");
			}
			
		};
		chatThread.setName("chat-thread");//주의할점은 스레드 시작전에 스레드 이름을 설정해야한다
		chatThread.start();//작업 스레드 이름 변경
		
	}	
}
