package ch12.Object.toString;

public class ToStringExample {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone("삼성전자","안드로이드");
		
		String strObj = sp.toString();
		System.out.println(strObj);
		System.out.println(sp);//객체를 출력하면 toString 메소드가 자동으로 호출된다.
		

	}

}
