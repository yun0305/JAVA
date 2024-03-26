package ch13.Generic.GenericType.GenericInterface;

public class CarAgency implements Rentable<Car> {
@Override
public Car rent() {
	
	return new Car();
}
}
