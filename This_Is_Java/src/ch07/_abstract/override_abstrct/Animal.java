package ch07._abstract.override_abstrct;

public abstract class Animal {
	
	public String kind;
	
	public void berathe() {
		System.out.println("숨을 쉽니다");
	}
	
	abstract void sound();//추상 메소드
	//당연하지만 추상메소드는 static으로 선언할수 없다. 추상클래스에 소속시켜도
	//추상메소드를 재정의도 하지 않은 상태에서 호출해봤자 의미가 없다.
	
	public static void test() {
		System.out.println("test");
	}
	
	//이럴 경우 추상 클래스로 접근을 해서 불러온다 이건 가능하다. 
	
	
}
