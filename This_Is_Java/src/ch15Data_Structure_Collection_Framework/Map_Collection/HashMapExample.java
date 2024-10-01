package ch15Data_Structure_Collection_Framework.Map_Collection;

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
	 * 객체검색		Collection<V> value()				저장된 모든 값 Collection에 담아서 리턴
	 * 
	 * 객체삭제		V remove(Object key)				주어진 키와 일치하는 Map.Entry 삭제, 삭제가 되면 값을 리턴
	 * 
	 * 	
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		

	}

}
