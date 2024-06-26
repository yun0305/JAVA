package ch13.Generic.wildcard;

	/*
	 * <와일드 카드 타입 파라미터>
	 * "제네릭 타입을 매개값이나 리턴 타입으로 사용할 때" 타입 파라미터로 ?(와일드 카드)를 사용할 수 있다.
	 * ?는 범위에 있는 타입으로 대체할 수 있다는 표시이다. 예를 들어 다음과 같은 상속 관계가 있다고 가정해보자
	 * 
	 * Person <- Worker
	 * 
	 * Person <- Student <- HighStudent <- MiddleStudent
	 * 
	 * ex)
	 * 타입 파라미터의 대체 타입으로 Student와 자식 클래스인 HighStudent와 MiddleStudent만 가능하도록 매개변수를
	 * 다음과 같이 선언할 수 있다.
	 * 
	 * 리턴타입 메소드명(<? extedns Student> 변수){}
	 * 
	 * ex)
	 * 반대로 Worker와 부모 클래스인 Person만 가능하도록 매개변수를 다음과 같이 선언할 수 있다.
	 * 
	 * 리턴타입 메소드명(<? super Worker> 변수){}
	 * 
	 * ex)
	 * 어떤 타입이든 가능하도록 매개변수를 선언할 수도 있다.
	 * 
	 * 리턴타입 메소드명(<?> 변수){}
	 * 
	 * 다음 예제에서 Course 클래스의 메소드 registerCourse1() 은 모든 사람이 들을 수 있는 과정을 등록하고,
	 * registerCourse2()는 학생만 들을 수 있는 과정을 등록한다. 그리고 registerCourse3()은 직장인과 일반인만
	 * 들을 수 있는 과정을 등록한다.
	 */


public class Person {

}
class Worker extends Person{
	
}

class Student extends Person{
	
}

class HighStudent extends Student{
	
}
class MiddleStudent extends Student{
	
}