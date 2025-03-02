package ch13.Generic.wildcard;

	

	/*
	 * <와일드 카드>
	 * 와일드 카드는 제네릭 타입의 불특정 타입을 나타내는 기호다
	 * 제네릭 타입을 가져야 와일드 카드 사용가능 아무대나 붙일수 없다는거다. 또한 제네릭 선언부에는 사용할수 없다.
	 * 주로 제네릭 클래스나 메소드를 사용할 떄, 타입 파라미터를 유연하게 처리하기 위해 사용된다.
	 * 
	 * 		<와일드카드의 종류>
	 * 			와일드 카드는 크게 세 가지 종류가 있다.
	 * 			
	 * 			1. 제한 없는 와일드 카드(?)
	 * 				?은 모든 타입을 받을수 있다.
	 * 
	 * 				public static void printList(List<?> list) {
					    for (Object obj : list) {
					        System.out.println(obj);
					    }
					}
					
					List<String> strList = Arrays.asList("apple", "banana");
					List<Integer> intList = Arrays.asList(1, 2, 3);
					
					printList(strList); // 가능
					printList(intList); // 가능
	 * 				
	 * 				모든 제네릭 타입을 받을 수 있다.
	 * 				List<?> 는 List<String>, List<Integer> 등 어떤 리스트든 허용
	 * 				하지만 타입이 정해지지 않았기 떄문에 값을 추가하거나 수정할수 없다.
	 * 
	 * 
	 * 			2.상한 제한 와일드 카드(? extends T)
	 * 				T 또는 T의 자식 클래스만 받을 수 있다 
	 * 				
	 * 				public static double sumNumbers(List<? extends Number> list) {
					    double sum = 0;
					    for (Number num : list) {
					        sum += num.doubleValue(); // Number의 메서드만 사용 가능
					    }
					    return sum;
					}
					
					List<Integer> intList = Arrays.asList(1, 2, 3);
					List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);
					
					System.out.println(sumNumbers(intList)); // 6.0
					System.out.println(sumNumbers(doubleList)); // 7.5

					✔️ List<? extends Number> → Integer, Double, Float 같은 숫자 타입 리스트만 가능
					✔️ 읽기(Read) 가능, 값 추가(Write) 불가능
					
					list.add(10); // ❌ 컴파일 에러 (타입을 정확히 알 수 없음)

	 * 			3.하한 제한 와일드카드(? super T)
	 * 				T또는 T의 부모 클래스만 박을 수 있음 
	 * 				
	 * 				public static void addNumbers(List<? super Integer> list) {
					    list.add(10);
					    list.add(20);
					}
					
					List<Integer> intList = new ArrayList<>();
					List<Number> numList = new ArrayList<>();
					
					addNumbers(intList); // 가능
					addNumbers(numList); // 가능
					
					✔️ List<? super Integer> → Integer, Number, Object 타입의 리스트만 가능
					✔️ 값 추가(Write) 가능, 하지만 정확한 타입을 모르므로 Read는 제한적
					
					Number n = list.get(0); // 가능 (최상위 타입 Number)
					Integer i = list.get(0); // ❌ 컴파일 에러 (타입 보장 불가)

	 * 
	 */

	 /* 
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