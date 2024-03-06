package ch09.Local_Nested_Class;

public class Aexample {
	
	

	public static void main(String[] args) {
		
		
		/*
		 * B클래스는 useB()메소드의 로컬 내부 클래스이기 때문에 외부에서는 접근할수 없고 
		 * A 클래스 내부에서도 useB메소드 영역에서 벗어날수 없다
		 * 그리고 로컬 클래스는 접근 제한자도 사용할수 없다. 왜냐면 애초에 메소드 사용중에만 생성되서
		 * 외부에서는 접근 할수가 없다.
		 */
		
	
		
		//A객체 생성
		A a = new A();

		//a메소드 실행
		a.useB();
		

	}

}
