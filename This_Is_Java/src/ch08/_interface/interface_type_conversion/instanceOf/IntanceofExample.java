package ch08._interface.interface_type_conversion.instanceOf;

public class IntanceofExample {

	public static void main(String[] args) {
		
		//구현객체 생성
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		//ride() 메소드 호출 시 구현 객체를 매개값으로 전달
		
		ride(bus);
	}

	public static void ride(Vehicle vehicle) {
		
		if(vehicle instanceof Bus bus) {	
			bus.checkFare();
		}
		
		vehicle.run();
		
	}
	
}
