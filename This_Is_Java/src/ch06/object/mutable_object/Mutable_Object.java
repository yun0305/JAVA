package ch06.object.mutable_object;

import java.util.ArrayList;

public class Mutable_Object {

	/*
	 * 정의:
	 * 		객체의 상태(필드 값)가 생성된 후에도 변경 가능한 객체이다.
	 * 		
	 * 특징:
	 * 		필드 값(데이터)이 바뀔 수 있다.
	 * 		
	 * 		메소드나 연산을 통해 객체 내부의 값을 수정할 수 있다.
	 * 
	 * 		주로 자바의 컬랙션 클래스(ArrayList,HashMap 등)나 사용자 정의 클래스가 가변 객체로 구현된다.
	 */
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		
		System.out.println(list);
		
		list.remove("A");
		System.out.println(list);
	}
	
}
