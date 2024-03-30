package ch11.exception.exception_code.runtime_exception;

public class Exception_Handling_Example {

	
	public static void printLength(String data) {
	
	//실행예외
	try {
		int length = data.length();	
		System.out.println("문자의 수 = " + length);
	}catch(NullPointerException e) {//자바는 예외가 발생하면 해당 예외클래스를 가지고 객체를 만든다.
		//NullPointerException e 발생된 예외의 위치정보를 e 변수에다 넣는다.
		
		System.out.println(e.getMessage());//예외객체 e로 가서 예외객체가 가지고 있는 getMessage()메소드를 호출하면 왜 에러가 뜨는지 내용을 얻을수 있다.
		System.out.println(e.toString());// toString();(예외의 종류와 사유도 리턴해줌)
		e.printStackTrace();//e 객체를 통해 printStackTrace()호출해서 예외가 어디서 발생했는지 추적한다.
		
		/*여기까지는 예외처리 코드라기 보단 예외가 왜 발생했는지 출력해주고 프로그램이 예외를 만나도 다음 코드를 실행 하게 해주는
		코드이다. 일반예외는 컴파일러가 어떤 코드가 예외 처리가 필요한지 알려준다.
		*/
		
	}finally {//예외가 발생을 헀던 안했던 실행된다.
		System.out.println("마무리 실행");
	}
	
	}
	
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("코드 실행");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
	
}
