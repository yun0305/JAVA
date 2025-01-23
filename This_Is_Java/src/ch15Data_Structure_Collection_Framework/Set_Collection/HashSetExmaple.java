package ch15Data_Structure_Collection_Framework.Set_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * <Set>
 * 이번엔 Set 컬래션이다.
 * set 컬랙션의 특징이 뭐였냐면 set은 인덱스로 관리하지 않는다. 그리고
 * 중복해서 객체를 저장할수 없다. List 컬랙션은 저장 순서를 유지하지만
 * set컬랙션은 저장 순서가 유지되지 않는다.
 * 
 * 다시 말해 먼저 저장했다고 해서 먼저 검색되지는 않는다라는 그런 뜻이다.
 * 순서 없이 저장된다는 거다. 그래서 객체를 중복해서 저장할 수 없고 Null을 저장할수는 있지만,
 * Null또한 중복저장이 않되기 때문에 하나의 Null만 넣을수 있다 하지만 Null을 저장할 일은 거의 없다.
 * 
 * 그래서 set은 수학의 집합의 비유될 수 있다. 또 구슬 주머니와 유사하다. 구술 주머니에 구슬이 들어가면
 * 구슬이 막 섞여 버린다. 순서가 없다는 거다. 그리고 똑같은 구슬을 두번 저장할수 없다.
 * 
 * 그래서 인덱스로 관리를 하지 않기 때문에 set 인터페이스가 가지고 있는 메소드는 인덱스를 매개변수로
 * 갖는 메소드가 하나도 없다. 
 * 
 * API 도큐먼트에서 찾아 보겠다. java.util.set에 있다.
 * 
 * set도 제네릭 타입이다.(set<E>) set이 가지고 있는 메소드를 보면
 * 
 * 메소드
 * <add(E e)>
 * 보면 인덱스가 없다 그냥 객체만 저장한다. 
 * 
 * <remove(Object o)>
 * 역시 인덱스로 지우는 건 없다.
 * 
 * 그런데 객체를 가지고 오는 메소드는 없다. 저번 시간에 배운 List는 get이 있었다. 
 * set은 객체를 하나하나 가져오는 방법이 없다.
 * 
 * 그러면 저장만 할수 있고 가져올수 없다고 하면 효용 가치가 없는거 아닐까 라는 생각이 들지만.
 * 하나하나씩 갖고 오는 기능은 없다는 거지 set 안에 있는 요소를 꺼낼 방법이 없다는 건 아니다
 * 
 * 메소드중에 iterator() 라는 메소드가 있다.
 * 
 * <iterator()>
 * iterator는 반복자라는 뜻이다. 왜 반복자라고 하냐면 반복해서 요소를 준다고 해서 반복자라고 한다.
 * 그래서 iterator()를 호출하면 리턴타입이 Iterator<E>라는 타입으로 나온다. 
 * 
 *  Iterator<E>를 보면 인터페이스 타입이다. 그리고 제네릭 타입이다. 그래서 set 안에 String이 들어가 있다면
 *  Iterator는 자동으로 String이 되어있는거다. set안에 Member가 들어가 있다면 자동으로 Member가 되는거다.
 *  
 *  아까도 말했지만 Iterator는 반복자이다 왜 반복자라고 부르냐면 반복해서 요소를 가져온다해서
 *  반복자라고 한다.
 *  
 *  Iterator인터페이스가 가지고 있는 메소드를 보게 되면 hasNext() has 가들어가면 가지고 있는냐 이런
 *  뜻으로 해석할수 있다. 다른 클래스들도 이런 메소드 네이밍으로 정의된 메소드가 많다
 *  
 *  어쨋든 hasNext는 다음거를 가져올게 있느냐 물어보는 거다. 가져올게 있으면 true 없으면 false가 되는 거다.
 *  
 *  그리고 next() 라는 메소드가 있는데 next()는 가져올게 있어야  next()를 사용할수 있다.
 *  가져올게 없는데 next()를 사용하면 예외가 발생한다. 그래서 항상 next()를 사용하기 전에
 *  
 *   가져올게 있느냐부터 확인을 하고 가져올게 있으면 하나를 가져온다 
 *   
 *   내 개인적인 생각인데 대충 코드구조 는 이럴것 같다
 *   
 *   if(hasNext()){
 *   	next();
 *   }
 *  
 *  그다음 remove() 라는 메소드가 있다. remove는 현재 가져온 객체를 제거하겠다 라는 메소드다
 *  그럼 어디서 제거가 일어나냐면 set에서 제거가 일어난다. Iterator에서 제거가 일어나는게 아니라
 *  set에서 제거가 된다.
 *  
 *  글로 설명을 하자면 set객체 가 있다 set 안에는 객체가 a,b,c 3개가 들어가 있다. Iterator는 set 안에
 *  객체의 개수를 파악해서 hasNext()로 가져올게 있느냐 물어본다.
 *  그리고 next()로 객체를 가져올수 있다. 가져온 객체를 a객체라고 치고 그럼 남은게 b,c객체이다.
 *  다시 hasNext() 하면 가져올게 있으니까 true다. 다시 next()로 C를 가져왔다 치자.
 *  
 *   그럼 set안에는 b객체 하나 남은거다. 
 *   다시 또 가져올게 있냐 해서 가져온다 b도 가져왔다
 *   이제 다 한번씩 가져왔다. 이제 더이상 가져올게 없다. 
 *   
 *   그렇다고해서 객체를 꺼내서 가져온다는 개념은 아니고  set에 있는 객체를 한번씩 참조해서 가져온다는 거지
 *   여기 set에 있는걸 지우겠다는 건 아니다. 
 *   
 *   이제 가져온 객체를 remove 메소드를 사용해서 제거를 한다. 그럼 set안에서 제거가 된다.
 *   
 *   가져올땐 참조해서 가져온 거지만 참조한걸 remove시키면 set 안에서 지워버진다.
 *   실제로 remove()는 유용하게 쓰일때가 있다고 한다...
 *   
 *   정리하자면
 *   
 *   set에서 객체를 추가할떄는 add() 객체를 삭제할떄는 remove()를 사용하는데(물론 clear도 있다. 객체를 다지운다.)
 *   그런데 객체를 가져오는건 iterator() 메소드를 통해서 가져온다. 나머지 메소드
 *   contains(Object),isEmpty() 메소드 들은 객체 여부만 조사한다. 
 *   
 *   주의할점은 iterator()은 딱 어떤 객체를 지목해서 가져오게 하는건 불가능하다. 그냥 전체 set에서
 *   하나씩 가져와서 처리하고 싶을떄 사용한다. 그래서 반복자인것이다. 그래서 반복자를 얻어서
 *   hasNext 해서 가져올게 있냐 물어보고 next로 가져온다. 만약 지울게 있으면 remove(Object)로 set에서 지우고
 *   
 *  <HashSet>
 *  Set 컬랙션 중에서 가장 많이 사용되는 것이 HashSet이다. 다음은 HashSet 컬랙션을 생성하는 방법이다.
 *  
 *  Set<E> set = new HashSet<E>(); 	//E에 저장된 타입의 객체만 저장
 *  Set<E> set = new HashSet<>(); 	//E에 저장된 타입의 객체만 저장
 *  Set set = new HashSet(); 	//모든 타입의 객체만 저장
 *  
 *  HashSet은 동일한 객체는 중복 저장하지 않는다. 여기서 동일한 객체란 동등 객체를 말한다.
 *  
 *  동등 객체인지 아닌지 판단할떄는 처음에 hashCode() 값이 같은지 본다.
 *  같다면(true) 그 다음에 equals()메소드가
 *  true가 나오는지 확인을한다.
 *  
 *  Set 컬랙션은 인덱스로 객체를 검색해서 가져오는 메소드가 없다 대신 객체를 한개씩
 *  반복해서 가져와야 하는데, 여기에는 두 가지 방법이 있다 하나는 for each 가져오는 방법인데
 *  
 *  지금 까지는 그냥 배열로 넣어서 사용했다 하지만 List도 사용할수 있다 코드를 보겠다
 *  
 *  Set<E> set = new HashSet<E>();
 *  for(E e : set){
 * 	...
 *  }
 *  
 *  이러면 set의 모든 객체가 하나씩 나오는데 여기서 새로운 사실은 향상된 for문에서 반복 시킬수 있는 이유가 
 *  뭐냐 이다.
 *  
 *  이유는 도큐먼드를 보면 알수 있다. 어떤 클래스든 어떤 인터페이스든 구현하고 있는 인터페이스 중에서 또는 상속하고
 *  있는 Interface중에서 Interable<E>(인터페이스)을 포함하고 있으면
 *  
 *  향상된 for문에서 사용이 가능하다.
 *  
 *  
 */
