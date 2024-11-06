package ch13.Generic;

public class GenericExample {

	public static void main(String[] args) {
		
		Box<String> box1 = new Box<String>();
		box1.content = "100";
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);
		
		/*
		 * 만약 Box box = new box();
		 * 라고 제네릭의 타입을 명시안해줘도 오류는 나지 않는다
		 * 명시를 하지 않으면 <T>가 Object로 기본 설정된다.
		 * 
		 */
		
		Box box3 = new Box();
		box3.content = "100";
		
		
		Box box4 = new Box();
		box4.content = 100;
		
		Box box5 = new Box();
		box5.content = 100;
		
		boolean result = box3.compare(box1); 
		/*
		 * box3 부터 5는 기본이 오브젝트 타입이다 거기에 문자열 100을 넣어줬고 그럼 오브젝트 부모에 String 자식이 들어간거다.
		 * 그럼 String이 사용할수 있는건 부모타입인 오브젝트의 필드와 메소드 그리고 자식인 String의 재정의 메소드 뿐이다, 
		 * 그렇기 때문에 equals는 String이 재정의 하고 있으므로 재정의한 String의 equals 메소드를 호출하는것이다.
		 * 
		 * 그러니까 box는 오브젝트지만 대입된 값이 String 객체이기 때문에 equals로 비교하면 String에 equals 재정의 되어있는
		 * equals가 동작해서 true가 나온다,
		 * 
		 */
		System.out.println(result);
		
		result = box3.compare(box5);
		System.out.println(result);
		
	}
}
