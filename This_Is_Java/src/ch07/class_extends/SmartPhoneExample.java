package ch07.class_extends;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//객체생성
		SmartPhone sp = new SmartPhone("갤럭시","은색");
		
		//Phone으로 상속받은 필드 읽기
		System.out.println("모델 : "+sp.getModel());
		System.out.println("색상: "+sp.getColor());
		//SmartPhone의 필드 읽기
		System.out.println("와이파이 상태: "+sp.isWifi());
		//Phone으로 부터 상속받은 메소드 호출
		sp.bell();
		sp.sendVoice("여보세요");
		sp.receiveVoice("저는 홍길동 입니다");
		sp.sendVoice("반갑습니다");
		sp.hangup();
		//SmartPhone의 메소드 호출
		sp.setWifi(true);
		System.out.println("와이파이 상태: "+sp.isWifi());
		sp.internet();

	}

}

