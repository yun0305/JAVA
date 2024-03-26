package ch13.Generic.GenericType.GenericInterface;

public class HomeAgency implements Rentable<Home> {
	
	@Override
	public Home rent() {
		return new Home();
	}
	
	
}
