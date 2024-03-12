package ch09.static_Nested_class;

public class A_Example {

	public static void main(String[] args) {
		
		//static Nested클래스를 외부에서 선언할때는 상위 클래스를 선언하지 않고도 바로 선언할수 있다.
		//A a = new A(); <-필요없음
		//A.B b = new A.B();	
		
		/*
		 * 중첩 클래스는 내부 클래스가 외부 클래스와 너무 관계가 밀접해서 관리하기 편하도록 만든거다
		 * 그래서 내부 클래스 단독으로는 사용할 수 없다.
		 * 내부 클래스가 외부클래스의 객체와 관련이 있다면 static을 붙이면 안된다.
		 * 
		 */
		A.B b = new A.B();// static 객체 선언 방법
		b.method1B();//B클래스가 가지고 있는 인스턴스 메소드
		
		A.B.method2B();//B클래스가 가지고 있는 정적 메소드
		
	}

}
