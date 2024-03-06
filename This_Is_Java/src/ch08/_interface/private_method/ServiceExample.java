package ch08._interface.private_method;

public class ServiceExample {

	public static void main(String[] args) {
		
		
		//인터페이스 변수 선언 구현 객체 대입
		Service sv = new ServiceImpl();
		
		//디폴트 메소드 호출
		sv.defaultMethod1();
		System.out.println();
		sv.defaultMethod2();
		System.out.println();
		
		//정적 메소드 호출
		Service.staticMethod1();
		System.out.println();
		Service.staticMethod2();
		System.out.println();

	}

}
