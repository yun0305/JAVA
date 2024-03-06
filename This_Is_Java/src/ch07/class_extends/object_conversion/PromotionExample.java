package ch07.class_extends.object_conversion;

class A {
	
}
class B extends A{//
	
}
class C extends A{
	
}
class D extends B{
	
}
class E extends C{
	
}

public class PromotionExample {

	
	public static void main(String[] args) {
		
		/*
		 *  Cat cat = new Cat();
		 *  Animal animal = cat;
		 *  이런식으로 타입변환을 하면 메모리에서 어떻게 만들어 지냐면
		 *  자식클래스인 Cat객체를 만들게 되면 당연히 부모 객체도 같이 만들어진다 
		 *  결국 cat객체 안에는 animal객체도 포함이 되기 때문에 타입변환이 가능한 것이다
		 *  둘의 참조값을 비교해 보면 참조 값이 같다는것 알수 있다.
		 */
		
			
		
		//객체 자동 타입변환
		A a1 =  new B();//B는 A를 상속 받았기 때문에 A로 자동타입 변환이 된다
		A a2 = new C();//C도 A를 상속 받았기 때문에 A로 자동타입 변환이 된다
		A a3 = new D();//D는 A를 상속받은 B를 상속 받았기 때문에 A로 타입변환이 가능하다
		A a4 = new E();//E는 A를 상속받은 C를 상속 받았기 때문에 A로 타입변환이 가능하다
		
		//B b3 = E(); 직계만 타입변환이 가능하다 강아지가 포유류이지 파충류가 될수 없다
		//C c2 = D();
	}

}

