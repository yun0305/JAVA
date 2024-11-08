package ch06.member;

public class Car_Instance {
	//인스턴스 멤버
	/*
	 * 인스턴스 멤버는 객체를 생성해야지만 사용할수 있다
	 * 객체 안에는 필드가 있고 인스턴스 메소드의 정의는 클래스영역에 정의되어있다.
	 * (들드는 인스턴스에 저장된다있다.)
	 * (클래스 영역에 저장되있다는 뜻과 같다)
	 * 
	 * 그러면 인스턴스 메소드가 아닌가?
	 * 인스턴스 메소드 맞다 인스턴스 안에는 없지만 인스턴스 메소드는 객체를 통해서만 접근할수 있기 때문에
	 * 소속은 인스턴스가 맞다
	 *  
	 * 객체의 필드(데이터)는 객체마다 다르다 하지만 메소드(동작)는 인스턴스마다 파라미터값은 다르지만
	 * 동작 매커니즘이 다르지 않다.
	 * 
	 * 그렇기 때문에 객체마다 만들어 주는것은 메모리 손실이기 때문에 객체마다 만들어 주지 않고
	 * 클래스 영역에 메소드를 정의하고
	 * 인스턴스가 생성될때마다 클래스에 정의되있는 메소드와 인스턴스가 함께 실행된다.
	 * 
	 * 인스턴스 메소드는 클래스에 정의되어 있으며, 호출 시에는 특정 인스턴스의 데이터와 함께 실행된다
	 * 반드시 객체를 통해서만 접근할 수 있다.
	 * 
	 * (추가설명)
	 * 인스턴스 멤버 (Instance Member):
	 *
	 * 객체의 상태를 나타내는 변수들이나 객체의 동작을 수행하는 메서드를 인스턴스 멤버로 선언합니다.
     * 객체를 생성할 때마다 해당 멤버의 복사본이 생성되며, 객체의 상태를 나타내므로 객체 각각이 다른 값을 가질 수 있습니다.
     * 주로 객체의 상태를 나타내기 위해 사용됩니다.
	 * 
	 */
		//필드 선언
		static double pi = 3.14;
		String model;
		int speed;
		//생성자 선언
		Car_Instance(String model){
			this.model = model;// 매개변수를 필드에 대입(this 생략 불가)
			
		}
		//메소드 선언
		void setSpeed(int speed) {
			this.speed = speed;// 매개변수를 필드에 대입(this 생량 불가)
		}
		void run() {
			this.setSpeed(100);
			System.out.println(this.model+" 이달립니다(시속"+ this.speed + "Km/h)");
		}
		
		static void test() {
			System.out.println("test");
		}
}
