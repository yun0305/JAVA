package ch05.string;

public class sec09{

	public static void main(String[] args) {

		//문자열 대체 replace
		
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 Stirng입니다.";
		String newStr = oldStr.replace("문자열","String");//replace() 자바의 문자열을 수정할수 있다.수정 해서 나온 문자열 객체는 새로운 객체이다
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
	
	}
	

}
