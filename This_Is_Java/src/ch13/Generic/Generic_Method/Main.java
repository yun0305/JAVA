package ch13.Generic.Generic_Method;

public class Main {

	
	/*
  * public class GenericMethodExample {
   
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

	 */
	
	public static void main(String[] args) {
		
		Box<Integer> box1 = Util.<Integer>boxing(100);
		Box<String> box2 = Util.boxing("암묵적 호출");
	
	}
	
	/*
	 *제네릭 메소드를 호출하기 위해서는 2가지 방법이 있다. Main 클래스에서 처럼 호출할 때 타입을 지정하는 법과
	 *지정하지 않아도 되는 방법이 있다. 타입을 지정하게 되면 컴파일러가
	 *<Integer> 를 보고 타입을 지정한다. 그러나 암묵적호출일 경우 매개 타입이, String인 것을 보고
	 *컴파일러가 타입을 추정한다. 
	 */
	
}
