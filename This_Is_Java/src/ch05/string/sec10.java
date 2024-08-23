package ch05.string;

public class sec10 {

	public static void main(String[] args) {
		
		//문자열 잘라내기
		String ssn = "010305-3253514";
		String firstNum = ssn.substring(0,6);//substring() 메소드는 문자열을 잘라낸다 첫번째 인덱스는 0,에서 두번째 인덱스는 6, 이전까지(0이상 6미만)
		String secondNum = ssn.substring(7);//인덱스가 하나면 7번째 자리부터 끝까지(해당 파라미터 이상 7이상)
		System.out.println(firstNum); 
		System.out.println(secondNum);
		
		

	}

}
