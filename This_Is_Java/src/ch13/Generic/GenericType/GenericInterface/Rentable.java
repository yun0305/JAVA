package ch13.Generic.GenericType.GenericInterface;

public interface Rentable<P> {
	/*
	 * 구현시킬때 p자리에 구체적인 타입을 지정해주면
	 * 추상메소드는 그 타입에 따른다.
	 */
	P rent();
	
}
