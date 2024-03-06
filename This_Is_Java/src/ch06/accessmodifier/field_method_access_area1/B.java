package ch06.accessmodifier.field_method_access_area1;

public class B {

	public void method() {
		A a = new A();
		
		a.field1 = 0;
		a.field2 = 0;
		//a.field3 = 0;  private라서 사용 불가능
		
		a.method1();
		a.method2();
		//a.method3();   private라서 사용 불가능
		
	}
	
}
