package ch13.Generic.Generic_Method;

/**
 * https://devlog-wjdrbs96.tistory.com/201
 * 제네릭 메소드는 메소드의 선언 부에 적은 제네릭으로 리턴 타입, 파라미터의 타입이 정해지는 메소드이다.
 * 
 * public static <T> T getName(T name){
 * 
 * return name;
 * }
 * 
 * 제네릭에 대한 예시를 보면서 이해해보자.
 * 
 * public class Student<T> {
 * 
 * 	static T name;
 * }
 * 
 * 먼저 static 변수는 제네릭을 사용할수 없다, 왜냐하면 Student 클래스가 인스턴스가 되기전에 static은 메모리에 올라가는데 이 때 name의 타입인 T가
 * 결정되지 않기 때문이다. 위와 같이 사용할 수 없는 것 이다.
 * 
 * 	static T getName(T name) {
		
	}
	
	static 메소드에도 클래스에 정의된  제네릭 T를 사용하면 에러가 발생하는 이유는
	static 변수와 마찬가지로 Student 클래스가 인스턴스화 되기 전에 메모리에 올라가기 떄문에 T의 타입이 정해지지 않기 때문이다.

 *	<제네릭 메소드는 static이 가능하다.>
 *	위에서 에러가 발생했는데 어떻게 가능한 것일까? 이럴 떄 사용하는 것이 제네릭 메소드이다. 
 *	제네릭 메소드는 호출 시에 매개 타입을 지정하기 때문에 static이 가능하다. 즉 인스턴스화 할때 정해지는게 아니라
 *	메소드 호출을 할떄 정해지기 떄문에 가능한거다.
 *  
 *  static <T> T getOneStudent(T id) {
 *		return id;
 *	}
 *	
 *	사용 방법은 위와 같이 return type 뒤에 제네릭을 사용해주면 된다. 여기서 주의해야 할 점은 Student 클래스에 지정한 제네릭 타입<T>와 제네릭 메소드에 붙은 <T>는 같은
 *	T를 사용하더라도 전혀 별개의 제네릭이라는 것이다.
 *
 *	클래스에 표시하는 <T>는 인스턴스 변수라고 생각하자, 인스턴스가 생성될 떄마다 지정되기 때문이다.
 *	그리고 제네릭 메소드에 붙은 T는 지역변수를 선언한 것과 같다고 생각하자.
 *	(메소드의 붙은 모든 T는 클래스에 붙은 T와 다르다.)
 *
 *	<제네릭 클래스와 독립적>
 *	
 *	다시 정리하자면 형식과 사용이 제네릭 클래스와 똑같지만, 클래스의 T와 제니릭 메소드의 <T>는 다르기 떄문에 잘 생각하자.
 *	그리고 제네릭 메소드는 그 메소드를 포함하고 있는 클래스가 제네릭인지 아닌지 상관없다
 *
 *	
 *
 * @param <T>
 */

public class Student<T> {
		
	//static T name; 사용불가.

	//static T getName(T name) {사용불가
		
	//}	
		
//	static <T> T getOneStudent(T id) {
//		return id;
//	}// 사용가능
	
	public T getOneStudent(T id) {//1
		return id;
	}
	
	public <T> T getId(T id){ 
		// 2 제네릭 클래스의 T와 다름 이럴경우 제네릭 메소드에 있는 타입 파라미터가 우선순위가 높아서 모든 T가 제네릭 메소드 꺼다
		return id;
	}
	
	public <S> T toT1(S id) { //3
		return (T)id;
	}
	
	//public static <S> T toT2(S id){ //4 에러
	//	   return id;
	//}  // 4 에러 
	
	/*
	 *1번의 경우 클래스의 제네릭 타입 T를 그대로 사용하는 경우다.
	 *2번의 경우 클래스의 제네릭 타입 T와 제네릭 메소드 타입 T는 다르다. 제네릭 메소드가 우선순위가 높아서 T전부 제네릭 메소드로 인식
	 *3번의 경우 static 메소드가 아닌 일반 메소드이기 때문에 클래스의 타입과 제네릭 메소드의
	 * 타입을 같이 사용 가능하다.
	 *4번의 경우 static 메소드이기 때문에 클래스의 제네릭 타입 T를 사용하기 때문에 에러가 발생한다. 
	 */
	
}
