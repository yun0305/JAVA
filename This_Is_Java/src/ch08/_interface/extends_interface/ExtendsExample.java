package ch08._interface.extends_interface;

public class ExtendsExample {

	public static void main(String[] args) {
		
		InterfaceCImpl impl = new InterfaceCImpl();
	
		/*부모 타입 인터페이스 변수에 다중상속 받은 구현 객체를 대입하면 
		해당 부모 인터페이스의 메소드만 호출 가능하다.*/
		
		InterfaceA ia = impl;//A인터페이스가 가지고 있는 추상메소드OR디폴트 메소드만 호출가능
		ia.methodA();
		//ia.methodB();
		System.out.println();
		
		InterfaceB ib = impl;//B인터페이스가 가지고 있는 추상메소드OR디폴트 메소드만 호출가능
		//ib.methodA();
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;//C는 2개의 부모를 상속받은 자식 인터페이스이기 때문에 모든 메소드를 호출 할수 있다.
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
		
		
		
		
		
	}	

}
