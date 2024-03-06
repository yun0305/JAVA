package ch05.string;

public class sec08 {

	public static void main(String[] args) {
		//문자열 길이
		String ssn = "0103053253514";
		int length = ssn.length();
		
		System.out.println(ssn.length());
		System.out.println(ssn.charAt(12));
		
		if(length == 13) {
			System.out.println("주민등록 번호가 맞습니다");
		}
		else{
			System.out.println("주민등록번호 자리수가 틀립니다");
		}
	}

}
