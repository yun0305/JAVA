package ch15Data_Structure_Collection_Framework.List_Collection.ArrayList;

public class Border {
	
	/* List<E> 인터페이스로 사용가능한 컬랙션을 알아보자.
	 * 
	 * List 인터페이스로 사용 가능한 컬랙션
	 * List 컬랙션은 객체를 인덱스로 관리한다. 인덱스로 관리하기 떄문에 순서가 있다. 그리고
	 * 객체를 중복 저장 가능하다. 예로 1인덱스에 a라는 객체를 저장하고 5인덱스에도 똑같은 a라는 객체를
	 * 저장할수 있다.
	 * 
	 * List 컬랙션에는 인덱스 개념이 있고 인덱스를 이용해서 객체를 검색하거나  객체를 삭제할떄 이용한다
	 * 
	 * List는 인터페이스 라고 이야기를 했다. 그럼 이 인터페이스를 통해서 내가 사용할수 있는 메소드는
	 * 뭐가 있냐면(List의 추상 메소드) 
	 * 
	 * <List 메소드>
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
	 * List를 공식 API문서에서 보면 인터페이스 제네릭 타입으로 정의 되어 있는것을 볼수 있다.
	 * 
	 * List<E>
	 * 
	 * 그래서 List 컬랙션 안에 저장할 수 있는 객체의 종류를 지정할수 있다
	 * 예로 내가 Member만 저장 하고 싶다면 List<Member> 문자열만 저장하고 싶다면 Member<String>
	 * 
	 * 다시 List는 인터페이스다 List 컬랙션 중에서 List 를 구현한 객체가 ArrayList,Vector,LinkedList
	 * 이렇게 있었다. 그러면 이러한 객체를 이용할떄 List 인터페이스를 통해서 이용할수 있다. 
	 * 
	 * 그럼 이 List에는 어떤 메소드가 선언 되어 있는 지를 보고 사용하면 된다.
	 * 메소드를 보면 전부 직관적이여서 굳이 외울 필요는 없을거 같다.
	 * 
	 * <add()> 
	 * add를 보면 2개의 메소드가 오버로딩이 되어 있다.
	 * boolean add(E e) 이 메소드를 먼저 보면
	 * 
	 * 그냥 객체를 받으면 추가하는건데 추가하는 방식이 인덱스 번호 제일 뒤어 추가한다.
	 * 마지막 인덱스 다음 인덱스로 객체를 저장을 한다.
	 * 
	 * void add(int index, E element) 이 메소드는 인덱스를 받는다.
	 * 특정 인덱스 위치에다가 객체를 저장하겠다. 이런 뜻이다.  그래서 이 메소드는 삽입의 효과가 난다.
	 * 예를 들어 0인덱스에 어떤 객체가 저장이 되어 있고, 1인덱스에 어떤 객체가 저장이 되어 있고,
	 * 2인덱스에 어떤 객체가 저장이 되어 있는데. 내가 1인덱스 위치에다가 새로운 객체를 저장을 하고 싶다.
	 * 그떄 사용하면된다.
	 * 
	 * 근데 1인덱스에 이미 객체가 있다. 그러면 하나씩 뒤로 밀린다.
	 * 
	 * <clear()>
	 * clear()는 컬랙션 안에 있는 모든 객체를 제거한다.
	 * 
	 * 
	 * <remove()>
	 * E remove(int index) 이것도 이름이랑 매개값만 봐도 유추가 가능하다.
	 * 1인덱스에 있는 객체를 지우고 싶으면 1를 매개값으로 주면 된다.
	 * 
	 * boolean remove(Object) 이 메소드는 언제 사용하냐 컬랙션에 어떤 인덱스에 저장되어 있는지
	 * 모를때 매개값으로 넘어온 객체를 지운다. 만약 지우고 싶은 객체가 있다면 지우고 true를 반환
	 * 없으면 false 
	 * 
	 * 
	 * 
	 * <get()>
	 * get(int index) 특정 인덱스에 있는 객체를 가지고 올떄 get을 사용
	 * 
	 * <메소드 타입>
	 * List<E>는 제네릭 타입이다. 제네릭 타입에 String을 넣어주게 되면 List 메소드의 매개값 E가 전부 String 으로
	 * 바뀐다. 만약 구체적인 타입을 정의해 놓지 않는다면 Object가 된다.
	 * 
	 * 인터페이스의 구성요소 상수, 추상메소드, default 메소드, static 메소드 private(or static private) 메소드
	 * 자바 API에서 List 메소드 중에 리턴타입만 있는건 전부 추상메소드 들이다.
	 * static이 붙은건 정적 메소드 default 메소드도 있다. 저번에 배웠지만 default 메소드는 구현객체가 없인 사용할수 없다.
	 * 
	 * 하지만 static으로 되어있는건 인터페이스 소속이기 떄문에 구현 객체 없이 사용할수 있다.
	 * 
	 * 메소드 들을 보면 index를 사용하는 매개값이 많다
	 * 
	 * 리스트는 인덱스라고 하는 번호가 부여되면서 객체를 저장하기 떄문에
	 * 그 인덱스를 가지고 객체를 저장하거나 또는 삭제하거나 또는 객체를 찾을떄 이용한다.
	 * 
	 * 현재 보면 ArrayList 그리고 Vector 라고 List 인터페이스를 구현한 객체라고 생각하면 된다.
	 *  
	 * 
	 * 
	 * 
	 */
	
	
	/*<ArrayList>
	 * 이제 ArrayList를 사용해 볼건데 ArrayList의 특징은 List 컬랙션의 구현객체이기 때문에
	 * 인덱스로 객체를 저장할수 있는데 그렇다고 해서 인덱스에 직접 객체가 저장되는 건 아니다.
	 * 
	 * 해당 객체의 번지(객체 주소) 가 저장이 된다. 모든 컬랙션은 List가 됬든 Set이 됬든 객체 자체가 저장되지 
	 * 않고 객체의 번지가 저장이 된다.
	 * 
	 * 그래서 인덱스에 저장이 되는 객체가 다 다를 수도 있지만 동일한 객체도 다른 인덱스로 저장을 할 수 있다
	 * 이걸 중북 저장이라고 이야기를 하는데 가능한 이유가 번지만 저장이 되기 떄문에 그렇다
	 * 
	 * <ArrayList 문법>
	 * List<E> list = new ArrayList<E>(); // E에 지정된 타입의 객체만 저장
	 * List<E> list = new ArrayList<>();  // E에 지정된 타입의
	 * List list = new ArratList();		  // 모든 타입의 객체를 저장	
	 * 
	 * 
	 * <ArrayList 구조>
	 * 구체적인 타입을 준것과 안준것의 차이점은 만약 구체적인 타입으로 Memeber라는 객체를 주면
	 * ArrayList에 저장되는 객체는 전부다. Member 객체이다.
	 * 
	 * 그런데 만약 정확한 타입을 주지 않으면 ArrayList에 저장되는 객체는 전부 Object 타입이다.
	 * 
	 * add로 객체를 추가하게 되면 인덱스의 순번대로 저장이되는데 만약 객체를 10개를 저장을 했다
	 * 인덱스가 0부터 해서 9까지 쭉 객체가 저장이 되었다 배열과 다르게 계속 추가할수 있다 20개 30개 
	 * 계속해서 저장을 할수 있다. 
	 * 
	 * 이제 삭제를 하는데 삭제할 떄는 clear나 remove를 사용한다고 했다. 
	 * 만약 인덱스 0부터 9까지 있는데 내가 4번 인덱스에 있는 객체를 지웠다. 그러면 4번이 비여있느냐
	 * 아니다. 기존에 5인덱스가 4가 되고 6인덱스가 5가되고 하나씩 앞으로 떙겨진다.
	 * 
	 * List 같은 경우 인덱스를 삭제한다고 해서 Null이 들어가는 건아니다. 앞으로 인덱스가 하나씩 떙겨질뿐
	 * 그래서 4를 두번지으면 기존에 4번 과 5번이 지워진다.
	 */
	
	private String subject;
	private String content;
	private String writer;
	
	public Border(String subject,String content,String writer) {
		
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	
}
