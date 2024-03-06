package ch07.class_extends._protected2;

public class C {

	//다른 패키지에서 사용할 경우
	/*
	 * 다른 패키지에서는 사용할수 없다 public은 다른 패키지에서 import를 시킨다면 사용할수 있지만
	 * protected는 default와 같이 다른 패키지에서는 import를 해도 사용할수 없다
	 */
	
	public void method() {
		//A a = new A();//사용 불가능
		//a.fild = " ";//사용 불가능
		//a.method();//사용 불가능
		}
}
