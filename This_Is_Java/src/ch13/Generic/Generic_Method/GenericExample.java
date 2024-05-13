package ch13.Generic.Generic_Method;

/*
 * 다음 GenericExample 클래스는 제네릭 메소드인 boxing을 선언하고 호출하는 방법을
 * 보여준다.
 * 
 * 
 * 
 */

public class GenericExample {

	public static <T> Box<T> boxing(T t){// 메소드가 타입 파라미터를 추론하는 방법은 매개변수로 추론한다.
		Box<T> box = new Box<T>();		//제네릭 메소드는 리턴타입 앞에 <T>를 사용하지 않으면 내부에서 T 를 사용할수 없다
		box.set(t);						//하지만 다른 방법으로 호출할때 명시해줄수 있다. (test 메소드를 볼것)
		return box;
	}
	
	public static <C>  int test() { //추론 방법이 없지만 이메소드를 호출할때 <Integer>test();로 명시가능
	
		return 1;
	}
	
	public static void main(String[] args) {
	
	GenericExample.<Integer>test();
		
		
	Box<Integer> box1 = GenericExample.<Integer>boxing(100);//생략가능
	int inValue = box1.get();
	System.out.println(inValue);
	
	
	Box<String> box2 = boxing("안녕하세요");
	String strValue = box2.get();
	System.out.println(strValue);
	}

}


/*
 * User
그럼 제네릭 클래스랑 제네릭 메소드는 서로 독립적으로 타입 파라미터를 사용하네?
ChatGPT
네, 정확합니다. 제네릭 클래스와 제네릭 메소드는 각각 독립적으로 타입 파라미터를 정의하고 사용합니다.
이 두 구조는 서로의 타입 파라미터에 대해 알지 못하며, 각각의 타입 파라미터는 해당 범위 내에서만 유효합니다.

제네릭 클래스
제네릭 클래스는 클래스가 다루는 데이터 타입을 클래스가 인스턴스화될 때 지정할 수 있게 합니다.
이 타입 파라미터는 클래스의 전체에 걸쳐 사용될 수 있습니다.
예를 들어, ArrayList<E> 클래스는 제네릭 타입 E를 사용하여 다양한 타입의 요소를 저장할 수 있는 컬렉션을 제공합니다.

제네릭 메소드
제네릭 메소드는 메소드가 호출될 때 메소드의 파라미터 타입, 반환 타입, 로컬 변수 타입 등을 유연하게 정의할 수 있습니다.
이 타입 파라미터는 오직 메소드 내부에서만 유효하며, 메소드의 선언과 호출에 따라 그 타입이 결정됩니다.

독립성의 예
제네릭 클래스 내에서 제네릭 메소드를 정의할 수 있지만, 메소드의 타입 파라미터는 클래스의 타입 파라미터와는 독립적입니다.
예를 들어, 아래의 코드를 보면:

public class Box<T> {
    private T t; // T는 Box 클래스의 타입 파라미터

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    // 제네릭 메소드 예시. 여기서의 <E>는 Box 클래스의 <T>와는 독립적입니다.
    public <E> void inspect(E e) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("E: " + e.getClass().getName());
    }
}
위의 Box 클래스는 제네릭 타입 T를 사용하지만, inspect 메소드는 자신만의 제네릭 타입 E를 정의합니다.
이 메소드 내에서 E는 메소드 파라미터의 타입으로 사용되며, Box 클래스의 타입 파라미터 T와는 완전히 독립적입니다.

이처럼 제네릭 클래스와 메소드는 각각의 타입 파라미터를 사용하여 유연성과 타입 안전성을 제공하지만,
이들의 타입 파라미터는 서로 독립적으로 작동합니다.






 * 
 * 
 */