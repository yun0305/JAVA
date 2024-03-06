package ch09.Local_Nested_Class;

	/*
	 * 로컬 클래스 B 내부에는 일반 클래스와 같이 필드, 생성자, 메소드 선언이 올수 있다. 정적 필드와 정적 메소드는 JAVA
	 * 17부터 선언이 가능하다
	 */

public class A {
	
	//메소드 선언
	void useB() {
		
		//로컬 내부 클래스 선언
		class B{
				//정적 필드(java17부터 사용가능)
			static int field = 2;
			
			//생성자
			B(){
				System.out.println("B-생성자 실행");
			}
			
			//인스턴스 메소드
			void method1() {
				System.out.println("B-인스턴스 메소드 실행");
			}
			
			//정적 메소드(java 17부터 사용가능)
			static void method2() {
				System.out.println("B- 정적 메소드 실행");
			}	
		}
		
		//로컬 객체 생성
		B b = new B();
		
		//로컬 객체의 인스턴스 필드와 메소드 사용
		b.method1();
		//로컬 정적 메소드와 필드 사용
		System.out.println(B.field);
		B.method2();
	}
}
