package ch06.member;

public class 객체_변수로_정적필드나_메소드에_접근하는_원리 {

	
	
	/*
	 * 정적 필드나 메소드를 객체 변수로 불러오는 과정은 자바에서 문법적으로 허용되지만,
	 *  일반적으로 권장되지 않는 방법이다. 그럼에도 불구하고, 객체 변수를 통해 정적 멤버에 접근하는 방법을 설명하겠다.

	정적 필드에 접근하는 경우:

	public class MyClass {
	    public static int staticField = 10;
	}

	public class Main {
	    public static void main(String[] args) {
	        MyClass myObject = new MyClass();
	        int value = myObject.staticField; // 객체 변수를 통해 정적 필드에 접근
	        System.out.println(value); // 출력: 10
	    }
	}
	위의 예시에서는 MyClass라는 클래스의 객체를 생성한 후, myObject.staticField와 같이 객체 변수를 통해 정적 필드에 접근합니다.
	 이 경우, 실제로는 컴파일러가 정적 필드에 접근할 때 클래스 이름을 사용한 접근(MyClass.staticField)으로 변환합니다.
	  컴파일러가 객체 변수를 통한 접근을 허용하기 때문에 이런 방법으로 정적 필드에 접근할 수 있습니다.
	 */
	}






