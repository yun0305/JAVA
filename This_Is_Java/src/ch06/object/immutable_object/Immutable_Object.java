package ch06.object.immutable_object;

public class Immutable_Object {
	
	/*
	 * 정의:
	 * 		객체의 상태(필드 값)가 생성된 후에는 변경 불가능한 객체이다.
	 * 
	 * 
	 * 특징:
	 * 		객체를 생성한 이후에 내부 데이터가 변하지 않는다.
	 * 
	 * 		모든 변경 작업은 새로운 객체를 반환한다.
	 * 
	 * 		스레드 안전 하다
	 * 
	 * 		자바에서 대표적인 불변객체는 String 클래스이다.		
	 * 
	 */
		
		public static void main(String[] args) {
			
			String str = "hello";
			String newStr = str.concat(" world");
			
			System.out.println(str);
			System.out.println(newStr);
			
	}
}

	/*
	 * String 클래스는 불변객체이므로, concat 메소드는 원래 문자열을 변경하지 않고 새로운 문자열 객체를 반환한다.
	 */
