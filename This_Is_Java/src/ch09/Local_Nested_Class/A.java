package ch09.Local_Nested_Class;

	/*
	 * 
	 * 로컬 클래스 B 내부에는 일반 클래스와 같이 필드, 생성자, 메소드 선언이 올수 있다.
	 * 정적 필드와 정적 메소드는 JAVA
	 * 17부터 선언이 가능하다
	 * 
	 * 로컬클래스는 메소드 실행 시 동적으로 생성되고 실행이 끝나면 클래스 정보가 사라짐
	 * 객체는 힙에 저장되며 참조변수는 스택에 저장됨
	 * 클래스 정보 자체는 메소드 영역에 따로 저장되지 않음
	 * 따라서 로컬 중첩 클래스는 일반적인 클래스와 달리 메소드가 실행될 때만 사용 가능한 일회성 클래스이다
	 * 즉 로컬 중첩 클래스는 메소드 실행 중에만 존재하는 클래스 이며 실행이 끝나면 더 이상 접근할
	 * 수 없도록 메모리에서 사라진다.
	 * 
	 */

public class A {
	
	int test = 0;
	//메소드 선언
	static void useB() {
		
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
