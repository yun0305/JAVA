package ch13.Generic.GenericType.GenericInterface;

public class HomeAgency implements Rentable<Home> {//인터페이스를 구현할때 타입지정
	
	@Override
	public Home rent() {
		return new Home();
	}
	
	
}
