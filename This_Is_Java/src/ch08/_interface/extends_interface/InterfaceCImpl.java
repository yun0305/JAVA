package ch08._interface.extends_interface;

public class InterfaceCImpl  implements InterfaceC {

	
	@Override//부모 A인터페이스
	public void methodA() {
		System.out.println("IntefaceCImpl-methodA() 실행");
	}

	@Override//부모 B인터페이스
	public void methodB() {
		System.out.println("IntefaceCImpl-methodB() 실행");
	}

	@Override//자식 C인터페이스
	public void methodC() {
		System.out.println("IntefaceCImpl-methodC() 실행");
	}

}
