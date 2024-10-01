package ch06.singleton;

public class Singleton {
	
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
