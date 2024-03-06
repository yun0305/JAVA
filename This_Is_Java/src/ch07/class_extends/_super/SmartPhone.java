package ch07.class_extends._super;

public class SmartPhone extends Phone {

	/*
	 * 자식 객체를 생성할때는 자식 객체만 만들지 않는다 부모 객체를 먼저 생성하고
	 * 자식 객체를 생성한다 객체를 생성하는 키워드는 생성자이다 생성자 안에
	 * super(); 이부분이 부모 생성자를 호출하는 부분이다
	 * 
	 * 규칙
	 * 1.super();로 부모 객체를 생성할때는 무조건 자식 생성자 맨위에서 호출해야한다
	 * (객체가 만들어지는 시점은 부모생성자가 실행이 다 끝나고 부모 객체가 만들어진 다음
	 * 자식 객체가 만들어진다 자식 생성자 안에
	 * super(); 가 먼저 실행 함으로 부모 생성자의 호출을 먼저 끝내고 나머지 자식 생성자를 끝낸다)
	 * 왜냐면 부모 객체를 먼저 만들어 주어야지만 자식클래스에서 상속을 받을수 있기 때문이다.
	 * 
	 * 2.부모 생성자가 기본생성자이면 생략이 가능하지만 기본생성자가 없으면 명시적으로 
	 * 생성해줘야 한다(이말은 기본생성자가 아닌 매개값을 가진 생성자 들은 명시적으로 선언 해줘야 한다는 뜻이다)
	 * 	 
	 *  */
	
	public SmartPhone(String color,String model) {
		super();//실행순서 1
		
		this.color = color;//실행순서 2 ...
		this.model = model;
		System.out.println("Smart Phone(String color String model)생성자 실행됨");
	}
	
}
