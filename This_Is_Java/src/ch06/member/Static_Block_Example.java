package ch06.member;

public class Static_Block_Example {

	public static void main(String[] args) {
		//클래스를 로딩하는 순간에 static 블록을 실행하니까 객체를 사용해도 클래스를 한번 로딩하니까. 1 2가 출력된다
//		클래스가 처음으로 참조되거나, 해당 클래스의 인스턴스가 생성되거나,
//		클래스의 static 멤버(변수 또는 메소드)에 접근할 때 클래스가 로딩됩니다.
//		new 연산자를 사용하여 해당 클래스의 인스턴스를 생성하는 경우에도 클래스가 로딩됩니다.
		
		Static_Block sb = new Static_Block();
		
		//객체를 생성하지 않아도 클래스로 접근 가능
		System.out.println(Static_Block.company);
		System.out.println(Static_Block.info);
		//정적 필드나 메소드가 아닌 경우에는 public static void main(String[] args) {
		//같은 정적 메소드에서 인스턴스 메소드나 필드를 사용하려면 객체를 생성해 줘야 한다.
		sb.on(true);
		//필기
		/*
		 * 정적 블록이 실행되는 시점은 클래스로더가 소스코드를 바이트드로 로딩할때이다.
		 *
		 * 생성자에서도 정적 필드를 초기화를 할수는 있다. 하지만 하지않는다. 왜냐면 정적 필드는 객체가 없이도
		 * 사용을 할수가 있어야 하는데 생성자에서 초기화를 해버리면 객체를 생성해야지 정적 필드가 초기화가 된다 잘못된 방식이고
		 * 정적이라는 키워드가 변질된다 그래서 우리는 static 블록으로 객체가 없이도 클래스를 로딩할때 초기화를 시켜준다
		 *
		 * 정적 메소드,정적 블록 에서는 인스턴스 필드와 메소드를 사용할수 없다.
		 * 사용하려면 객체를 생성해야한다 그래서 main메소드
		 * 에서도 객체를 생성해서 객체 참조변수를 통해 접근한다.
		 */
	}

}
