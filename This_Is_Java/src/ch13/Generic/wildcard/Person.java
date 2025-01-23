package ch13.Generic.wildcard;

	/*
	 * <와일드 카드 타입 파라미터>
	 * 
	 * 와일드 카드는 필드와 메소드 뿐만 아니라 제네릭 타입이 사용될 수 있는 모든 곳에서 
	 * 적용할 수 있다. 주로 제네릭 클래스 메소드 필드 지역변수 등에 사용할수 있다.
	 * 	
	 * <매개 값>: 메소드의 매개변수 타입으로 와일드카드를 사용해 특정 범위의 제네릭 타입을 허용할 수 있다.
	 * 
	 * public void processList(List<? extends Number> list) {
		    for (Number num : list) {
		        System.out.println(num);
		    }
		}
	 * 
	 * 
	 * <리턴타입> : 메소드의 리턴 타입으로 와일드 카드를 사용해 다양한 타입을 반환할 수 있다.
	 * 
	 * public List<? extends Number> getNumbers() {
		    return Arrays.asList(1, 2, 3);
		}
		
		<필드> : 클래스의 필드에 와일드 카드를 사용할수 있다. 
		
		private List<? super Integer> numbers; // Integer 및 상위 타입 허용

		    public void setNumbers(List<? super Integer> numbers) {
		        this.numbers = numbers;
		    }
		
		    public List<? super Integer> getNumbers() {
		        return numbers;
		    }
		}
		
		<제네릭 클래스의 타입 파라미터> : 클래스 정의에 와일드 카드는 사용할 수 없지만 제네릭 클래스의 필드나
		메소드에서 와일드 카드를 사용할 수 있다.
		
		class Box<T> {
		    public void print(Box<? extends Number> box) {
		        System.out.println("This is a box of numbers");
		    }
		}

		<와일드카드가 적용되지 않는 경우>
			1. 제네릭 클래스의 타입 파라미터 정의 
				제니릭 클래스 자체의 타입 파라미터에서는 와일드카드를 사용할 수 없다.
				
				class Box<?> { // 컴파일 에러
				    private ? value; // 컴파일 에러
				}
				대신 구체적인 타입 파라미터 (A~Z) 를 정의해야한다.
				
			2. 제네릭 메소드의 타입 파라미터 선언:
				와일드카드는 메소드의 타입 파라미터 선언부에 사용할 수 없다. 대신
				A~Z와 같은 형식으로 사용해야한다.

	 * 
	 * 
	 * "제네릭 타입(클래스)을 매개값이나 리턴 타입으로 사용할 때" 타입 파라미터로 ?(와일드 카드)를 사용할 수 있다.
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
	 * 리턴타입 메소드명(클래스명<? extedns Student> 변수){}
	 * 
	 * ex)
	 * 반대로 Worker와 부모 클래스인 Person만 가능하도록 매개변수를 다음과 같이 선언할 수 있다.
	 * Worker 의 조상 클래스들은 모두 허용 부모의 부모까지 전부 허용이라는 뜻이다.
	 * 
	 * 리턴타입 메소드명(클래스명<? super Worker> 변수){}
	 * 
	 * ex)
	 * 어떤 타입이든 가능하도록 매개변수를 선언할 수도 있다.
	 * 
	 * 리턴타입 메소드명(클래스명<?> 변수){}
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