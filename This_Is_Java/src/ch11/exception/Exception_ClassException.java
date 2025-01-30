package ch11.exception;

public class Exception_ClassException {

	/*
	 * 컴퓨터 하드웨어의 고장으로 인해 응용프로그램 실행 오류가 발생하는 것을 자바에서는 에러라고 한다.
	 * 프로그램을 아무리 견고하게 만들어도 개발자는 이런 에러에 대처할 방법이 전혀 없다.
	 * (불가항력적으로 컴퓨터가 꺼진다면 에러가 발생)
	 * 
	 * 자바에서는 에러 이외에 예외(exception)라고 부르는 오류가 있다. 예외란 잘못된 사용 또는 코딩으로 인한
	 * 오류를 말한다 예외가 발생되면 프로그램은 곧바로 종료된다는 점에서는 에러와 동일하지만,
	 * 예외 처리를 통해 계속 실행 상태를 유지할 수 있다. 예외에는 다음 두가지가 있다.
	 * (코드가 잘못되면 예외발생, 예측이 가능하다.)
	 * 
	 * 일반 예외(Exception)
	 * 컴파일러가 예외 처리 코드 여부를 검사하는 예외를 말한다.
	 * (컴파일러가 코드를 체크해서 프로그램 실행전에 예외를 알려준다. 육안을 보인다.)
	 * 
	 * 실행 예외(Runtime Exception)
	 * 컴파일러가 예외 처리 코드 여부를 검사하지 않는 예외를 말한다.
	 * (컴파일러가 예외를 체크하지 않는다 그래서 프로그램 실행중에 예외가 발생하고 실행전까지는 알수없다.)
	 * 
	 * 자바는 예외가 발생하면 예외클래스로부터 객체를 생성한다, 이 객체는 예외 처리 시 사용된다.
	 * 자바의 모든에러와 예외 클래스는 Throwable을 상속받아 만들어지고, 추가적으로 예외 클래스는 java.lang.Exception
	 * 클래스를 상속 받는다.
	 * 
	 * 
	 * 		    ㅡ<- Exception <-(일반 예외)(ClassCantFoundException, InterrupTedException....)
	 * 		   ㅣ
	 *		   ▽ 		 
	 * Throwable 
	 * 		   △
	 *		   ㅣ
	 *			ㅡ<- Exception <-(실행 예외)RuntimeException<-(NullPointerException,
	 *													 ArrayIndexOutOfBoundsException, NumberFormatException)
	 *
	 *
	 *
	 *try-catch는 런타임 예외만 처리가능 try-catch눈 실행 중 방생하는 예외만 잡는다
	 *하지만 컴파일 오류는 예외처리가 안됨
	 *
	 *
	 *
	 */
	
}
