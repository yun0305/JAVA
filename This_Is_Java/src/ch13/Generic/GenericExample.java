package ch13.Generic;

public class GenericExample {

	public static void main(String[] args) {
		
		Box<String> box1 = new Box<String>();
		box1.content = "안녕하세요";
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);
		
		/*
		 * 만약 Box box = new box();
		 * 라고 제네릭의 타입을 면시안해줘도 오류는 나지 않는다
		 * 명시를 하지 않으면 <T>가 Object로 기본 설정된다.
		 * 
		 */
		
	}
}
