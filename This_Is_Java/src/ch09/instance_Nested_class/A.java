package ch09.instance_Nested_class;

public class A {
	/*
	 * 중첩 클래스의 장점은 A클래스가 B클래스와 밀접한 경우 B클래스가 A클래스에서만 쓰일 경우에는
	 * B클래스를 A클래스 내부에 넣어주면 다른 클래스에서 B 클래스를 단독으로 접근할수가 없다(A객체를
	 * 생성한 다음 B객체 생성가능)
	 * 
	 * 그리고 유효 범위상 B클래스는 A클래스의 멤버와 같기 때문에 A클래스의 내부에 쉽게 접근할수 있다.
	 * 쉽게 말하면 B클래스 내부에서 A객체의 멤버를 호출할때 A객체 생성 없이 그냥 호출할수 있다.
	 * 하지만 반대로 유효범위상 B클래스를 A클래스에서 사용하려면 B객체를 생성해 줘야 한다.
	 * 
	 */

	String out_Class_member = "A의 필드";
	static String static_out_Class_member ="A의 정적필드";
	B b = new B();//B 참조변수 타입의 필드생성
	
	
	public A() {
		B b = new B();//객체생성 해야함
		b.method1();//b객체로 B클래스가 가지고 있는 메소드 사용
		System.out.println(B.fieled2);//B클래스가 가지고있는 정적 필드 사용
	}
	
	void methodA() {
		B b = new B();
		b.method1();
		B.method2();
		System.out.println(B.fieled2);
	}
	
	static void test() {
		A a = new A();
		a.b = a.new B();//정적 메소드에서 내부 클래스인 B객체를 사용하려면 A객체가 필요하다
	}
	
	
	public class B{// 내부 클래스는 접근제한자로 public 과 default , private 접근제한자를 붙일수 있다
				   //그리고 내부 클래스는 예외적으로 static도 붙일수 있다.
	
				//인스턴스 필드
				int fieled1 = 1;
				
				//정적필드 (Java 17부터 허용)
				static int fieled2 = 2;// 17미만 버전은 내부클래스가 정적 클래스여야 정적 멤버를 가질수 있다.
				
				
				//생성자
				B(){
					System.out.println("B-생성자 실행");
					System.out.println(out_Class_member);// 외부 클래스 멤버 객체 생성없이 접근 가능
					System.out.println(static_out_Class_member);
				}
				
				//인스턴스 메소드
				void method1() {
					
					System.out.println("B-메소드1 실행");
						
				}
				
				//정적 메소드(java17 이상만 가능)
				static void method2() {
					System.out.println("B-메소드2 실행 ");
				}	
	}
	
	
/*
 * 인스턴스 내부 클래스 (Non-static or Member Inner Class):

외부 클래스의 인스턴스에 종속:
인스턴스 내부 클래스는 외부 클래스의 인스턴스에 종속되어 생성됩니다.
 즉, 외부 클래스의 인스턴스가 없으면 인스턴스 내부 클래스를 생성할 수 없습니다.

외부 클래스의 모든 멤버에 접근 가능:
인스턴스 내부 클래스는 외부 클래스의 모든 멤버에 접근할 수 있습니다.
이는 외부 클래스의 "private 멤버에도 접근 가능함을 의미합니다."

외부 클래스의 인스턴스 생성 필요:
인스턴스 내부 클래스를 생성하려면 외부 클래스의 인스턴스를 먼저 생성해야 합니다
*/
	
/*
 * 1.B 내부 클래스 안에서는 A 외부 클래스를 바로 사용할수 있다.
 * 2.A 외부 클래스에서 B의 내부 클래스를 사용하고 싶으면 B객체를 생성해서 사용해야한다.
 * 3.외부에서 접근할때는 A객체를 선언하고 B객체를 만들어야한다. B객체는 A의 멤버와 같기때문에 A객체가 있어야 한다. 
 * 4.B내부 객체를 필드로 선언할때 static으로 선언할수 없다.
 * 5.B내부 클래스의 정적 멤버는 A객체를 선언하지 않고도 A.B로 바로 접근할 수 있다.
 * 
 */
	
	
}