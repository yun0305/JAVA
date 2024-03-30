package ch13.Generic.GenericType.GenericInterface;

public class test {

	public <T> void test(T val) {
		 T Localval = val;
	}
	
}

/*
 * 메소드에서 사용되는 타입 파라미터의 구체적인 타입은 대부분 매개변수를 통해 추론됩니다.
 * 하지만, 매개변수가 없을 경우 타입 파라미터 T의
 * 구체적인 타입을 직접 명시하지 않으면 컴파일러가 추론할 방법이 없습니다.
 * 이러한 상황에서 T의 타입은 메소드 호출 시점에 명시적으로
 * 지정하거나, 특정 상황에 따라 컴파일러의 기본 규칙에 따라 결정됩니다.
 * 
 * 예를 들어, 아래와 같이 타입 파라미터가 있는 메소드가 있지만 매개변수가 없는 경우를 생각해보겠습니다:
 * 
 * public <T> void test() { 
 *  메소드 본문 
 *  } 
 * 이 경우, T의 타입을 추론할 매개변수가 없기
 * 때문에, 메소드를 호출할 때 타입 파라미터를 명시적으로 제공해야 합니다. 
 * 
 * 예를 들어:
 * obj.<String>test(); // T를 String으로 명시적으로 지정 이와 같이 메소드 호출 시에 타입
 * 인자를 명시적으로 지정함으로써 T의 구체적인 타입을 지정할 수 있습니다.
 * 하지만 이 방법은 일반적으로 타입 파라미터가 메소드 매개변수나
 * 반환 값에 사용되지 않는 경우에만 필요하며,
 * 그렇지 않은 대부분의 상황에서는 타입 파라미터가 메소드 매개변수를 통해 자연스럽게 추론됩니다.
 * 
 * 그러나 실제로 타입 파라미터를 매개변수나 반환 값에 사용하지 않는 제네릭 메소드는 드물며,
 * 대부분의 경우에는 타입 파라미터가 메소드의
 * 매개변수, 반환 값, 또는 내부 로직에서 사용되어 그 타입을 추론할 수 있는 정보를 제공합니다.
 * 따라서, 매개변수를 통한 타입 추론이
 * 불가능한 경우는 상대적으로 특수한 경우에 해당합니다.
 */