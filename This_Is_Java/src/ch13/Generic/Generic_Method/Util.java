package ch13.Generic.Generic_Method;

public class Util {
	
	public static <U> Box<U> boxing(U t){
		Box<U> box = new Box<U>();
		box.setT(t);
		return box;
	}
	
}
