package ch13.Generic.Generic_Method;

public class Util {
	
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
	}
	
}
