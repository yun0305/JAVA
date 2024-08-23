package ch05.string;

public class sec11 {

	public static void main(String[] args) {
		//문자열 찾기
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");//indexOf()메소드는 해당 문자열이 있다면 그 문자열의 앞 숫자를 리턴하고 없다면 -1를 리턴한다
		System.out.println(location);
		
		String substring = subject.substring(location);
		System.out.println(substring);
		location = subject.indexOf("자바"); 
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요");
		}
		else {
			System.out.println("자바와 관련 없는 책이군요");
		}
		
		boolean result = subject.contains("자바");// contains() 메소드는 false true로 있는지 없는지 리턴한다 
		
		if(result) {
			System.out.println("자바와 관련 있는 책이군요");
		}
		else {
			System.out.println("자바와 관련 없는 책이군요");
		}
		System.out.println();
		
	}
	

}
