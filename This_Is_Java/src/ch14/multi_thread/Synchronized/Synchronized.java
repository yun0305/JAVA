package ch14.multi_thread.Synchronized;
/*
 *<스레드 동기화>
 * 동기화란 뭔가를 맞춘다라는 의미다 하나의 스레드를 가지고 하는 작업이 아니라 2개 이상의 스레드를 가지고 동기화를 한다.
 * 그럼 뭘 맞춘다는 것일까 바로 실행 순서를 맞춘다는 개념이다. 스레드 간에 실행 순서를 맞춘다.
 * 
 * 멀티 스레드는 하나의 객체를 공유해서 작업할 수도 있다. 즉 공유 객체가 있고 여러 스레드가 공유해서 작업을 할수 있다 는 뜻이다.
 * 
 * 예를 들어 Calculator라는 객체가 있고 (User1Thread), (User2Thread) 이 두 객체가 공유하는 Calculator객체를 공유 객체라고 한다.
 * 이런 경우에 다른 스레드에 의해 객체 내부 데이터가 쉽게 변경될 수 있기 떄문에 의도했던 것과 다른 결과가 나올 수 있다.
 * 
 * User1Thread는 Calculator 객체의 memory 필드에 100을 먼저 저장하고 2초간 일시 정지 상태가 된다
 * 그동안 User2Thread가 memory 필드 값을 50으로 변경한다. 2초가 지나 User1Thread 가 다시
 * 실행 상태가 되어 memory 필드의 값을 출력하면 User2Thread가 저장한 50이 나온다.
 * 
 * 그런데 나는 User1Thread가 저장한 100이 그대로 나오게 하고싶은데 어떻게 해야하냐
 * 
 * Calculator 객체를 따로 쓰면 문제가 없지만 하나의 객체를 동시에 사용해서 문제가 된다는것이다.
 * 그러면 User1Thread가 2초간 일시정지 상태라도 다른 스레드가 memory값을 못바꾸게 할 필요가 있다.
 * 
 * 그럼 이를 해결하기 위한 방법은 스레드가 사용 중인 객체를 다른 스레드가 변경할수 없도록 하기위해
 * 스레드 작업이 끝날 때까지 객체에 잠금을 걸면 된다. 이를 위해 자바는 동기화(synchornized) 메소드와 블록을 제공한다.
 * 
 * 그럼 다시 예시를 들어 보겠다 만약 User1Thread가 동기화된 메소드를 사용하면 Calculator 공유 객체가 락이 걸려 버린다.
 * 공유 객체가 락이 걸리면 어떻게 되냐면 User2Thread가 동기화된 메소드를 사용할수 없게 된다. 물론 동기화가 붙은 메소드는 다 사용할수 없다.
 * 하지만 그냥 일반 메소드는 사용할수 있다.
 * 
 * 그래서 동기화 처리 된 메소드만 다른 메소드가 실행 할수 없다.
 * 
 * 그럼 User2Thread는 동기화 메소드를 사용 못하는 것이냐? 아니다 객체에 락이 풀리면 사용할수 있다.
 * 객체의 락이 풀리는 시점은 User1Thread가 동기화 메소드나 동기화 블록의 실행을 끝내면 객체락이 풀리고
 * User2Thread가 사용할수 있다.
 * 
 * 그럼 이제 동기화 메소드 및 동기화 블록 선언 방법을 알아 보겠다
 * 
 * <동기화 메소드 및 블록 선언>
 * 동기화 메스드의 선언 방법은 다음과 같다. synchronized 키워드를 붙이면 된다. synchronized 키워드는
 * 인스턴스와 정적 메소드 어디든 붙일 수 있다.
 * 
 *  public synchronized void method(){
 *  // 단 하나의 스레드만 실행하는 영역
 *  }
 *  
 *  스레드가 동기화 메소드를 실행하는 즉 객체는 잠금이 일어나고, 메소드 실행이 끝나면 잠금이 풀린다.
 *  메소드 전체가 아닌 일부 영역을 실행할 때만 객체 잠금을 걸고 싶다면
 *  다음과 같이 동기화 블록을 만들면 된다.
 *  
 *  public void method() {
 *  //여러 스레드가 실행할 수 있는 영역
 *  
 *  synchronized(공유객체){
 *  
 *  }
 *  }
 *  
 */

public class Synchronized {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();// 공유객체
		
		User1Thread user1Thread = new User1Thread("user1");
		user1Thread.setCalculator(cal);
		user1Thread.start();

		User2Thread user2Thread = new User2Thread("user2");
		//User1Thread 가 작업을 끝낼때까지 실행 대기 상태
		//정확히 말하면 User2Thread가 실행 대기 상태가 아니라 실행 기회를 받지만
		//Calculator 객체가 잠겨있기 때문에 작업을 수행할 수 없어서 다시 실행 대기 상태로 돌아가는 형식이다.
		user2Thread.setCalculator(cal);
		user2Thread.start();
		/*
		 *현재 설명에 나온 공유객체와 2개의 스레드를만들고 2개의 스레드는 각각
		 *같은 공유객체를 사용하고있다. 
		 *그냥 실행 했을 경우엔 둘다 같은 공유 객체를 사용하기 때문에 50일 출력 되지만
		 *User1Thred와 User2Thread 가 둘다 사용해야하는 메소드에 락을 걸어주면
		 *먼저 사용하고 있는 스레드가 락을 걸어버리기 때문데 User1Thread가 100으로 값을 변경하고
		 *출력할때까지 User1Thread의 setMemory 메소드의 실행이 끝날떄 까지 User2Thread는  
		 *setMemory를 실행하지 못한다.
		 *
		 *User1Thread는 Calculator의 동기화 메소드인 setMemory1()을 실행하는 순간
		 *Calculator객체를 잠근다. 따라서 User2Thread는 객체가 잠금 해제될 때까지 Calculator의 동기화
		 *블록을 실행하지 못한다. 2초 일시정지 후에 잠금이 해제되면 비로소 User2Thread가 동기화 블록을 실행한다.
		 *
		 * 
		 */
		
	
	}
	
}
