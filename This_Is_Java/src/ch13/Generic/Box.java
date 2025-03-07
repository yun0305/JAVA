package ch13.Generic;

/*
 * <제네릭>
 * 다음과 같이 Box 클래스를 선언하려고 한다. Box에 넣을 내용물로 content 필드를 선언하려고 할 때,
 * 타입을 무엇으로 해야할까?
 * 
 * ex)
 * public class Box{
 * 	
 * 	public ? content;
 * 	
 * }
 * Box는 다양한 내용물을 지정해야 하므로 특정 클래스 타입으로 선언할 수 없다.
 * 그래서 다음과 같이 Object 타입으로 선언한다.
 * 
 * ex)
 * public class Box{
 * 	
 * 	public Object content;
 * 	
 * }
 * 
 * Object 타입은 모든 클래스의 최상위 부모 클래스이다. 그렇기 때문에 모든 객체는 부모 타입인
 * Object로 자동 타입 변환이 되므로 content 필드에는 어떤 객체든 대입이 가능하다.
 * 
 * ex)
 * Box box = new Box();
 * box.content = 모든 객체;
 * 
 * 문제는 Box 안의 내용물을 얻을 때이다. content는 Object 타입이므로 어떤 객체가 대입되어 있는지
 * 확실하지 않다. 이때 대입된 내용물의 타입을 안다면 강제 타입 변환을 거쳐 얻을 수 있다. 예를 들어 내용물이
 * String 타입이라면 (String)으로 강제 타입 변환해서 내용물을 얻는 식이다.
 * 
 * ex)
 * String content = (String)box.content;
 * 
 * 그러나 어떤 내용물이 저장되어 있는지 모른다면 instanceof 연산자로 타입을 조사할 수는 있지만 모든 종류의 클래스를 대상으로
 * 조사할 수는 없다. 따라서 Object타입으로 content 필드를 선언하는 것은 좋은 방법이 아니다.
 * Box를 생성하기 전에 우리는 어떤 내용물을 넣을지 이미 알고 있다. 따라서 Box를 생성할 때 저장
 * 할 내용물의 타입을 미리 알려주면 Box는 content에 무엇이 대입되는지, 읽을 때 어떤 타입으로 제공할지를 알게된다.
 * 이것이 제네릭이다.
 *
 * 제네릭이란 결정되지 않은 타입을 파라미터로 처리하고 실제 사용할 때 파라미터를
 * 구체적인 타입으로 대체시키는 기능
 * 
 * 다음은 Box 클래스에서 결정되지 않은 content의 타입을 T라는 타입 파라미터로 정의한 것이다.
 * public class Box<T>{ 
 * 
 * ex)
 * public T content;
 * 
 * }
 * 
 * <T>는 T가 타입 파라미터임을 뜻하는 기호로, 타입이 필요한 자리에 T를 사용할 수 있음을 알려주는 역할을 한다.
 * 여기에서 Box클래스는 T를 content 필드의 타입으로 사용하였다. 즉 Box 클래스는 T가 무엇인지 모르지만,
 * Box 객체가 생성될 시점에 다른 타입으로 대체된다는 것을 알고 있다.
 * 만약 Box의 내용물로 String을 저장하고 싶다면 다음과 같이 Box를 생성할 때 타입 파라미터 T 대신 String으로 대체하면
 * 된다.
 * 
 * ex)
 * Box<String> box = new Box<String>();
 * box.content = "안녕하세요";
 * String content = box.content; // 강제 타입 변환이 필요 없이 "안녕하세요"를 바로 얻을 수 있음
 * 
 * Box의 내용물로 100을 저장하고 싶다면 다음과 같이 Box를 생성할 때 타입 파라미터 T 대신 Integer로 대체하면 된다.
 * Integer는 정수 값을 표현하는 클래스 타입이다.
 * 
 * Box<Integer> box = new Box<Integer>();
 * 
 * box.content = 100;
 * int content = box.content// 강제 타입 변환이 필요없이 100을 바로 얻을 수 있음
 * 
 * Object를 썻을때는 content로 넘어온 값이 어떤타입인지 모른다는거다 그럼 Box클래스가 받아올때
 * 어떤 타입인지 조사해줘야 한다는 것이다.
 * 그리고 사용할떄도 다운 캐스팅을 시켜야한다.
 *
 * 하지만 제네릭은 생성자를 선언 할때 이미 정해지기 때문에 어떤 타입인지 조사할 필요도 없고 형변환도 사용할 필요가 없다.
 * 사실 <T>에서 타입 파라미터로 쓰이는 T는 단지 이름일 뿐이기 때문에 T대신 A부터 Z까지 어떤 알파벳을 사용해도 좋다. 
 * 주의할점은 타입 파라미터를 대체하는 "타입은 클래스 및 인터페이스라는" 것이다, 바로 위 코드에서 Box<int>라고 하지 않는 이유는 기본 타입은 타입 파라미터의
 * 대체 타입이 될 수 없기 때문이다.
 * 
 * 그리고 변수를 선언할 때와 동일한 타입으로 호출하고 싶다면 생성자 호출 시 생성자에는 타입을 명시하지 않고 <>만 붙일수 있다.
 * 
 * ex)
 * Box<String> box = new Box<>;
 * 
 * 실습을 통해 이해해보자. 다음과 같이 Box 클래스를 작성한다.
 * 
 * 주의{
 * 제네릭 타입이 붙은 멤버는 static 멤버 불가능
 * 제네릭이 정해지기전에 static이 먼저 메모리에 저장되기 때문에 불가능
 *
 * T는 인스턴스를 생성할 때 결정되는 타입이므로, 
 * static 필드에 사용할 수 없습니다
 * 
 * 어떤 방법으로도 제네릭 타입 클래스에서는 정적타입으로 제네릭 타입을 선언할수 없다.
 * }
 * 
 * 그래서 제네릭 메소드를 사용한다.
 * 
 */

public class Box<T> {

	public T content;// 타입 파라미터로 T사용
	public int i = 0;
	/*
	 * 타입 파라미터는 기본적으로 Object타입으로 간주되므로 Object가 가지고 있는 메소드를 호출할 수 있다.
	 * 다음 예제는Box의 내용물을 비교하기 위해 파라미터로 Object의 equals() 메소드를 호출한다.
	 */
	//Box의 내용물이 같은지 확인
	public boolean compare(Box<T> other) {
		// 매개값의 Box<T>의 T는 class에 있는 T의 타입파라미터 영향을 받는다
		// 만약 매개값의 타입파라미터가 클래스의 타입파라미터와 다르면 컴파일 오류가 뜬다.
		boolean result = content.equals(other.content);
		
		return result;
	}
}

//GenericExample 클래스를 다음과 같이 작성하고 실행해보자.
