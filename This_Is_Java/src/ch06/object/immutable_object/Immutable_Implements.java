package ch06.object.immutable_object;

public class Immutable_Implements {

	/*
	 * <불변객체 구현 방법>
	 * 		
	 *	사용자 정의 클래스에서 불변 객체를 구현하려면 규칙이 있다.
	 * 			
	 * 		1.final 키워드:			
	 * 			클래스를 final로 선언하여 상속을 막는다.
	 * 
	 * 		2.모든 필드를 private로 선언한다.
	 * 			외부에서 직접 접근하지 못하도록 한다.
	 * 
	 * 		3.필드 값 수정 방지
	 * 			필드를 final로 선언하여 생성 후 값을 변경할 수 없게 한다.
	 * 
	 * 		4.setter 메소드를 제공하지 않음
	 * 			대신 모든 필드를 초기화하는 생성자를 제공함
	 */
		
	private final String name;
	private final int age;
	
	public Immutable_Implements(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	/*
	 * 결론
	 * 		가변 객체는 생성 후 상태를 변경할 수 있지만, 불변 객체는 생성 후 상태가 고정된다.
	 * 		
	 * 		자바에서 볼변 객체(String,Integer 등)는 주로 안정성과 스레드 안정성이 필요한 경우 사용된다.
	 * 
	 *  	불변 객체와 가변 객체의 차이를 이해하고 필요에 따라 적절한 설계를 선택해야 한다.
	 */
	
}
