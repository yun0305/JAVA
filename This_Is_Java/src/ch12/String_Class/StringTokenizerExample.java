package ch12.String_Class;

import java.util.StringTokenizer;

/*
	 * StringTokenizer 클래스
	 * 문자열이 구분자로 연결되어 있을경우 구분자를 기준으로 문자열을 분리하려면 String의 split() 메소드를 이용하거나
	 * java.util 패키지의 StringTokenizer 클래스를 이용할수 있다.
	 * split() 은 정규표현식으로 구분하고 StringTokenizer는 문자로 구분한다는 차이점이 있다.
	 * 
	 * 다음과 같은 문자열에서 &,쉼표(,) 하이픈(-)으로 구분된 사람 이름을 뽑아낼 경우에는 정규 표현식으로 분리하는 split()
	 * 메소드를 사용해야한다. 정규 표현식을 작성하는 방법은 12.10절에서 학습한다.
	 * 
	 * String data = "홍길동&이수홍,박연수"
	 * String[] str = data.split("&|,");
	 * StringTokenizer st = new StringTokenizer(data,"/");
	 * 
	 * StringTokenizer 객체가 생성되면 다음 메소드들을 이용해서 분리된 문자열을 얻을 수 있다.
	 * 
	 * 리턴타입			메소드			설명
	 * int				countTokens()	분리할 수 있는 문자열의 총 수
	 * boolean 			hasMoreTokens() 남아 있는 문자열이 있는지 여부
	 * String			nextToken()		문자열을 하나씩 가져옴
	 * 
	 * nextToken() 메소드는 분리된 문자열을 하나씩 가져오고 더 이상 가져올 문자열이 없다면 예외를 발생시킨다.
	 * 그래서 nextToken()을 사용하기 전에 hasMoreToken() 메소드로 가져올 문자열이 있는지 먼저 조사하는 것이 좋은 방법이다.
	 * 
	 */


public class StringTokenizerExample {
	public static void main(String[] args) {
			
		String data1 = "홍길동&이수홍,박연수";
		String array[] = data1.split("&|,");
		
		
		for(String printArray : array) {
			System.out.println(printArray);
		}
		System.out.println();
		
		
		String data2 = "홍길동 이수홍 박연수";
		StringTokenizer st = new StringTokenizer(data2," ");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			
		}
	}
}
