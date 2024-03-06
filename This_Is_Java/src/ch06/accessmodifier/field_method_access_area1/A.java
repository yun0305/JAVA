package ch06.accessmodifier.field_method_access_area1;

public class A {
	//필드 선언
	public int field1;
	int field2;
	private int field3;
	
	//메소드 선언
	public void method1() {
		
	}
	void method2() {
		
	}
	
	private void method3() {
		
	}
	
	public A() {
		
		//전부 사용가능
		
		field1 = 0;
		field2 = 0;
		field3 = 0;
		
		method1();
		method2();
		method3();
	}
}
