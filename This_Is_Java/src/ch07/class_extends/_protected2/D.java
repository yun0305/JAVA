package ch07.class_extends._protected2;

import ch07.class_extends._protected1.A;

public class D extends A {
	
	//다른 패키지에서 상속 받을때
	/*
	 * protedted는 다른 패키지에서 상속 시킬수 있다 자식 클래스를 한에서 사용할수 있다
	 * 단 객체를 생성해서는 사용할수 없다 왜냐면 자식 클래스 한에서 라는 말은 상속 관련이 된다는 뜻인데
	 * 객체를 생성하는건 상속과는 다른 이야기다
	 */
	
	
	public D() {
		super();
	}
	
	public void method2() {
		fild = " ";
		method();
	}
	
	public void method1() {
		//A a = new A();// 객체를 생성해서는 사용 불가능
		//a.fild = " ";// 객체를 생성해서는 사용 불가능
		//a.method();// 객체를 생성해서는 사용 불가능
		}
	
}
