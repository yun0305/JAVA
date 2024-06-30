package ch14.multi_thread.daemon;

/*<데몬스레드>
 * 데몬 스레드는 주 스레의 작업을 돕는 보조적인 역할을 수행하는 스레드다.
 * 주란 주인이 되는 스레드다 어떤스레드든 주 스레드가 될수있다. 데몬스레드를
 * 그래서 데몬스레드를 만드는 스레드가 데몬 스레드 이다.
 * 
 * 주 스레드가 종료되면 데몬 스레드도 따라서 자동으로 종료 된다.
 * 왜냐면 주인 스레드가 죽는데 주인 스레드의 작업을 보조하는 데몬 스레드는 필요가 없기 떄문이다.
 * 
 * 예로는 워드 프로세스에서 10분마다 자동으로 저장하는 기능이 있는데 워드 프로세스를 종료하면 당연히 10분마다 자동 저장하는
 * 기능도 종료된다. 또 미디어플레이어의 동영상 및 음악 재생, 같은 기능도 미디어 플레이어가 종료되면 필요가 없기 떄문에 종료되는 것 처럼 말이다.
 * 
 * 가비지 컬렉터도 메인 메소드를 따로따로 3개를 실행시키면 JVM도 따로따로 3개가 실행된다. 1개의 프로세스당 1개의 JVM이 실행된다고 보면된다.
 * JVM 하나당 각각 가비지 컬랙터를 가지고 있다. JVM이 종료되면 가비지 컬랙터도 필요 없기 떄문에 이또한 데몬 스레드의 좋은 예 이다.
 * 
 * 그럼 데몬 스레드를 만들기 위해서는 주 스레드가 데몬이 될 스레드의 setDaemon(true) 를 호출하면 된다. 다음 예를 보면 메인 스레드는 주 스레드 AutoSaveThread는 데몬 스레드가 된다.
 * 코드를 보면서 이해 해보자.
 * 
 * public static void main(String[] args){
 * 	
 * 		AutoSaveThread thread = new AutoSaveThread();
 * 		thread.setDemon(true);
 * 		thread.start();
 * }
 * 
 * 이코드의 전체 흐름 즉 주 스레드는 메인 스레드이다.
 * 이 상태에서 thread의 setDeamon 스레드를true로 호출하면 AutoSaveThread가 데몬 스레드가 되는 것이다.
 * 
 * 여기서 데몬스레드의 특징으로 메인(주)스레드가 종료되면 AutoSaveThread(데몬) 스레드도 종료가 된다.
 * 
 * 원래는 메인 스레드가 종료되더라도 다른 작업스레드가 전부 끝날때 까지 프로그램을 종료하지 않았다. 하지만 데몬스레드는 주 스레드가 종료되면
 * 필요가 없는 스레드이기 때문에 메인 스레드가 종료 되면 종료된다.
 * 
 * 다음 예제는 1초 주기로 save() 메소드를 호출하는 AutoSaveThread를 데몬 스레드로 실행 시킨다. 그리고 메인 스레드가 3초 후에
 * 종료 되면 AutoSaveThread도 따라서 자동 종료된다.
 * 
 * 
 * 
 */

public class AutoSaveThread extends Thread{
	
	public void save() {		
		System.out.println("작업 내용을 저장함.");	
	}
	
	@Override
	public void run() {
		while(true) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			
			save();
			
		}
	}
	
}
