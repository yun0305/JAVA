package ch09.instance_Nested_class;

public class AExample {
		
	
	public static void main(String[] args) {
	
		
		
		
		A a = new A();// 먼저 객체 생성
		
		A.B b = a.new B();//Nested 클래스를 선언할때는 A로 접근해야 한다. 그리고 B클래스는 A 클래스의 멤버이기 때문에 
		//먼저 A객체를 생성해야 B객체를 생성할수 있다

		System.out.println(b.fieled1);//B객체의 필드
		System.out.println(A.B.fieled2);//B클래스의 정적 필드
		
		b.method1();//B객체의 메소드
		A.B.method2();//B클래스의 정적메소드
		
		
	}
}
