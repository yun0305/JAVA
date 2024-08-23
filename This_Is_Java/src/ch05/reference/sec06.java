package ch05.reference;

public class sec06 {

	public static void main(String[] args) {
		
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
