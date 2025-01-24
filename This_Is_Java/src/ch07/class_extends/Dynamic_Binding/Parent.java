package ch07.class_extends.Dynamic_Binding;

public class Parent {

	
	String name;
	String age;
	
	Parent(){
		System.out.println("Parent-constructor");
		this.name();
		//동적 바인딩 떄문에
		//자식 객체로 실행할 경우 클래스 참조 타입이 아닌 객체의 실제 타입을 기준으로
		//동적 바인딩 여부가 결정 자식으로 new 객체를 생성하면 아무리 부모 생성자에서
		//실행한 메소드라도 자식 의 재정의된 name 메소드가 나옴
		//자식에서 name 메소드를 재정의해서 자식클래스의 name메소드가 실행됨
		
	}
	
	public void name() {
		System.out.println("Parent-mathod");
	}
	
	public void testName() {
		name();
	}
	
	
}
