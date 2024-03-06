package ch08._interface.interface_type_conversion.interface_polymorphism;

/*
 * 상속의 다형성과 마찬가지로 인터페이스 역시 다형성을 구현하기 위해 재정의와 자동 타입 변환 기능을 이용한다
 * 
 * 인터페이스의 추상 메소드는 구현 클래스에서 재정의를 해야하며, 재정의되는 내용은 구현 클래스 마다 다르다.
 * 구현 객체는 인터페이스 타입으로 자동 타입 변환이 되고, 인터페이스 메소드 호출시 구현 객체의 재정의된
 * 메소드가 호출되어 다양한 실행 결과를 얻을 수 있다.
 * 
 * 필드의 다형성
 * 자동차를 설계할 때 다음과 같이 필드 타입으로 타이어 인터페이스를 선언하면 필드값으로 한국 타이어 또는 금호 타이어
 * 객체를 대입할 수 있다. 자동 타입 변환 때문이다.
 * 
 * public class Car{
 * Tire tire1 = new HankookTire();
 * Tire tire2 = new KumhoTire();
 * }
 * 
 * Car객체를 생성한후에 다른 객체를 대입할수도 있다. 
 * Car myCar = new Car();
 * myCar.tire1 = new KumhoTire();
 * 
 */

public interface Tire {
	void roll();
}
