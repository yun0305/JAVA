package ch09.static_Nested_class;

public class A {

	
	// static 내부 클래스
	 static class B{// 정적 키워드가 붙으면 외부에서 A객체 없이도 A.B로 접근 가능
		 
		 //하지만 정적 클래스가 가지고 있더라도 멤버가 인스턴스면 B객체를 생성해주고 접근해줘야 한다
		 //A.B b = new A.B();
		 //b.method1B(); 이런식으로..
		 
		 void method1B() {
			 //a = 10; 내부가 정적이라 외부의 인스턴스에는 직접 접근할수 없다
			 // 접근하려면 객체가 필요함
			 //그말은 즉 내부 클래스가 정적이면 외부클래스의 인스턴스 멤버는에는 접근할수 없다(객체 없이는)
			 A test = new A();
			 test.a = 10;
			 
			 b = 29;//하지만 외부 클래스 필드의 소속이 정적이면 바로 접근 가능
			 System.out.println("B메소드 실행");
			
		 }
		 
		 static void method2B() {
			 System.out.println("정적 B메소드 실행");
		 }
	 }
//////////////////////////////////////////////////////////////////////여기까지 B내부 클래스
	 
	 int a = 0;
	 static int b = 0;
	 
	 //field
	B field1 = new B();
	static B field2 = new B();// field2는 B내부클래스가 static이라서 B타입 정적필드를 만들수 있다.
	//(B내부 클래스가 정적이 아니면 만들수 없다.)
	
	/*
	 * 보통의 클래스는 클래스 타입의 필드를 만들면서 정적을 붙여도 에러가 나지 않지만
	 * 내부 클래스는 다르다 내부 클래스가 외부 클래스의 멤버이면 클래스 타입의 필드를 정적으로 할수가 없다
	 * 왜냐면 만약 내부 클래스가 외부의 인스턴스 소속의 클래스 인데 정적 타입의 클래스 필드를 만들어 줄려고 하면
	 * 모순이 생긴다 인스턴스 내부 클래스는 외부 클래스가 있어야 사용할수 있는데 정적 키워드를 붙이게 되면
	 * 외부 클래스 없이도 사용하겠다는 뜻이 되어버려서 말이 안된다.
	 */

	//생성자
	A(){ 
		B b = new B();
	}
	
	//인스턴스 메소드
	void method1() {
		B b = new B();
	}
	
	//정적 메소드
	/*
	 * 정적 메소드에서 인스턴스 내부클래스를 사용하기 위해서는 외부 클래스의 객체를 만들어 줘야 하지만
	 * (왜냐면 클래스 소속 메소드에서는 인스턴스 멤버를 사용하려면 객체가 필요함 )
	 * 내부 클래스가 정적일 경우에는 외부 클래스 없이도 사용할수 있기 떄문에 B객체만 단독으로 선언할 수 있다.
	 */
	static void method2() {
		B b = new B();
	}
	/*
	 * 1.내부 클래스가 정적이면 내부 클래스에서 외부 클래스의 인스턴스 멤버를 사용할수 없다.
	 * 2.정적 메소드에서 내부 클래스의 객체를 생성할때 사용할때 A객체를 필요로하지 않는다.
	 * 3.내부 클래스 타입의 필드를 생성할때 인스턴스 멤버이면 정적 타입을 붙일수 없지만
	 *   내부 클래스가 정적이면 정적 타입을 붙일수 있다.
	 * 4.정적 내부 클래스 에서는 외부의 정적 타입 멤버에만 접근할수 있다. 
	 */
	
}
