package ch08._interface.interface_type_conversion.casting_converstion_interface;

public class CastingExample {

	public static void main(String[] args) {
		
		//인터페이스 변수 선언및 구현객체 대입
		Vehicle vc = new Bus();
		
		//인터페이스를 통해서 호출할때
		vc.run();
		//vc.checkFare(); 사용불가
		
		 Bus bs = (Bus)vc;
		 bs.run();
		 bs.checkFare();
		

	}

}
