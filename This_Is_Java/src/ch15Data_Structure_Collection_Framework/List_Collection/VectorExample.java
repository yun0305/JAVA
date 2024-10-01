package ch15Data_Structure_Collection_Framework.List_Collection;

import java.util.List;
import java.util.*;

/*
 * <Vector>
 * 이번엔 List 컬랙션의 구현 객체인 Vector를 알아 보겠다.
 * 
 * 사용방법은 리스트 인터페이스를 구현을 했기 떄문에 리스트 인터페이스로 사용하는 방법은 똑같다.
 * 
 * ArratList 공부했을 떄 실습한 내용 에서 List 인터페이스 변수에 참조시킬 구현객체만 Vector로 만들어 주면
 * 된다. 하나도 바꿔줄 필요가 없다 왜냐면 사용 방법이 동일하기 때문이다.
 * 
 * List 인터페이스를 구현한게 ArrayList 그리고 Vector, LinkedList 구현 객체만 다를 뿐이지
 * 사용 방법은 다 List로 사용하니까 똑같다.
 * 
 * 지금 알아야할건 언제 List를 만들어야 하냐 다시 말해서
 * 언제 ArrayList를 사용하고 언제 Vector를 사용하냐는거다. 
 * 
 * 그래서 Vector같은 경우는 ArrayList와 동일한 구조를 가지고 있다. 당연히
 * List 인터페이스를 구현했기 떄문에 당연히 내부 구조는 동일할거다.
 * 
 * 차이점은 Vector는 동기화된 메소드로 구성이 되어 있다. 저번에 스레드 했을때 동기화를 배웠다.
 * 
 * 그래서 Vector는 메소드마다  Shnchronized가 다 붙어있다. 
 * 
 * Shnchronized가 붙어있으면 한 스레드가 이 Vector 안에 있는 메소드를 실행 하고 있을때 다른 스레드는 Shnchronized
 * 메소드를 호출할수 없다. 
 * 
 * 결국 뭐냐면 하나의 스레드가 Vector 를 사용할 동안 다른 스레드는 백터를 사용할수 없다.
 * 
 * 멀티스레드 환경 스레드가 하나가 아니라 여러개의 스레드가 실행되고 있는 환경에서 내가 List 컬랙션을 사용하고 싶다
 * 그러면 어떤 스레드가 객체를 저장하기 위해서 add라고 하는 메소드를 호출할떄 다른 스레드는 add라는 메소드는 물론
 * 
 * 다른 remove get 이런 메소드도 사용할수 없다. 바로 동기화된 메소드들로 구현이 되어있기 때문이다.
 * 
 * 싱글 스레드 환경에서 Vector를 사용하던 ArrayList를 사용하던 사용법이 같기때문 차이는 없지만
 * 
 * 멀티 스레드 환경에서 공유 객체로 사용할 경우 여러 스레드가 동시에 뭔가를 추가하려고 할떄
 * 스레드 1과 스레드 2가 거의 동시에 add메소드로 추가를하려고 할떄 문제가 발생한다.
 * 
 * 멀티 스레드 환경에서 두가지 이상의 스레드가 동시에 사용할 경우에 문제가 발생할수 있다.
 * 
 * 그러니까 정리하자면 멀티 스레드 환경에서는 ArrayList를 사용하게 되면 문제가 발생할수 있다는 거다. 
 * 
 * 이럴떄 vector를 사용하면 된다. 
 * 
 * Vector는 ArrayList와 동일한 내부 구조를 가지고 있다. Vector는 동기화된 메소드로 구성되어 있기 떄문에 멀티 스레드
 * 가 동시에 Vector()메소드를 실행 할수 없다는 것이다 그렇기 떄문에
 * 멀티 스레드 환경에서는 안전하게 객체를 추가 또는 삭제할 수 있다.
 * 
 * <ArrayList 문법>
 * List<E> list = new Vector<E>(); // E에 지정된 타입의 객체만 저장
 * List<E> list = new Vector<>();  // E에 지정된 타입의
 * List list = new Vector();	   // 모든 타입의 객체를 저장
 * 
 * 다음은 ThreadA와 ThreadB에서 동시에 Border객체를 Vector에 각각 1000개씩 추가한 후, 전체
 * 저장된 수를 출력하는 예제이다.
 * 
 * 
 */

	

