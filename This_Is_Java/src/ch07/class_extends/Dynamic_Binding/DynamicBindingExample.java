package ch07.class_extends.Dynamic_Binding;

public class DynamicBindingExample {

	
	public static void main(String[] args) {
		
		Child ch = new Child();//실행을 자식의 객체 
		
		Parent par = new Parent();
		
		ch.testName();
		
		
		/*
		 * 왜 자식 메서드가 호출되나요?
			객체의 실제 타입 기준:
			
			동적 바인딩은 참조 변수의 타입이 아니라, 객체의 실제 타입에 따라 호출할 메서드를 결정합니다.
			여기서 new Child()로 객체를 생성했으므로, 객체의 실제 타입은 Child입니다.
			따라서 부모 클래스의 생성자 안에서 호출된 this.name()은 자식 클래스에서 오버라이딩된 name() 메서드를 호출합니다.
			오버라이딩된 메서드:
			
			자식 클래스에서 부모의 name() 메서드를 오버라이딩했기 때문에, 동적 바인딩의 대상이 됩니다.
			부모 생성자에서 this.name()을 호출하면, 실제 객체 타입이 자식 클래스이므로 자식의 name() 메서드가 실행됩니다.
			JVM의 역할:
			
			JVM은 실행 시간에 객체의 실제 타입을 확인하고, 해당 타입의 메서드를 호출합니다. 이는 **다형성(Polymorphism)**을 구현하는 핵심적인 메커니즘입니다.
		 */
		
	//<실행결과>
//		Parent-constructor//부모 생성자 실행
//		Child mathod//자식 메소드(제정의된 메소드) 실행
//		child-constructor//자식메소드 실행
//		Child mathod//자식 메소드(제정의된 메소드) 실행
//		Parent-constructor//부모 생성자 실행
//		Parent-mathod//객체의 실제 타입이 부모이기 떄문에 부모 메소드 실행
		
	}
	
}
