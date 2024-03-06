package ch08._interface.constance_interface;

public interface Remotecontrol {
	//인터페이스 상수필드
	
	/*
	 * 인터페이스는 public static final의 특성을 갖는불변의 상수 필드를 멤버로 가질수 있다.
	 * [public static final] 타입 변수명 = 값;
	 * 
	 * 인터페이스에서 선언된 필드는 모두 public static final 특성을 갖기 때문에 public static final을 생략하더라도
	 * 자동적으로 컴파일 과정에서 붙게 된다. 상수명은 대문자로 작성하되, 서로 다른 단어로 구성되어 있을 경우에는 언더바(_)로
	 * 연결하는 것이 관례이다.
	 * 
	 * 인터페이스에서는 모든 필드가 상수이다.
	 * 인터페이스는 객체와 무관 하다
	 * 인터페이스는 설계도 개념이 아니라 설명서이다.
	 */
	
	public static final int MAX_VOLUM = 10;
	int MIN_VOLUM = 0;
}
