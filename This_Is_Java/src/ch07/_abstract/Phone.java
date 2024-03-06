package ch07._abstract;

public abstract class Phone {
/* 추상 클래스는 실체 클래스의 공통 되는 필드와 메소드를 추출해서 만들었기 때문에 객체를 직접 생성해서 사용할 수 없다.
 * 다시 말해서 추상 클래스는 new 연산자를 사용해서 인스턴스를 만들수 없다
 *  추상 클래스는 새로운 클래스를 만들기 위한 부모 클래스로만 사용된다 코드로 설명하면 추상 클래스는 extends 뒤에만 올 수 있는 클래스 이다.
 * 
 */
	//필드
	private String owner;
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}

	//메소드
	public void turnOn() {
		System.out.println("폰의 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰의 전원을 끕니다.");
	}


}
