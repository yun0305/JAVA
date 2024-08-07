package ch13.Generic.GenericType.GenericInterface;

public class CarAgency implements Rentable<Car> { //인터페이스를 구현할때 타입지정
@Override
public Car rent() {
	
	return new Car();
}
}
