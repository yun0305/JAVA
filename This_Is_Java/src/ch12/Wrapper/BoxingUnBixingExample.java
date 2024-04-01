package ch12.Wrapper;

/*
 * <포장 클래스>
 * 자바는 기본 타입 (byte, char, short, int, long, float, double, boolean) 의 값을 갖는 객체를
 * 생성할 수 있다. 이런 객체를 Wrapper 객체라고 한다, 값을 포장하고 있다고 해서 붙어진 이름이다.
 * 
 * 포장 객체를 생성하기 위한 클래스는 java.lang 패키지에 포함되어 있는데, char 타입과 int 타입이 각각
 * Character와 Integer 인것만 제외하고는 기본 타입의 척 문자를 대문자로 바꾼 이름을 가지고 있다
 * 
 * 포장 객체는 포장하고 있는 기본 타입의 값을 변경할 수 없고, 단지 객체로 생성하는 데 목적이 있다.
 * 이런 객체가 필요한 이유는 컬렉션 객체 때문이다. 15장에서 학습할 컬랙션 객체는 기본 타입의 값은 저장할 수 없고
 * 객체만 저장할 수 있다.
 * 
 * <박싱과 언박싱>
 * 기본 타입의 값을 포장 객체로 만드는 과정을 박싱이라고 하고 반대로 포장 객체에서 기본 타입의 값을 얻어내는 과정을
 * 언박싱이라고 한다.
 * 
 * 박싱은 포장 클래스 변수에 기본 타입 값이 대입될 때 발생한다. 반대로 언박싱은 기본타입 변수에 포장 객체가
 * 대입될때 발생한다
 * 
 * Integer obj = 100; //박싱 (new Integer(100); 도 된다)
 * int value = obj;   // 언박싱 (obj.intValue(); 도 된다)
 * 
 * 언박싱은 다음과 같이 연산 과정에서도 발생한다. obj는 100과 연산되기 전에 언박싱 된다.
 */

public class BoxingUnBixingExample {

	public static void main(String[] args) {
		
		//Boxing
		Integer obj = 100;
		System.out.println("value " + obj.intValue());
		//intValue() 메소드는 Integer 객체 내부의 int 값을 리턴한다.
		
		//UnBoxing
		int value = obj;
		System.out.println("vlaue " + value);
		
		//연산 시 Unboxing
		int result = obj.intValue() + 100;
		System.out.println("result "+ result);
		

	}

}
