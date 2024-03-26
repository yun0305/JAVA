package ch13.Generic.Generic_Method;

/*
 * 다음 GenericExample 클래스는 제네릭 메소드인 boxing을 선언하고 호출하는 방법을
 * 보여준다.
 * 
 */

public class GenericExample {

	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	
	public static void main(String[] args) {
		
	Box<Integer> box1 = boxing(100);	
	int inValue = box1.get();
	System.out.println(inValue);
	
	
	Box<String> box2 = boxing("안녕하세요");
	String strValue = box2.get();
	System.out.println(strValue);
	}

}
