package ch08._interface.interface_type_conversion.interface_polymorphism.prameters;

/*
 * 메소드 호출시 매개값을 다양화하기 위해 상속에서는 매개변수 타입을 부모 타입으로 선언하고 호출할 때에는 다양한
 * 자식 객체를 대입했다. 이것은 자동 타입 변환 때문인데, 비슷한 원리로 매개변수 타입을 인터페이스로 선언하면
 * 메소드 호출 시 다양한 구현 객체를 대입할 수 있다.
 * 
 * Vehicle 인터페이스가 다음과 같이 선언되었다고 가정해보자.
 * 
 * public interface Vehicle{
 * 
 * 	void run();
 * }
 * 
 * 
 * 운전자 클래스인 Driver는 다양한 Vehicle 구현 객체를 운전하기 위해 Vehicle 인터페이스 를 매개변수로
 * 가지는 drive() 메소드를 다음과 같이 선언했다.
 *
 * public class Driver{
 * void drive(Vehicle vehicle) {
 *		vehicle.run();	
 *	}
 *}
 *Bus가 Vehicle의 구현 클래스라면 다음과 같이 Driver의 drive() 메소드를 호출할 때 Bus 객체를 
 *생성해서 매개값으로 줄 수있다.
 *
 *drive() 메소드를 호출할 때 인터페이스 Vehicle을 구현하는 어떠한 객체라도 매개값으로 줄 수 있는데.
 *어떤 객체를 주느냐에 따라 run() 메소드의 실행 결과는 다르게 나온다 이유는 구현 객체에서 재정의된 run() 메소드
 *의 실행 내용이 다르기 떄문이다. 이것이 매개변수의 다형성이다.
 *
 * 
 * 
 */


public interface Vehicle {

	void run();
	
}
