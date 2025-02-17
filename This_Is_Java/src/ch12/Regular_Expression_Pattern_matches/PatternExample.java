package ch12.Regular_Expression_Pattern_matches;

import java.util.regex.Pattern;

/*
 * 문자열이 정해져 있는 형식으로 구성되어 있는지 검증해야 하는 경우가 있다.
 * 예를 들어 이메일이나 전화번호를 사용자가 제대로 입력했는지 검증할 떄이다. 자바는 표현식을
 * 이용해서 문자열이 올바르게 구성되어 있는지 검증한다.
 * 
 * 정규 표현식은 문자 또는 숫자와 관련된 표현과 반복 기호가 결합된 문자열이다.
 * 다음은 정규 표현식을 구성하는 표현 및 기호에 대한 설명이다.
 * 
 📌 정규 표현식(Regular Expression) 기호 정리
 *
 * []      : 한 개의 문자 (예: [abc] → 'a', 'b', 'c' 중 하나)
 * [^]     : 부정 문자 클래스 (예: [^abc] → 'a', 'b', 'c' 제외한 문자)
 * [a-z]   : 문자 범위 (예: [a-zA-Z] → 'a' ~ 'z', 'A' ~ 'Z' 중 하나)
 * \d      : 숫자 (0~9, [0-9]와 동일)
 * \D      : 숫자가 아닌 문자 ([^\d]와 동일)
 * \s      : 공백 (스페이스, 탭, 줄바꿈 포함)
 * \S      : 공백이 아닌 문자 ([^\s]와 동일)
 * \w      : 알파벳, 숫자, 언더스코어 ([a-zA-Z0-9_]와 동일)
 * \W      : 단어 문자가 아닌 문자 ([^\w]와 동일)
 * .       : 모든 문자 (개행 문자 제외)
 * \.      : 마침표 ('.' 문자 자체를 의미)
 * ?       : 없음 또는 한 개 (예: colou?r → "color" 또는 "colour" 매칭)
 * *       : 0개 이상 반복 (예: ab*c → "ac", "abc", "abbc" 매칭)
 * +       : 1개 이상 반복 (예: ab+c → "abc", "abbc" 매칭)
 * {n}     : 정확히 n개 (예: \d{3} → 숫자 3자리)
 * {n,}    : 최소 n개 (예: \d{3,} → 숫자 3개 이상)
 * {n,m}   : n개부터 m개까지 (예: \d{3,5} → 숫자 3~5자리)
 * a|b     : a 또는 b (예: apple|banana → "apple" 또는 "banana" 매칭)
 * ()      : 그룹핑 (예: (abc)+ → "abc"가 1회 이상 반복)
 * \       : 이스케이프 문자 (예: \. → '.' 문자 그대로 매칭)
 * ^       : 문자열 시작 (예: ^Hello → "Hello"로 시작하는 문자열)
 * $       : 문자열 끝 (예: end$ → "end"로 끝나는 문자열)
 *
 * 📌 추가 정규식 기호
 * \b      : 단어 경계 (예: \bword\b → "word"가 단독 단어로 존재하는 경우)
 * \B      : 단어 경계가 아님 (예: \Bword\B → "word"가 다른 문자 포함된 경우)
 * *?      : 0개 이상 비탐욕적 (예: <.*?> → 첫 번째 ">"까지만 매칭)
 * +?      : 1개 이상 비탐욕적 (예: ".+?" → 최소한의 문자 매칭)
 * {n,m}?  : n~m개 비탐욕적 (예: .{2,5}? → 최소 2개, 최대 5개)
 * \1, \2  : 후방 참조 (예: (\d)\1 → 같은 숫자가 연속된 경우, 예: "11", "22")
 *
 * 📌 예제 코드 (자바에서 정규 표현식 활용)
 * 
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
