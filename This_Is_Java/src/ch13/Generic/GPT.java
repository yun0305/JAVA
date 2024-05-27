package ch13.Generic;

public class GPT {

	/* https://chat.openai.com/share/0bdffd0b-bcd4-4836-8a69-9dd801e5182e
	 * 

		제네릭 클래스의 기본 설명:
		Box<T> 클래스는 제네릭 타입 T를 사용하여 다양한 타입의 객체를 저장할 수 있습니다.
		클래스 내부에서 T는 저장되는 데이터의 타입을 지정합니다.
		
		compare 메소드와 제네릭:
		compare 메소드에서 Box<T> 타입의 매개변수를 사용할 경우,
		해당 메소드는 동일한 타입 T의 객체만 비교가 가능합니다.
		제네릭 메소드 <U> compare(Box<U> other)를 사용하면 다양한 타입을 비교할 수 있지만,
		메소드 내에서 타입 호환성을 주의해야 합니다.
		
		제네릭 메소드와 클래스 타입 파라미터의 독립성:
		제네릭 메소드의 타입 파라미터 (<U>)는 클래스의 타입 파라미터 (<T>)와 독립적입니다.
		같은 이름을 사용하면 혼동을 일으킬 수 있으므로, 가능하면 다른 이름을 사용하는 것이 좋습니다.
		
		제네릭 메소드의 타입 파라미터의 범위:
		제네릭 메소드의 타입 파라미터는 메소드 내에서만 유효하며, 메소드 외부에는 영향을 주지 않습니다.
		이는 메소드의 유연성을 높여줍니다.
		
		제네릭 클래스에서 static 필드 사용 제한:
		제네릭 클래스에서는 타입 파라미터를 사용하여 static 필드를 선언할 수 없습니다.
		static 필드는 모든 인스턴스에 의해 공유되므로, 인스턴스별 타입 파라미터 T를 사용할 수 없습니다.
		그러나 정수와 같은 고정된 타입의 static 필드는 가능합니다.
		이런 요약을 통해 우리가 논의한 주제들에 대한 이해를 도울 수 있기를 바랍니다.
		
	 */
}
