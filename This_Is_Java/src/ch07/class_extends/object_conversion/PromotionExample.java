package ch07.class_extends.object_conversion;

class A {
	public A() {
		// TODO Auto-generated constructor stub
		test();
	}
	void test() {
		System.out.println("A");
	}
}
class B extends A{
	
	public B() {
		test();
	}
	@Override
	void test() {
		// TODO Auto-generated method stub
		System.out.println("B");
	}
}
class C extends A{
	
	public C() {
		test();
	}
	
	@Override
	void test() {
		// TODO Auto-generated method stub
		System.out.println("C");
	}
}
class D extends B{
	
	public D() {
		test();
	}
	
	@Override
	void test() {
		// TODO Auto-generated method stub
		System.out.println("D");
	}
}
class E extends C{
	
public E() {
	test();
}	
	
	@Override
	void test() {
		// TODO Auto-generated method stub
		System.out.println("E");
	}
}

public class PromotionExample {

	
	public static void main(String[] args) {
		
		/*  
		 *  Cat cat = new Cat();
		 *  Animal animal = cat;
		 *  위와 같이 자식 클래스 객체(Cat)를 부모 클래스 타입(Animal)으로 참조할 수 있다.
		 *  
		 *  자식 클래스인 Cat 객체를 생성하면 부모 클래스의 생성자도 호출되면서
		 *  부모 클래스의 필드와 메서드가 초기화된다. 그러나 부모 객체가 별도로 생성되는 것이 아니라, 
		 *  자식 객체(Cat) 내부에 부모 클래스(Animal)의 멤버들이 포함되어 하나의 객체로 존재하게 된다.
		 *
		 *  따라서 cat 객체는 Animal의 속성 및 메서드를 가지고 있어 Animal 타입으로의 타입 변환이 가능하며,
		 *  변환된 animal과 원래의 cat 객체는 동일한 메모리 위치를 참조하므로 참조값이 같다.
		 *  
		 *  정확히는 자식객체에 부모객체가 붙어있는게 아니라 자식 객체 내부에 부모 클래스의 필드와
		 *  메소드가 포함된 형태로 하나의 객체가 되는거다 그래서 자식타입이 부모 타입에 들어갈수 있는거다.
		 *  
		 *  자식 부모 객체 2개가 아니라 부모를 그대로 물려받은 자식 하나가 생기는 거다.
		 */

		
			
		
		//객체 자동 타입변환
		
		
		A a1 = new B();//B는 A를 상속 받았기 때문에 A로 자동타입 변환이 된다
		a1.test();
		A a2 = new C();//C도 A를 상속 받았기 때문에 A로 자동타입 변환이 된다
		a2.test();
		B a3 = new D();//D는 A를 상속받은 B를 상속 받았기 때문에 A로 타입변환이 가능하다
		a3.test();
		C a4 = new E();//E는 A를 상속받은 C를 상속 받았기 때문에 A로 타입변환이 가능하다
		a4.test();
		//B b3 = E(); 직계만 타입변환이 가능하다 강아지가 포유류이지 파충류가 될수 없다
		//C c2 = D();
	}

}

