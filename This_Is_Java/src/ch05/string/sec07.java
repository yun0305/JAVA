package ch05.string;

public class sec07 {

	public static void main(String[] args) {
		//문자열 추출
		String ssn = "010305-3253514";
		char sex = ssn.charAt(7);//charAt 메소드는 문자열을 추출할수 있다
		
		switch(sex) {
		case '1': case '3':
			System.out.println("남자입니다.");
			break;
		case '2': case '4':
			System.out.println("여자입니다.");
			break;
		}

	}
	
}


