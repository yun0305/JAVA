package ch05.reference;

public class sec06 {

	public static void main(String[] args) {
		
		/*
		 * String 리터럴로 동일한 값을 선언하면 자바는, String Pool에 저장된 동일한 객체를 참조한다.
		 * 따라서 홍길동 이라는 문자열 리터럴을 여러번 선언해도 같은 객체를 공유한다.
		 * 그러나 new String(); 사용하면 Heap 메모리에 별도의 객체가 생성되어 참조가 다르다.
		 * 
		 * pool 이란 자원을 미리 생성해 두고, 필요한 시점에 재사용할 수 있도록 관리하는 기술을 의미한다.
		 */
		
		
		
		String strVal1 = "홍길동";//리터럴로 넣을경우 참조
		String strVal2 = "홍길동";
		
		
		if(strVal1 == strVal2){
			System.out.println("strVal1과 strVal2는 참조가 같음");
		}
		else {
			System.out.println("strVal1과 strVal2는 참조가 다름");
		}
		if(strVal1.equals(strVal2)){
			System.out.println("strVal1과 strVal2는 문자열이 같음");
		}
		
		String strVal3 = new String("홍길동");
		String strVal4 = new String("홍길동");

		if(strVal3 == strVal4){
			System.out.println("strVal3과 strVal4는 참조가 같음");
		}
		else {
			System.out.println("strVal3과 strVal4는 참조가 다름");
		}
		if(strVal3.equals(strVal4)){
			System.out.println("strVal3과 strVal4는 문자열이 같음");
		}
	}


}
