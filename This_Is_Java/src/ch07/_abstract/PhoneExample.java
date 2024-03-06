package ch07._abstract;

public class PhoneExample {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("윤");
		sp.turnOn();//추상클래스 메소드
		System.out.println("사용자 이름: "+sp.getOwner());//추상클래스 getter메소드 호출 추상클래스 필드를 가져온다
		sp.internetSearch();//자식 클래스가 가지고 있는 메소드
		sp.turnOff();////추상클래스 메소드
		

		
	
	}

}
