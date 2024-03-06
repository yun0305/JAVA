package ch07.class_extends.object_conversion;

public class Child extends Parent {

	@Override
	public void method2() {
		System.out.println("child-method2");
	}
	
	public void method3() {
		System.out.println("child(고유 메소드)-method3");
	}
	
}
