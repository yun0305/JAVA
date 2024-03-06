package ch07.polymorphism.parameters;

public class DriveExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Vehcle vehcle = new Vehcle();
		Bus bus = new Bus();
		Texi texi = new Texi();
		
		driver.drive(vehcle);
		driver.drive(bus);
		driver.drive(texi);
		
		
	}

}