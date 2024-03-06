package ch08._interface.interface_type_conversion.interface_polymorphism.prameters;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver dv = new Driver();
		Bus b = new Bus();
		Taxi T = new Taxi();
		
		dv.drive(b);
		dv.drive(T);
		

	}

}