public class HashSetExmaple {

	public static void main(String[] args) {
		
		//HashSet 컬랙션 생성
		Set<String> set1 = new HashSet<String>();
		
		//객체 저장
		set1.add("Java");
		set1.add("JDBC");
		set1.add("JSP");
		set1.add("Java");//중복 객체임으로 중복 저장하지 않음
		set1.add("Spring");
		
		//저장된 객체 수 출력
		
		System.out.println(set1.size());
		
		Set<Member> set2 = new HashSet<Member>();
		
		set2.add(new Member("허윤",24));//객체는 다르지만 동등 객체이기 때문에 중복 저장이 안됨.
		set2.add(new Member("허윤",24));
		
		
		//Iterator로 객체 가져오기
		Iterator<String> iterator = set1.iterator();
		
		/*주의할점 Iterator는 일회용이다 한번 순회를 돌면 다시 iterator에 새롭게 참조를 해줘야 한다.
		 * 
		 */
		//잘못된 사용예)
//		for(int i=0;i<set1.size();i++) {
//			if(iterator.hasNext()) {
//				System.out.println(iterator.next());
//			}
//			}
//		for(int i=0;i<set1.size();i++) {
//			if(iterator.hasNext()) {
//				if(iterator.next().equals("Spring")) {
//				iterator.remove();
//				}
//				}
//		}
//		이러면 첫번쨰 for문에서 iterator가 next로 순회를 전부 돌았기 떄문에 다음 for문에서
//		같은 참조값으로 또 next를 하게 될 경우 더이상 next를 할게 없기 떄문에 지울수가 없다. 
		
		//옳바른 예
		
		while (iterator.hasNext()) {
		    System.out.println(iterator.next());
		}

		// JSP 삭제
		iterator = set1.iterator(); // 새로운 iterator 생성
		while (iterator.hasNext()) {
		    if (iterator.next().equals("JSP")) {
		        iterator.remove();
		    }
		}

		// JSP 삭제 후 남은 요소 출력
		iterator = set1.iterator();
		while (iterator.hasNext()) {
		    System.out.println(iterator.next());
		}
		
		System.out.println(set1.size());
		
		System.out.println("set2에 저장된 객체 " + set2.size()+"개");
		//17분33초
	}

}