public class VectorExample {

	public static void main(String[] args) {
		
		//Vector 컬랫션 생성
		List<Border> border = new Vector<Border>();
		//ArrayList를 넣어서 실행해보면 값이 달라진다. 
		//ArrayList를 사용하면 race condition 경쟁상태가 된다. 
		
		//작업 스레드1 생성
		Thread taskThread1 = new Thread() {
			
			@Override
			public void run() {
				//객체 1000개 추가
				for(int i=0;i<1001;i++) {
					border.add(new Border("제목"+i,"내용"+i,"글쓴이"+i));
				}
				
			}
			
		};
		
		Thread taskThread2 = new Thread() {
			
			 @Override
			public void run() {
				//객체 1000개 추가
				 for(int i=1000;i<2001;i++) {
					 
					 border.add(new Border("제목"+i,"내용"+i,"글쓴이"+i));
					 
				 }
				 
			}
			
		};
		
		//작업 스레드 실행
		taskThread1.start();
		taskThread2.start();
		
		
		//작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 함
	
			try {
				taskThread1.join();
				taskThread2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//저장된 객체 수 얻기
			System.out.println("border에 저장된 객체의 수 "+border.size());
		

	}
	

}

/*
 * ArrayList를 사용했을 때 2000개의 객체가 생성되지 않는 이유는 멀티 스레드 환겨에서 발생하는 경쟁 상태(race condition) 때문이다.
 * 경쟁 상태는 여러 스레드가 동시에 동일한 자원(여기선 ArrayList)에 접근하고 조작할 때 발생한다.
 * 이로인해 데이터의 일관성이 깨지고 예상치 못한 결과가 나올 수 있다.
 * 
 * <상세한 내부 과정>
 * 
 * 두 스레드 taskThread1과 taskThread2 가 동시에 ArrayList에 객체를 추가하고 있다.
 * ArrayList의 add메소드는 다음과 같은 단계로 작동한다
 * 
 * 1.리스트의 현재 크기(size)를 확인
 * 
 * 2.객체를 추가할 위치 결정
 * 
 * 3.해당 위치에 객체를 삽입하고, 리스트의 크기를 1증가시킨다.
 * 
 * 이제 여기서 스레드 2개를 ArrayList를 사용하면
 * 
 * <경쟁 상태 발생>
 * 
 * 예를 들어 taskThread1 이 객체를 추가하려고 리스트의 현재 크기를 확인한 다음,
 * taskThread2가 거의 동시에 같은 리스트의 크기를 확인했다고 가정해보자
 * 
 * 현재 크기는 2고 두 스레드 모두 2라고 확인을 했다.
 * 
 * 이때 두 스레드가 동시에 같은 위치에 객체를 추가하려고 하거나, 한 스레드가 리스트의
 * 크기를 업데이트하기 전에 다른 스레드가 이미 그 크기를 참조해서 다음 객체를 추가 하려고 할수 있다.
 * 
 * 이로 인해 하나의 스레드가 객체를 추가한 후 리스트의 크기를 1증가 시키기 전에
 * 다른 스레드가 이미 잘못된 크기를 기반으로 객체를 추가할 위치를 결정하게 되면
 * 
 * 두 스레드가 동일한 위치에 객체를 추가하려는 상황이 발생할 수 있다.
 * 
 * 이 과정에서 두 스레드가 동일한 위치에 객체를 추가하거나. 객체가 리스트의 끝이 아닌 다른
 * 위치에 삽입되면서 이전에 추가된 객체를 덮어쓰게 되는 일이 발생할 수 있다.
 * 
 * 결과적으로 일부 객체는 리스트에 추가되지 않거나 덮어씌워지기 떄문에, 리스트의 최종 크기는 2000개가 되지 않을 수 있다.
 * 
 * Collections.synchronizedList() 를 사용하면 ArrayList를 동기화 시킬수 있다.
 
 *
 *https://turtledev.tistory.com/47 경쟁상태와 데드락 
 *
 */
