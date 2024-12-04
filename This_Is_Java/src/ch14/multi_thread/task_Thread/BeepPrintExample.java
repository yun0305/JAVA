package ch14.multi_thread.task_Thread;

import java.awt.Toolkit;

import ch14.multi_thread.task_Thread.printTask.PrintTask;

/*
 * <작업 스레드 생성과 실행>
 * 메인스레드를 실행하면서 필요에 따라 스레드를 만든다. 하지만 스레드를 생성한것과 실행한다는건
 * 다른 이야기다 스레드를 생성만 했다고 해서 바로 실행되는 것이 아니라 생성을하고 실행을 해야 
 * 작업 스레드를 실행하는 것이다.
 * 
 * 스레드를 생성하는 시점은 개발자 본인이 판단하는 것이다. 동시에 내가 여러가지의 작업을 실행해야 한다면.
 * 작업 스레드를 만들어야 한다. 처음부터 만드는 것이 아니다. 메인스레드로 작업하다가 어느 시점에 다른 작업도 동시에 해야한다하면
 * 그 시점에 작업 스레드를 만들면 된다.
 * 
 * 자바 프로그램에서 프로그램을 실행을하면 항상 메인 스레드가 만들어 진다. 만약 추가적인 작업을 해야하는 경우라면
 * 추가 작업 수에 따라서 작업 스레드로 만들면 되는데 작업 스레드를 만드는 방법은 2가지가 있다. 
 * 
 * 첫번째는 직접 쓰레드 클래스를 생성해서 쓰레드를 만드는 방법과
 * 
 * 두번째는 쓰레드의 자식 클래스를 만들어서 사용할수 있다.
 * 
 * <Thread 클래스로 직접 생성>
 * java.lang 패키지에 있는 Thread 클래스로부터 작업 스레드 객체를 직접 생성하려면 다음과 같이 Runnable 구현 객체를 
 * 매개값으로 갖는 생성자를 호출하면 된다
 * 
 * 객체를 생성할때는 new 라는 연산자를 사용했다. 쓰레드를 생성할때도 new 를 사용한다 new 로 스레드 객체를 만들어서 
 * 스레드 객체 번지를 스레드 타입 변수에 참조시킨다.
 * 그다음에 thread.start(); 메소드를 호출해야 스레드를 실행할수 있다.
 *
 * Thread thread = new Thread(Runnable target);
 * 
 * Thread 생성자 매개값으로 전달되는게 무엇이냐 하면 인터페이스 타입의 객체가 들어온다 Runnable은 인터페이스다
 * 여기서 인터페이스의 다형성이 사용된다 생성자의 매개값이 인터페이스 타입이니까 Runnable을 구현한 구현객체면 모두 들어올수 있다.
 * 
 * 그럼 구현객체는 어디서 가져오냐 명시적으로 클래스를 만들어서 Runnable을 구현시키면 된다.
 * 
 * class Task implements Runnable {
 * 
 * @Override
 * public void run(){
 *	//스레드가 실행할 코드
 * }
 *}
 *}
 *Runnable을 구현한 구현 클래스를 만든 다음에
 *
 *	Runnable task = new Task(); // 참조변수가 Runnable 대신 Task가 와도 상관은 없다.
 *	
 *	Thread thread = new Thread(task);
 *	
 *	항상 헷갈려서 적어놈{
 *	
 *	헷갈리면 안되는게 여기에 구현객체를 생성자에 넣어줘야지 그냥 Thread 참조변수에 구현객체를
 *	대입 시키는게 아니다 좀만 생각해보면 논리적으로 말이 안되는걸 알거다. Rubable 을 처리할수 있는 
 *	생성자가 있는거지 Thread에 그대로 Runable을 참조시키면 안된다는 거다.
 *
 *	<항상 착각하는거>
 *	Thread thread = new Runable구현객체(); // 이게 잘못된거
 *
 *	<정상>
 *	Thread thread = new Thread(Runable구현객체()); 이게 맞는거
 *
 *	}
 *
 *	구현 객체를 만든다음 구현객체를 Thread 생성자에 제공해주면 된다.
 *	
 * Runnable 인터페이스에는 딱 1개의 추상 메소드가 정의되어 있는데. 그게 뭐냐면 Run 이라는 메소드이다.
 * Run 메소드는 실제로 쓰레드가 동작시킬 코드를 가지고 있는 메소드이다.
 * 
 * 그래서 thread.start() 메소드를 호츨하면 해당 thread가 가지고 있는 인터페이스 매개값이 가지고 있는 Run이라는 메소드를 호출한다.
 *  
 * 이런식으로 구현 클래스를 만들어서 Thread를 사용할수 있는 방법이 있다.
 * 또 다른 방법은 익명객채를 통해 만드는 방법이 있다.
 * 
 * 명시적인 Runnable 구현 클래스를 작성하지 않고 thread 생정자를 호출할 때 Runnable 익명 구현 객체를
 * 매개값으로 사용할 수 있다. 오히려 이 방법이 더 많이 사용된다.
 * 
 * Thread thread = new Thread(new Runnable(){
 * 	
 * 	@Override
 * 	public void run(){
 * 	//스레드 실행 코드
 * 
 * } 
 * 
 * });
 * Runnable은 작업할 내용을 가지고 있는 객체라고도 한다.
 * 
 * 스레드의 동작 과정은
 * 1.메인스레드가 new Thred(task); 작업스레드를 만난서 작업 클래스접근
 * 2.메인 스레드 동작중에 start() 메소드를 만난다
 * 3. start 메소드로 작업 메소드 실행 동시에 메인스래드도 멈추지 않고 작없스레드와 같이 실행
 * 
 * 다음은 메인 스레드가 동시에 두가지 작업을 처리할 수 없음을 보여주는 예제이다. 원래 목적은
 * 0.5초 주기로 비프음을 발생시키면서 동시에 프린팅 까지 하는 작업이지만, 메인 스레드는 비프음을 모두 발생한 다음에야
 * 프린팅을 시작한다.
 * 
 *  */
public class BeepPrintExample {

	public static void main(String[] args) throws InterruptedException {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 얻기

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
				toolkit.beep();//비프음 발생
			
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
				
				}
			}
			}
		});
		thread.start();
		

//		for(int i=0;i<5;i++) {
//			System.out.println("띵");
//			Thread.sleep(1000);
//		}
		Runnable task = new PrintTask();// 둘중 어떤 방식이든 상관없다 어짜피 다형성이 성립되서 run메소드만 가지고 있으면 된다
		PrintTask task2 = new PrintTask();
		
		Thread thread2 = new Thread(new PrintTask());//객체를 바로 넣어줘도 되고 변수에 담아서 전달해줘도 된다
		Thread thread3 = new Thread(task);
		Thread thread4 = new Thread(task2);
		thread2.start();
		thread3.start();
		thread4.start();
		
		
		
	}

}
