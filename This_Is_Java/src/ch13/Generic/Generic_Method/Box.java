package ch13.Generic.Generic_Method;

/*
 * <제네릭 메소드>
 * 제네릭 메소드는 타입 파라미터를 가지고 있는 메소드를 말한다.
 * 타입 파라미터가 메소드 선언부에 정의된다는 점에서 제네릭 타입과 차이가 있다.
 * 제네릭 메소드는 리턴 타입 앞에<> 기호를 추가하고 타입 파라미터를 정의한 뒤, 리턴 타입과 매개변수 타입에서 사용한다.
 * 
 * ex)
 * public <A,B...> 리턴타입 메소드명(매개변수,...){}
 * 
 * 다음 boxing()메소드는 타입 파라미터로 <T>를 정의하고 매개변수 타입에서
 * T를 사용한다. 정확한 리턴 타입은 T를 내용물로 갖는 Box 객체이다.
 * 
 * ex)
 * 1.Box<Integer> box1 = boxing(100);
 * 2.Box<String> box2 = boxing("안녕하세요");
 * 
 * 1은 100의 클래스 타입이 Integer이므로 타입 파라미터 T는 Integer로 대체되어 Box<Integer>가 리턴된다.
 * 2는 "안녕하세요"의 클래스 타입이 String이므로 타입 파라미터 T는 String으로 대체되어 Box<String>이 리턴된다.
 * 
 * 실습을 해보자 먼저 제네릭 타입인 Box클래스를 다음과 같이 선언한다.
 *  
 * 
 */

public class Box<T> {

	private T t;
	
	//Getter 메소드
	public T get() {
		return t;
	}
	
	//Setter 메소드
	public void set(T t) {
		this.t = t;
	}
	
	
}
