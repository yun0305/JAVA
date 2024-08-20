package ch15Data_Structure_Collection_Framework.List_Collection;

public class Border {
	
	/* List<E> 인터페이스로 사용가능한 컬랙션을 알아보자.
	 * 
	 * List 컬랙션은 객체를 인덱스로 관리하기 때문에 객체를 저장하면 인덱스가 부여되고
	 * 인덱스로 객체를 검색, 삭제할 수 있는 기능을 제공한다.
	 * 
	 * List 컬랙션에는 ArrayList, Vector, LinkedList 등이 있는데, List 컬랙션에서 공통적으로
	 * 사용 가능한 List 인터페이스 메소드는 다음과 같다. 인덱스로 객체들이 관리되기 떄문에 인덱스를
	 * 매개값으로 갖는 메소드들이 많다.
	 * 
	 * 기능			메소드								설명
	 * 
	 * 객체 추가	boolean add(E e)		 			주어진 객체를 맨 끝에서 추가
	 * 				void add(int index, E element)		주어진 인덱스에 객체를 추가(뒤로 하나씩 밀려난다.)
	 * 				set(int index, E element)			주어진 인덱스의 객체를 새로운 객체로 바꿈	
	 * 
	 * 
	 * 
	 * 객체 검색	boolean contains(Object o)			주어진 객체가 저장되어 있는지 여부
	 * 				E get(int index)					주어진 인덱스에 저장된 객체를 리턴
	 * 				int size()							저장되어 있는 전체 수를 리턴
	 * 
	 * 
	 * 
	 * 객체 삭제	void clear()						저장된 모든 객체를 삭제
	 * 				E remove(int index)					주어진 인덱스에 저장된 객체를 삭제
	 * 				boolean remove(Object)				주어진 객체를 삭제(제거했으면 true 리턴 아니면 false)
	 * 
	 * <ArrayList>
	 * ArrayList는 List 컬랙션 에서 가장 많이 사용하는 컬랙션이다. ArrayList에 객체를 추가하면
	 * 내부 배열에 객체가 저장된다. 일반 배열과의 차이점은 ArrayList는 제한 없이 객체를 추가할 수
	 * 있다는 것이다. 
	 * 
	 * 22:21 필기 하고 실습하기 내용 이해 완료
	 * 
	 * 
	 * 
	 * 
	 */
	
	
}
