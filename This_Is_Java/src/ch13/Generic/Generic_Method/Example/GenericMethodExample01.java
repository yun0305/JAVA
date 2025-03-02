package ch13.Generic.Generic_Method.Example;

public class GenericMethodExample01 {
		//제네릭 메소드 : 입력값을 그대로 반환하는 메소드
	public  <T> T identity(T value) {
		return value;
	}
	
	public static void main(String[] args) {
		
		GenericMethodExample01 GME = new GenericMethodExample01();
		String result = GME.<String>identity("100");//멤버가 인스턴스의 경우 명시방법
		//GenericMethodExample01.<Integer>identity(100);//명시
		//String result = identity("hello");//타입 추론
		
	}
}
