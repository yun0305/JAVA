package ch11.exception.User_Exception;

public class InsufficienException extends Exception {
	
	/*
	 * <사용자 정의 예외>
	 * 은행의 뱅킹 프로그램에서 잔고보다 더 많은 출금 요청이 들어온 경우에는 잔고 부족 예외를 발생시킬 필요가 있다.
	 * 그러나 잔고 부족 예외는 표준 라이브러리에 존재하지 않기 때문에 직접 예외 클래스를 정의해서 사용해야 한다.
	 * 이것을 사용자 정의 예외라고 한다.
	 * 
	 * 사용자 정의 예외는 컴파일러가 체크하는 일반예외로 선언할 수도 있고,
	 * 컴파일러가 체크하지 않는 실행예외로 선언할 수도 있다,
	 * 통상적으로 일반 예외는 Exception의 자식 클래스로 선언하고,
	 * 실행 예외는 RunTimeException의 자식 클래스로 선언한다.
	 * 
	 *  Exception: 복구 가능한 예외를 명시적으로 처리하도록 강제하고 싶을 때 사용.
	 *  
	 *	RuntimeException: 프로그래머 실수나 로직 문제를 표현하고, 
	 * 	호출자가 예외 처리를 선택적으로 할 수 있게 하고 싶을 때 사용.
	 * 
	 *  예)
	 *  public class XXXException extends Exception | RunTimeException {
	 *  
	 *  	public XXXException(){ // 기본 생성자
	 *  	
	 *  
	 *  	}
	 *  
	 *  	public XXXException(String massage){ // 예외 메세지를 입력받는 생성자
	 *  	super(massage);	
	 *  
	 *  	}
	 *   }
	 *   
	 *   사용자 정의 예외 클래스에는 기본 생성자와 예외 메세지를 입력받는 생성자를 선언해준다. 예외 메시지는 부모 생성자
	 *   매개값으로 넘겨주는데, 그 이유는 예외 객체의 공통 메소드인 
	 *   
	 *   getMessange() 메소드의 리턴값으로 사용하기 위해서이다.
	 *   
	 *   다음은 잔고 부족 예외를 사용자 정의 예외 클래스로 선언한 것이다.
	 *  
	 *  
	 */
	
	public InsufficienException() {
		
	}
	
	public InsufficienException(String massage) {
		super(massage);
	}
	
	
	/*
	 * <예외 발생 시키기>
	 * 자바에서 제공하는 표준 예외뿐만 아니라 사용자 정의 예외를 직접 코드에 발생시키려면 throw 키워드와 함께
	 * 예외 객체를 제공하면 된다, 예외의 원인에 해당하는 메세지를 제공하고 싶다면 생성자 매개값으로 전달한다.
	 * 
	 * <예외 발생시는 법> 
	 * throw new XXXException(); 
	 * throw new XXXException("예외 메세지");
	 * 
	 * throw 된 예외는 직접 try-catch 블록으로 예외를 처리할 수도 있지만, 대부분 메소드를 호출하는 곳에서 예외를 처리하도록
	 * throws 키워드로 예외를 호출한 곳으로 던져준다.
	 */
}
