package ch06.singleton;

public class Singleton {
	
	/*
	 * 싱글톤 패턴은 객체지향 디자인 패턴중 하나로 특정 클래스에 대해
	 * 하나의 인스턴스만 생성하도록 보장하고 이 인스턴스를 전역에서 접근할 수 있도록 하는
	 * 패턴이다 주로 전역 상태를 관리하거나 자원을 공유하는 경우에 유용하게 사용된다.
	 */
	
		//1.자기 자신을 private static으로 객체 선언
		private static Singleton singleton = new Singleton();
		
		//2.외부에서 객체 생성할수 없도록 생성자를 private로 설정
		private Singleton() {
			
		}
		
		//3.오직 getter메소드로만 객체를 불러올수 있도록 함
		public static Singleton getInstance() {
			return singleton;
		}
}
