package ch15Data_Structure_Collection_Framework.List_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * 이 전에 배운 List 컬랙션 데이터 구조를 기억해보자
 * 객체가 저장이 되어 있는데 내가 하나를 제거한다 그러면 그 뒤에 있는 인덱스가
 * 앞으로 하나씩 당겨진다
 * 
 * 1 2 3 4 5 6 7 8 9 10 이 있는데 내가 5를 지웠다 그러면
 * 
 * 1 2 3 4 <- 6 <-  7 <-  8 <-  9 <-  10 이렇게 된다,
 * 
 * 이제 객체가 1000개 2000개 이렇게 많이 저장되어 있는 상황에서 똑같이 5를 지우면
 * 하나씩 앞으로 당겨진다. 여기서 인덱스를 앞으로 하나씩 당기는 작업을 하기 때문에
 * 성능상으로는 좋지 못하다. 이 문제를 해결하기 위해 나온게 LinkedList이다.
 * 
 *  LinkedList의 link는 서로서로 연결되어 있다고 생각하면 된다.
 *  
 *  자료구조를 보면 
 *  
 *  인덱스 : 0 1 2 ....n
 *  
 *  이렇게 있는데 인덱스 1를 기준으로 보면 왼쪽에 0 이 있고 오른쪽에 2가 있다.
 *  이런식으로 서로서로 연결을 시켜놓는다. 
 *  
 *  그러면 만약 내가 1인덱스를 지우고 싶다. 이럴땐 연결 정보만 바꿔주면 된다.(내가 직접 바꾸지는 않는다)
 *  
 *  0인덱스와 1인덱스가 연결이 되있고 2인덱스와 1인덱스가 연결 되있는데 1을 뺴고
 *  0인덱스와 2인덱스를 연결해주면 간단하게 인덱스의 위치정보를 바꿀수있다 
 *  
 *  다른 List 구현객체를 보면 인덱스 하나를 삭제하면 앞으로 당기고 추가하면 뒤로
 *  하나씩 다 밀었기 때문에 성능 면에서 떨어졌다.
 *  
 *  다음은 ArrayList와 LinkedList의 성능을 측정해 보겠다.
 *  
 *  	
 * 
 * 
 */

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		//ArrayList 컬랙션 객체 생성
		
		List<String> aList = new ArrayList<String>();
		
		//LinkedList 컬랙션 갹체 생성
		
		List<String> lList = new LinkedList<String>();
		
		//시작 시간과 끝 시간을 저장할 변수 선언
		long startTime = 0;
		long endTime = 0;
		
		//ArrayList 컬랙션에 저장하는 시간 측정
		
		startTime = System.nanoTime();
		for(int i=0;i<1000;i++) {
			aList.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		
		System.out.println("ArrayList 걸린 시간" +(startTime - endTime));
		
		startTime = System.nanoTime();
		for(int i=0;i<1000;i++) {
			
			lList.add(0,String.valueOf(i));
			
		}
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 걸린 시간" +(startTime - endTime));
		
		 startTime = 0;
		 endTime = 0;
	}
	
}
