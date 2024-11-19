package ch11.exception.exception_code.nomal_exception;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		try {
		Class.forName("java.lang.String");//예외가 발생하면 예외 객체가 생성된다
		System.out.println("주어진 클래스가 있습니다");
		}catch(ClassNotFoundException e) {// 여기서 e라고 하는 변수에 예외객체를 참조 시킨다. 
										  //e를 통해 예외객체의 정보를 불러온다
			System.err.println("주어진 클래스는 없습니다");
			e.printStackTrace();
		}
		
		try {
			Class.forName("java.lang.String2");//예외가 발생하면 예외 객체가 생성된다
			System.out.println("주어진 클래스가 있습니다");
			}catch(ClassNotFoundException e) {// 여기서 e라고 하는 변수에 객체를 참조 시킨다. 
											  //e를 통해 예외객체의 정보를 불러온다
				System.out.println("주어진 클래스는 없습니다");
				e.printStackTrace();
			}
		
		/*//ClassNotFoundException예외처리를 하지 않았다라는 오류가 뜬다
		 * 코드를 작성했을때 컴파일러가 예외를 처리하지 않았다는 오류를 발생시킬때가 있다.
		 * 이럴땐 이런 코드를 쓰면 오류가 발생할수 있구나 그럼 예외처리를 해야하는 구나 라고 생각하면 된다.
		 * "java.lang.String" 이 경우에는 일반예외라서 컴파일러가 체크한다.
		 * Class.forName(); 의 코드의 경우에는 Class 가 가지고 있는 forName 정적 메소드가 있는데
		 * forName이 하는 역할은 java.lang.String 으로 되어있는 클래스가 있느냐를 확인하는 메소드이다.
		 * 있다면 메모리에 로딩해라 라는 메소드다. 이코드를 사용하려면 try로 예외를 처리해줘야 한다.
		 * 
		 * 마우스 커서를 가져다 대면
		 * Unhandled exception type ClassNotFoundException 라는 예외가 발생할수 있다
		 * ClassNotFoundException라는 오류가 뜨니까 catch로 ClassNotFoundException 예외 객체를 받아오면 된다.
		 *
		 * Class.forName("java.lang.String"); 이코드는 예외 처리를 하지 않으면 작동을 하지 않는 코드이다
		 * (컴파일러가 찾아줌) 이런것을 일반예외라고 부른다.
		 *
		 */
		System.out.println("종료");
	}

}
