package ch06.singleton;

public class Singleton {
	//싱글톤
		/*
		 * 하나의 프로젝트에서 하나의 객체만 만들어야 할때 사용한다 여기서
		 * 생성되는 모든 클래스 참조변수는 하나의 객체만을 사용한다
		 */
		//조건1 필드를 클래스 참조변수로 필드로 만들어서 객체를 생성한다
		//private이여야 하고 static이여야 한다
		private static Singleton singleton = new Singleton();
		//조건2
		//private조건을 가진 생성자 생성
		//객체에 접근해서 객체를 만드는것을 방지한다
		private Singleton() {
		}
		//조건3
		//public static타입에 데이터 타입은 클래스인 메소드를 만든다 리턴값은 조건1 에서 만든 필드다
		// 이 메소드를 실행하게 되면 필드에서 만들어진 객체 1개를 이 매소드를 통해
		// 똑같은 객체의 번지를 다른 참조 변수에 참조시킬수 있다 이러면 1개의 객체를 만들고
		// 여러게의 참조 변수에 담을수 있다.
		public static Singleton getInstance() {
			return singleton;
		}
}
