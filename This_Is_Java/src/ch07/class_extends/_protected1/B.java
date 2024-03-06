package ch07.class_extends._protected1;

public class B {
	
	//같은 패키지 안에서 사용 import할 필요도 없이 사용 가능
	//protected는 같은패키지 안에서는 default와 같은 기능을 한다
	public void method() {
		
	A a = new A();//사용가능
	a.fild = " ";//사용가능
	a.method();//사용가능
	
	}
	
	
}
