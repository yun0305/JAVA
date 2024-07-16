package ch07.class_extends.object_conversion;

public class ChildExample {

	public static void main(String[] args) {
		
		/*
		 * 부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에 선언된 필드와 메소드만 접근이 가능하다.
		 * 비록 변수는 자식 객체를 참조하지만 변수로 접근 가능한 멤버는 부모 클래스 멤버로만 한정된다
		 * 
		 * 그러나 예외가 있다 메소드가 자식 클래스에서 오버라이딩 되었다면 자식 클래스의 메소드가 대신 호출된다.
		 * 이것은 다형성과 관련이 있기 때문에 매우 중요한 성질이다
		 * 
		 * 
		 * 1. 자동 타입변환된(업캐스팅) 객체는 부모 클래스에 선언된 필드와 메소드만 사용할수 있다
		 * 2. 예외로 오버라이딩 된 메소드는 자식 메소드를 가져온다
		 */
		
		Parent parent = new Child(); 
		parent.method1();
		parent.method2();//자식 객체에서 부모 메소드를 재정의 한 것이기 때문에 호출 가능
		//parent.method3();이건 자식 객체에서 선언된 메소드라 호출 불가능

	}

}

