package ch15Data_Structure_Collection_Framework.Map_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	/*
	 * Map 컬랙션은 키와 값으로 구성된 엔트리 객체를 저장한다.
	 * API 도큐먼트에 java.util.Map 에 Nested 를 보면 중첩 인터페이스로 
	 * Map.Entry<K,V> 선언되어 있다. 엔트리란 엔트리 인터페이스를 구현한 객체이고
	 * 
	 * 그게 맵컬랙션 객체에 저장된다. 구현객체의 구조는 키와 값으로 되어있다 어떤키로
	 * 어떤 값을 저장한다 이런뜻이다. List나 Set같은 경우 값만 저장한다 값이 객체이다
	 * 
	 * 모든 컬랙션은 객체가 저장되는 거다. 객체 자체가 저장되는 것이 아니라 객체의 번지가
	 * 저장된다. 엔트리에 키와 값에서 값에 객체의 주소가 들어가는거다. 그럼 키는 뭐냐
	 * 
	 * 키도 역시 객체이다 키도 값이고 값도 객체이다. 여기서 키는 중복이 되면 안된다.
	 * 왜 중복이 되면 안되냐면 값들을 식별하는 용도로 쓰기 때문에 키가 같아 버리면 값들을 
	 * 식별 할수가 없다. 그래서 키는 중복이 되면 안된다. 그리고 값은 중복이 될수 있다.
	 * 
	 * 그래서 map 컬랙션에 값을 저장할때는 객체를 하나만 주면 안되고 값도 같이 줘야한다.
	 * 
	 * 그래서 객체를 추가할때 메소드명이 조금 다른데 add 가 아니라 put으로 추가한다.
	 * 
	 * V put(K key, V value) 첫번쨰 매개값은 키 두번쨰 매개값은 value 키와 값을 같이 줘야한다.
	 * 자 그러면 객체를 찾아 올떄는 어떻게 찾아오냐면
	 * 
	 * 키를 주면 해당 키에 해당하는 값을 얻을수 있다. 도큐먼트에 보면 
	 * V get(Object key) 이라는 메소드가 여기에 매개값으로 키를 주면 이 키에 해당되는 
	 * 값 객체를 리턴한다.
	 * 
	 * 제거할떄는 V remove(Object key) 매개값으로 키를 주면 제거한다. 그래서 키를 주면
	 * 제거가 되는데 엔트리 자체가 제거가 된다.  기타 여러 메소드 들이 있다
	 * 
	 * 기능			메소드								설명
	 * 	
	 * 객체추가 	V put(K key, V vlaue)				주어진 키와 값을 추가, 저장이 되면 값을 리턴
	 * 
	 * 객체검색		boolean containsKey(Object key)		주어진 키가 있는지 여부
	 * 
	 * 객체검색		boolean containsValue(Object value)	주어진 값가 있는지 여부
	 * 
	 * 객체검색		Set<Map.Entry<K,V>> entrySet()		키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 리턴
	 * 
	 * 객체검색		V get(Object key)					주어진 키의 값을 리턴
	 * 
	 * 객체검색		boolean isEnpty()					컬랙션이 비어있는지 여부
	 * 
	 * 객체검색		Set<K> keySet()						모든 키를 Set 객체에 담아서 리턴
	 * 
	 * 객체검색 	int size()							저장된 키의 총 수를 리턴
	 * 
	 * 객체검색		Collection<V> values()				저장된 모든 값 Collection에 담아서 리턴
	 * 
	 * 객체삭제		V remove(Object key)				주어진 키와 일치하는 Map.Entry 삭제, 삭제가 되면 값을 리턴
	 * 
	 */
	
	/*
	 * 이제 map 인터페이스를 구현한 클래스가 4개가 있는데 그중에 하나가 HashMap이다.
	 * 
	 * HashMap 같은 경우에 키와 값으로 저장을 하는데 키는 중복저장이 안된다.
	 * 그럼 중복이 되냐 안되냐는 뭘로 가지고 판단하냐면 동등객체로 판단한다. 동등객체가
	 * 되면 같은 키로 판단을 한다. 비록 객체는 다르더라도  같은 키로 보겠다는거다. 
	 * 
	 * 선언 문법
	 * Map<String(키 타입), Integer(값 타입)> map = new HashMap<String, Integer>();
	 * Map<String, Integer> map = new HashMap<>();
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		
		//Map 컬랙션 생성
		//String 과 Integer로 구성된 엔트리를 만들겠다.
		Map<String,Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("신용권",85);
		map.put("홍길동",90);
		map.put("동장군",80);
		map.put("홍길동",95);//키가 같기 떄문에 제일 마지막에 저장한 값만 저장.
		System.out.println("총 Entry 수 " + map.size());
		
		//키로 값 얻기
		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key+" : "+value);
		System.out.println();
		
		//키 set 컬랙션을 얻고 반복해서 키와 값을 얻음
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k+" : "+ v);
		}
		System.out.println();
	
	//엔트리 set 컬랙션을 얻고 반복해서 키와 값을 얻기
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String,Integer> entry = entryIterator.next();
			
			String k = entry.getKey();
			int v = entry.getValue();
			System.out.println(k +" : " + v);
		}
	
	//키로 엔트리 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
//22분 43초	
	}

}

/*
 * 이제 내가 궁금했던 거는  Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); 여기서  Set<Entry<String, Integer>> entrySet = map.entrySet(); 이러게 해도 잘되는데 Entry에 Map을 안붙여 줘요 가능한 이유가 뭐야? 이거 중첩 인터체이스잖아 중첩인터페이스인데 도큐먼트 보니까 static 이더라고 그래서 Map 객체가 필요없이 그냥 Map.Entry로 접근이 가능한건 당연히 이해가 되는데 그냥 Entry로 사용 가능한 이유는 모르겠어 알려줘
ChatGPT의 말:
ChatGPT
좋은 질문이야! Map.Entry를 Entry로 사용해도 문제없이 동작하는 이유는, Map.Entry가 static 중첩 인터페이스이기 때문에, import 문을 통해 Entry만 별도로 임포트할 수 있기 때문이야.

중첩 인터페이스와 static 키워드
Map.Entry는 Map 인터페이스 내부에 정의된 static 중첩 인터페이스이기 때문에, 외부 클래스인 Map 객체와 독립적으로 존재할 수 있어. 즉, Map 클래스나 인스턴스에 의존하지 않고도 Map.Entry 인터페이스를 사용할 수 있다는 뜻이지.

import의 역할
Map.Entry를 코드에서 Entry로 간단히 사용할 수 있는 이유는, import 문을 통해서 Map.Entry를 바로 임포트할 수 있기 때문이야. 만약 코드 상단에 다음과 같은 import 문이 있다면:

java
코드 복사
import java.util.Map.Entry;
이렇게 하면 Map.Entry를 Entry로 바로 사용할 수 있게 돼. 그래서 코드에서 Set<Entry<String, Integer>>처럼 사용해도 컴파일러가 이 Entry가 Map.Entry라는 것을 알고 있기 때문에 문제없이 동작하는 거야.

Map.Entry의 정의와 static의 역할
Map.Entry가 Map 인터페이스 안에서 정의되었지만, **static**으로 선언되어 있기 때문에 Map의 인스턴스나 구현 클래스와 무관하게 독립적으로 사용할 수 있어.

중첩 인터페이스: 인터페이스나 클래스 안에 정의된 인터페이스.
static: static 중첩 인터페이스는 외부 클래스의 인스턴스 없이도 독립적으로 사용할 수 있음.
예시 코드:
java
코드 복사
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;  // Map.Entry를 직접 import해서 Entry로 사용

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        
        map.put("Java", 80);
        map.put("Python", 90);
        map.put("JavaScript", 85);
        
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        
        for (Entry<String, Integer> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
결론:
Map.Entry를 그냥 Entry로 사용할 수 있는 이유는 import java.util.Map.Entry;를 통해서 별도로 임포트할 수 있기 때문이야.
Map.Entry는 static 중첩 인터페이스이므로 외부 클래스인 Map에 의존하지 않고 독립적으로 접근할 수 있어.
이 덕분에 Set<Entry<String, Integer>>처럼 Entry를 간단하게 사용할 수 있게 돼.
이제 더 명확해졌을 거야!






나의 말:
와아아 몰랐어 중첩인터페이스가 따로 import 가 되는구나!! 근데 이게 static이라서 가능한거지?
ChatGPT의 말:
ChatGPT
맞아! 정확해! 중첩 인터페이스가 따로 import가 가능한 이유는 static 중첩 인터페이스이기 때문이야.

왜 static이라서 가능한지 설명해 줄게:
1. static 중첩 클래스/인터페이스의 특징
static으로 선언된 중첩 클래스나 인터페이스는 외부 클래스의 인스턴스에 종속되지 않아. 즉, 외부 클래스의 객체가 없어도 직접적으로 사용이 가능해.
Map.Entry는 Map의 내부에 정의되어 있지만, static이기 때문에 Map 인스턴스가 없어도 Map.Entry를 독립적으로 사용할 수 있어.
그래서 import할 때도 굳이 Map.Entry로 사용할 필요 없이, **Entry만 따로 import**할 수 있는 거야.
2. 비-static 중첩 클래스/인터페이스와의 차이점
만약 중첩 인터페이스가 static이 아니라면, 외부 클래스의 인스턴스가 필요해. 이런 경우는 외부 클래스의 인스턴스 없이 독립적으로 사용할 수 없기 때문에, 따로 import할 수 없고 항상 외부 클래스와 함께 사용해야 해.
즉, static 중첩 클래스나 인터페이스는 외부 클래스와의 관계가 느슨해져서 더 자유롭게 사용할 수 있지만, 비-static인 경우는 외부 클래스에 의존적인 구조를 가지게 돼.
예시:
java
코드 복사
import java.util.Map.Entry; // static 중첩 인터페이스인 Map.Entry를 직접 import 가능

// Map.Entry를 그냥 Entry로 사용
Set<Entry<String, Integer>> entrySet = map.entrySet();
만약 Entry가 static이 아니었다면, 외부 클래스인 Map의 인스턴스가 필요했을 거고, 이렇게 자유롭게 사용할 수 없었을 거야.

결론:
static 중첩 인터페이스이기 때문에 import가 가능하고, 독립적으로 사용할 수 있어.
만약 static이 아니었다면, 항상 외부 클래스(Map)와 함께 사용해야 하고, 독립적으로 import할 수 없었을 거야.
이제 더 명확해졌지? static 덕분에 중첩된 인터페이스도 이렇게 독립적으로 쓸 수 있는 거야!
 * 
 */
