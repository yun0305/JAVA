package ch06.accessmodifier.constructor_access_area1;

public class A {
	//필드선언
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	public A(boolean A) {
		
	}
	
	 A(int A) {
		
	}
	 
	private A(String A) {
		
	}
	
}
