package ch13.Generic;

public class 제네릭_메소드_매개변수없이_타입추론 {

	
	/* 
	예제 1: 단순 타입 추론
public class GenericMethodExample {
    	// 제네릭 메서드
    public static <T> T echo(T value) {
        return value;
    }

    public static void main(String[] args) {
        // 타입 추론: 인수 "Hello"의 타입은 String
        String result1 = echo("Hello");
        System.out.println(result1); // 출력: Hello

        // 타입 추론: 인수 123의 타입은 Integer
        Integer result2 = echo(123);
        System.out.println(result2); // 출력: 123
    }
}
	컴파일러의 타입 추론 과정:
	echo("Hello") 호출:

	인수 "Hello"의 타입은 String.
	따라서, 컴파일러는 <T>를 String으로 추론.
	반환 타입은 String으로 결정.
	echo(123) 호출:

	인수 123의 타입은 Integer.
	컴파일러는 <T>를 Integer로 추론.
	반환 타입은 Integer로 결정.
	예제 2: 복잡한 타입 추론
	
	import java.util.List;

	public class GenericMethodExample {
    // 제네릭 메서드
    	public static <T> void printList(List<T> list) {
        	for (T item : list) {
            	System.out.println(item);
        	}
    	}

    	public static void main(String[] args) {
        	List<String> stringList = List.of("Apple", "Banana", "Cherry");
        	List<Integer> intList = List.of(1, 2, 3);

        	// 타입 추론: stringList의 타입은 List<String>
        	printList(stringList);

        	// 타입 추론: intList의 타입은 List<Integer>
        	printList(intList);
    	}
	}	
	컴파일러의 타입 추론 과정:
	printList(stringList) 호출:

	stringList의 타입은 List<String>.
	컴파일러는 <T>를 String으로 추론.
	printList(intList) 호출:

	intList의 타입은 List<Integer>.
	컴파일러는 <T>를 Integer로 추론.
	예제 3: 명시적 타입 지정
	제네릭 메서드는 기본적으로 타입을 추론하지만, 명시적으로 타입을 지정할 수도 있습니다.


	public class GenericMethodExample {
    	public static <T> T identity(T value) {
        	return value;
    	}

    	public static void main(String[] args) {
        	// 컴파일러가 타입을 추론
        	String result1 = identity("Hello");

        	// 명시적으로 타입 지정
        	Integer result2 = GenericMethodExample.<Integer>identity(123);

        	System.out.println(result1); // 출력: Hello
        	System.out.println(result2); // 출력: 123
    	}
	}
	설명:
	identity("Hello"):
	타입 추론으로 <T>를 String으로 결정.
	<Integer>identity(123):
	명시적으로 <Integer>를 지정하여 호출.
	타입 추론이 실패하는 경우
	타입이 명확하지 않을 때:
	
	컴파일러가 타입을 추론할 수 없는 경우 명시적으로 타입을 지정해야 합니다.
	java
	코드 복사
	public static <T> T genericMethod(T value1, T value2) {
	    return value1;
	}
	
	public static void main(String[] args) {
	    // 컴파일러가 타입 추론 불가능
	    // String인지 Integer인지 명확하지 않음
	    // genericMethod("Hello", 123); // 컴파일 에러
	
	    // 해결: 명시적으로 타입 지정
	    String result = GenericMethodExample.<String>genericMethod("Hello", "World");
	    System.out.println(result);
	}
	원시 타입 사용:
	
	제네릭은 원시 타입(int, double 등)과 함께 사용할 수 없습니다.
	대신 래퍼 클래스(Integer, Double 등)를 사용해야 합니다.
	결론
	타입 추론은 전달된 매개변수의 타입을 기반으로 이루어집니다.
	static 제네릭 메서드는 메서드 호출 시점에 타입을 결정하며, 명시적으로 타입을 지정할 수도 있습니다.
	타입 추론이 애매한 경우에는 명시적으로 타입을 지정해 컴파일러가 올바른 타입을 결정하도록 도와야 합니다. 
		 */
}
