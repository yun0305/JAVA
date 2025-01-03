package ch07._abstract;

public abstract class Phone {
/* 추상 클래스는 실체 클래스의 공통 되는 필드와 메소드를 추출해서 만들었기 때문에 객체를 직접 생성해서 사용할 수 없다.
 * 다시 말해서 추상 클래스는 new 연산자를 사용해서 인스턴스를 만들수 없다
 * 추상 클래스는 새로운 클래스를 만들기 위한 부모 클래스로만 사용된다 코드로 설명하면 추상 클래스는 extends 뒤에만 올 수 있는
 * 클래스 이다.
 * 
 * 사용기준 
 *  추상 클래스를 사용하는 경우는 클래스 간에 공통된 속성이 필요한 경우다
 *  메소드의 일부는 공통으로 제공하고 일부만 서브 클래스에서 구현해야 하는 경우
 *  
 *  예: 동물 클래스에서 name이나 age같은 공통 속성이 필요할 떄.
 *  
 *  인터페이스를 사용하는 경우
 *  여러 클래스에서 특정 행동(만) 강제해야하는 경우
 *  다중상속 (인터페이스 다중 구현)이 필요한 경우
 *  예: Runnable, comparable 같은 표준 인터페이스
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
