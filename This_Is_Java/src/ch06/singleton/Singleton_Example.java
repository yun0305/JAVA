package ch06.singleton;

public class Singleton_Example {

	public static void main(String[] args) {
		
		//객체 생성해 보기
		//Singleton sing1 = new Singleton(); 컴파일 에러
		//Singleton sing2 = new Singleton(); 컴파일 에러
		//정적 메소드를 이용해서 싱글톤 객체를 얻음
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		if(sing1 == sing2) {
			System.out.println("같음");
		}
		else {
			System.out.println("다름");
		}
	}

}
