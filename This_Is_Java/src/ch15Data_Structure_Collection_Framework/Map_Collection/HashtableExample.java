package ch15Data_Structure_Collection_Framework.Map_Collection;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {

	/*
	 * <Hashtable>
	 * Hashtable은 HashMap과 동일한 내부 구조를 가지고 있다. 차이점은 Hashtable은 동기화된
	 * 메소드로 구성되어 있기 떄문에 멀티 스레드가 동시에 Hashtable의 메소드들을 실행할 수 없다는 것이다.
	 * 따라서 멀티 스레드 환경에서도 안전하게 객체를 추가 삭제 할 수 있다.
	 * 
	 * List의 Vector와 같다.
	 * 
	 * <문법>
	 * Map<String, Integer> map = new Hashtable<String, Integer>();
	 * Map<String, Integer> map = new Hashtable<>();
	 * 
	 * 다음은 ThreadA와 ThreadB에서 동시에 각각 1000개씩 엔트리를 Hashtable에 추가한 후, 전테 저장된 수를
	 * 출력하는 예제이다.
	 */
	
	public static void main(String[] args) {
			
		//Hashtable 컬랙션 생성
		Map<String,Integer> map = new Hashtable<>();
		
		//작업 스레드 객체 생성
		Thread threadA = new Thread() {
			
			@Override
			public void run() {
				for(int i=0;i<1000;i++) {
					map.put(Integer.toString(i), i);
				}
			}
			
		};
		
		//작업 스레드 객체 생성
		Thread threadB = new Thread() {
			
			@Override
			public void run() {
				for(int i=1001;i<2000;i++) {
					map.put(Integer.toString(i),i);
				}
				
			}
		};
		
		//작업 스레드 실행
		threadA.start();
		threadB.start();
		
		//작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 함
		//작업 스레드의 결과가 메인 스레드의 이후 작업에 영향을 미치기 떄문에 사용한다.
		//int size = map.size();
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//저장된 총 엔트리 수 얻기
		int size = map.size();
		System.out.println("총 엔드리 수:"+size);
		System.out.println();
		//28분 48초
	}
}
