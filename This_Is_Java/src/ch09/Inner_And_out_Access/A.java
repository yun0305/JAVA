package ch09.Inner_And_out_Access;

public class A {

	/*
	 * 외부 클래스의 객체 접근
	 * 내부 클래스 내부에서 this는 해당 내부 클래스의 객체를 말한다.
	 * 만약 내부 클래스 내부에서 외부 클래스의 객체를 얻으려면 외부 클래스 이름에 this를 붙여주면 된다.
	 * 
	 * 외부클래스.this.불러올 필드명 => 외부객체
	 * 
	 * 다음 예제는 내부 클래스와 외부 클래스가 동일한 이름의 인스턴스 필드와 메소드를 가지고 있을 경우,
	 * 외부 객체 소속의 필드와 메소드를 사용하는 방법을 보여준다.
	 */
	
	//A 인스턴스 필드
	String field = "A-field";
	
	//A 인스턴스 메소드
	void method() {
		System.out.println("A-method");
	}
	
	//인스턴스 멤버 내부클래스
	class B{
		
		//B 인스턴스 필드
		String field = "inner-B-field";
		
		//B 인스턴스 메소드
		void method() {
			System.out.println("inner-B-method");
		}
		
		//B인스턴스 메소드
		void print() {
			System.out.println(this.field);
			this.method();
		
			//외부 객체의 필드와 메소드 사용
			System.out.println(A.this.field);
			A.this.method();
			
		}
	}
	
	
	void useB() {
		
		B b = new B();
		b.print();
		
	}
	
}
