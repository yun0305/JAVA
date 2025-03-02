package ch13.Generic.Generic_Method.Example;

import java.util.Arrays;

public class GenericMethodExample03 {
	
		//배열을 생성하고 반환하는 제네릭 메소드
	public static <T> T[] createArray(T... element) {
		
		return element;
	}
	
	public static void main(String[] args) {
		String[] strArray = createArray("one","two","three");
		Integer[] integerArray = createArray(1,2,3);
		
		System.out.println(Arrays.toString(strArray));
		System.out.println(Arrays.toString(integerArray));
	}
	
}
