package ch11.exception.Throws;

public class Throws_Example {

	/*
	 * 	메소드 내부에서 예외가 발생할 때 try-catch 블록으로 예외를 처리하는 것이 기본이지만,
	 *  메소드를 호출한 곳으로 예외를 떠넘길 수도 있다. 이때 사용하는 키워드가 throws다 throws는
	 *  메소드 선언부 끝에 작성하는데
	 *  떠넘길 예외 클래스를 쉼표로 구분해서 나열해주면 된다.
	 *  
	 *  리턴타입 메소드명(매개변수,...) throws 예외클래스1, 예외클래스2,...{
	 *  
	 *  }
	 *  
	 *  throws 키워드가 붙어 있는 메소드에서 해당 예외를 처리하지 않고 떠넘겼기 때문에 이 메소드를 호출하는 곳에서
	 *  예외를 받아 처리해야 한다. 예를 들어 다음 코드는 ClassNotFoundException을 throws하는 method2()의
	 *  예외를 method1()에서 호출할때 처리하고 있다.
	 *  
	 *  나열해야 할 예외 클래스가 많을 경우에는 throws Exception 또는 throws Throwable 만으로 모든 예외를 간단히
	 *   떠넘길 수도 있다.
	 *   
	 *   리턴타입 메소드명(매개변수,...) throws Exception{
	 *  
	 *  }
	 *  
	 *  main() 메소드에서도 throws 키워드를 사용해서 예외를 떠넘길 수 있는데, 결국 JVM이 최종적으로 예외 처리를 하게된다.
	 *  JVM은 예외의 내용을 콘솔에 출력하는 것으로 예외를 처리한다.
	 *  
	 *  public static void main(String[] args) throws ClassNotFoundException  {
	
		method2();		
		System.out.println("프로그램 종료");
		
	}
	좋은 방법은 아니다..
	 *  
	 */
	
	public static void main(String[] args)  {
	
		
		try {
			method2();		
		}catch(ClassNotFoundException e) {
			System.out.println("예외처리 : "+e.toString());	
		}
		System.out.println("프로그램 종료");
		
		
		
	}

	public static void method2() throws ClassNotFoundException {
		
		Class.forName("java.lang.String2");//일반 예외가 발생한다
		/*
		 * 그래서 throws로 예외를 던져주던가 메소드 안에서 예외를 처리해줘야 한다.
		 *  
		 */
	}
	
}
