package ch13.Generic;

public class 제네릭_메소드_매개변수없이_타입추론 {

	/*https://chat.openai.com/share/0bdffd0b-bcd4-4836-8a69-9dd801e5182e
	 * 
	제네릭 메소드에서 매개변수가 없는 경우, 컴파일러는 타입 파라미터의 타입을 직접적으로 추론할 수 있는 정보가 없기 때문에
	기본적으로 타입 추론이 어렵습니다. 그럼에도 불구하고,
	메소드의 반환 타입이나 호출 시점에서 제공하는 추가적인 정보를 사용하여 타입을 추론할 수 있는 경우가 있습니다.
	
	여기에는 몇 가지 방법이 있습니다:
    ////////////////////////////////////////////////////////////////////////////////////
	반환 타입 사용:
	메소드의 반환 타입이 제네릭이면, 메소드 호출 결과를 받는 변수의 타입을 통해 컴파일러가 타입을 추론할 수 있습니다.

	public class Utility {
    	public static <T> T getDefault() {
        	return (T) null;
    	}
	}

	// 사용 예
	String result = Utility.<String>getDefault();
	
	이 경우, String result 선언을 통해 getDefault()의 T가 String임을 명시적으로 추론할 수 있습니다.
	
	메소드 호출 시 타입 인자 명시:
	
	호출 시점에 타입 인자를 명시적으로 제공하면, 제네릭 메소드의 타입 파라미터를 명확하게 지정할 수 있습니다.
	
	Integer value = Utility.<Integer>getDefault();
	
	여기서 <Integer>는 메소드의 T가 Integer 타입임을 직접 명시합니다.
	////////////////////////////////////////////////////////////////////////////////////
	  
	컨텍스트 기반 추론:
	때때로 메소드가 다른 제네릭 메소드의 일부로 사용되거나, 특정한 타입 컨텍스트 내에서 사용될 때, 컴파일러는 그 컨텍스트를 통해 타입을 추론할 수 있습니다.

	public class Utility {
    	public static <T> List<T> one(T item) {
        	List<T> list = new ArrayList<>();
        	list.add(item);
        	return list;
    	}

    public static <T> T first(List<T> list) {
        return list.get(0);
    }
}
	////////////////////////////////////////////////////////////////////////////////////

// 메소드 체이닝을 통한 타입 추론
	Integer num = Utility.first(Utility.one(123));
	
	여기서 Utility.one(123)는 List<Integer>를 반환하고,
	 이를 통해 Utility.first의 T가 Integer임을 추론합니다.
	이렇듯 제네릭 메소드에서 타입 추론은 다양한 컨텍스트나 명시적 지정을 통해 가능하지만,
	 매개변수가 없는 경우에는 이런 방법들이 필요하게 됩니다.
	////////////////////////////////////////////////////////////////////////////////////
	 */
}
