package ch08._interface.private_method;

public interface Service {

	/*
	 * 인터페이스의 상수 필드, 추상 메소드, 디폴트 메소드, 정적 메소드는 모두 public 접근 제한을 갖는다. 이 멤버들을
	 * 선언할 때에는 public 을 생략하더라도 컴파일 과정에서 public 접근 제한자가 붙어 항상 외부에서 접근이 가능하다
	 * 또한 인터페이스에 외부에서 접근할 수 없는 private 메소드도 가능하다
	 * 
	 * private 메소드 : 구현 객체가 필요한 메소드
	 * private static 메소드 : 구현객체가 필요없는 메소드
	 * 
	 * private 메소드는 디폴트 메소드 안에서만 호출이 가능한 반면, private 정적 메소드는 디폴트 메소드 
	 * 뿐만 아니라 정적 메소드  안에서도 호출이 가능하다. private 메소드의 용도는 디폴트와 정적 메소드들의 
	 * 중복 코드를 줄이기 위함이다.
	 * 
	 * 
	 */
	
	//디폴트 메소
	default void defaultMethod1() {
		System.out.println("예시 중복코드");
		defaultCommon();
	}
	
	//디폴트 메소드
	default void defaultMethod2() {
		System.out.println("예시 중복코드");
		defaultCommon();
	}
	
	//private 메소드
	private void defaultCommon() {
		/*
		 * 위에 두개의 디폴트 메소드에서 중복되는 코드는 private 메소드로 묶어주면된다
		 * 	하지만 private이기 때문에 객체 소속이지만 디폴트 메소드가 없이 단독으로 호출할수는 없다
		 * 
		 * */
		System.out.println("예시 중복코드 대체코드");
	}
	
	//정적 메소드
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");	
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
	}
	
	private static void staticcommon() {
		System.out.println("staticMethod 중복 코드C");
		System.out.println("staticMethod 중복 코드D");
	}
	
}
