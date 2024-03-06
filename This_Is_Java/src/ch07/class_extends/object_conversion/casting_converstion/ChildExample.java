package ch07.class_extends.object_conversion.casting_converstion;

public class ChildExample {

	public static void main(String[] args) {
		
/*
 * 강제 타입 변환은 부모 타입을 자식 타입으로 변환하는 것을 말한다. 그렇다고해서 모든 부모 타입을
 * 자식타입으로 강제변환할수 있는것은 아니다
 * 자식 타입이 부모 타입으로 자동 변환한 후, 다시 자식 타입으로 변환할 때 강제 타입 변환을 사용할수 있다.
 * 불가능 예시)
 * Parent pt = new Parent();
		
	Child ch = (Child)pt;
		
	ch.field2 = "";
	ch.method3();
			
			
	업 캐스팅 (Upcasting):
	업 캐스팅은 하위 클래스의 객체를 상위 클래스의 타입으로 변환하는 것을 의미합니다. 이때 주의해야 할 조건은 다음과 같습니다.

	상속 관계: 업 캐스팅은 상속 관계가 있는 클래스 간에만 가능합니다. 즉, 상위 클래스가 하위 클래스를 확장하거나 구현한 경우에만 업 캐스팅이 가능합니다.
			
	다운 캐스팅 (Downcasting):
	다운 캐스팅은 상위 클래스로 업 캐스팅된 객체를 다시 원래의 하위 클래스 타입으로 변환하는 것을 의미합니다. 다운 캐스팅을 할 때에는 몇 가지 주의할 점이 있습니다.
			
	업 캐스팅된 객체: 다운 캐스팅을 하려면 먼저 업 캐스팅된 객체여야 합니다. 업 캐스팅되지 않은 객체를 다운 캐스팅하려고 하면 컴파일은 되겠지만 실행 시에 ClassCastException이 발생할 수 있습니다.
 * 
 * 	자식 타입이 부모타입으로 자동 변환되면 부모타입의 필드와 메소드만 사용할수 있다는 제약사항을 따른다(하지만 자식객체에서 오버라이딩 된 메소드는 부모 메소드가 아닌 자식 메소드를 사용한다)
 *	만약 자식 타입에 선언된 필드나 메소드를 사용하고 싶다면 강제 타입 변환을 사용해서 자식 타입으로 바꿔준 다음 사용하면 된다
 */
		
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		//parent.method3(); 사용불가능
		
		Child child = (Child)parent;
		
		child.field1 = "yyy";
		child.field2 = "ddd";
		
		child.method1();
		child.method2();
		child.method3();
	}

}

