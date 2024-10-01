package ch12.Regular_Expression;

import java.util.regex.Pattern;

/*
 * 문자열이 정해져 있는 형식으로 구성되어 있는지 검증해야 하는 경우가 있다.
 * 예를 들어 이메일이나 전화번호를 사용자가 제대로 입력했는지 검증할 떄이다. 자바는 표현식을
 * 이용해서 문자열이 올바르게 구성되어 있는지 검증한다.
 * 
 * 정규 표현식은 문자 또는 숫자와 관련된 표현과 반복 기호가 결합된 문자열이다.
 * 다음은 정규 표현식을 구성하는 표현 및 기호에 대한 설명이다.
 * 
 * 표현및 기호		설명
 * []			한개의 문자		[abc] a,b,c 중 하나의 문자
 * 								[^abc] a,b,c 이외의 하나의 문자
 * 								[a-zA-Z] a에서 z,A에서Z중 하나의 문자
 * \d			한 개의 숫자,[0-9]와 동일
 * \s			공백
 * \w			한 개의 알파벳 또는 한개의 숫자, [a-zA-Z_0-9]와 동일
 * \.			.
 * .			모든 문자 중 한개의 문자
 * ?			없음 또는 한 개 이상
 * +			한 개 이상
 * {n}			정확히 n개 
 * {n,}			최소한 n개
 * {n,m}		n개부터 m개까지
 * a|b			a또는 b
 * ()			그룹핑 
 * 
 * 다음은 white@naver.com	과 같은 이메일을 위한 정규 표현식이다.
 * 
 *	\w+@\w+\.+(\.\w+)?
 * 주의할 점은 \.과 . 은 다르다는 것이다. \은 문자로서의 점(.)을 말하지만 .은 모든 문자 중에서
 * 한개의 문자를 뜻한다.
 * 
 * <Pattern 클래스로 검증>
 * java.util.regex 패키지의 Pattern 클래스는 정규 표현식으로 문자열을 검증하는
 * matches() 정적 메소드를 제공한다. 첫 번째 매개값은 정규 표현식이고, 두번째 매개값은 검증할 문자열이다.
 * 검증한 후의 결과는 boolean 타입으로 리턴된다.
 * 
 * boolean result = Pattern.matches("정규식,"검증할 문자열");
 * 
 * 다음 예제는 전화번호와 이메일을 검증하는 코드를 보여준다.
 */

public class PatternExample {

	public static void main(String[] args) {
		
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("정규식과 일치합니다");
		}
		else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@mycompanycom";
		result = Pattern.matches(regExp, data);

		if(result) {
			System.out.println("정규식과 일치합니다");
		}
		else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
	}

}
