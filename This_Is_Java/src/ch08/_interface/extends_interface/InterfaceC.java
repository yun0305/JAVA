package ch08._interface.extends_interface;

public interface InterfaceC extends InterfaceA,InterfaceB {
	void methodC();
	
	/*
	 * 상속받은 인터페이스가 하나라도 부모 인터페이스의 메소드를 호출할떄는
	 * 인터페이스에서는
	 * 
	 *  super 앞에 부모 인터페이스를 명시해준다
	 *  InterfaceA.super.hello();
	 *  
	 *  이건 인터페이스의 문법이다.
	 *  
	 *  저버에서 super 키워드는 클래스의 부모 클래스를 참조할 떄 사용된다.
	 *  
	 *  하지만 인터페이스는 클래스와 다르게 다중 상속이 가능하므로 어느 부모 인터페이스의
	 *  디폴트 메소드를 호출할지 명시적으로 지정해야 한다.
	 */
	
	@Override
	default void hello() {
		// TODO Auto-generated method stub
		InterfaceA.super.hello();
	}
	
	private void testMathod() {
		InterfaceA.super.hello();
	}
	
	
}
