package ch12.Format.DecimalFormat;

import java.text.DecimalFormat;

/*
	 * Format(형식) 클래스는 숫자 꼬는 날짜를 원하는 형태의 문자열로 변환해주는 기능을 제공한다.
	 * Format 클래스는 java.text 패키지에 포함되어 있는데, 주요 Format 클래스는 다음과 같다.
	 * 
	 * Format 클래스				설명
	 * 
	 * DecimalFormat			숫자를 형식화된 문자열로 변환
	 * SimpleDateFormat			날짜를 형식화된 문자열로 변환
	 * 
	 * <DecimalFormat>
	 * DecimalFormat은 숫자를 혈식화된 문자열로 변환하는 기능을 제공한다. 원하는 형식으로 표현하기 위해 다음과 같은
	 * 패턴을 사용한다.
	 * 
	 * 기호 		의미 						패턴 예 			 	1234567.89 -> 변환 결과
	 * 					
	 * 0		10진수(빈자리는 0으로 채움)		0				 	12345678
	 * 										0.0				 	12345678.9
	 * 										0000000000.89000 	0001234567.89000							
	 * 					
	 * 
	 * #		10진수(빈자리는 채우지 않음)		#					1234568
	 * 										#.#					1234567.9
	 * 										##########.#####	1234567.89
	 * 
	 * .		소수점						#.0					1234567.9
	 * 
	 * -		음수 기호						+#.0				+1234567.9
	 * 										-#.0				-1234567.9
	 * 
	 * .		단위 구분						#.###.0				1.234.567.9
	 * 
	 * #		지수문자						0.0E0				1.2E6
	 * 
	 * ;		양수와 음수의 패턴을 모두			+#>### ; -#,###		+1,234,568(양수일 때)
	 * 
	 * %		% 문자						#,# %				123456789 %
	 * 
	 *\u00A4	통화 기호						\u00A4 #.###		\1.234.568
	 *
	 * 			
	 * 패턴 정보와 함께 ,DecimalFormat 객체를 생성하고 format() 메소드로 숫자를 재공하면 패턴에 따른 형식화된
	 * 문자열을 얻을 수 있다.
	 * 
	 * DecimalFormat df = new DecimalFormat("#,###.0");
	 * String result = df.format(1234567.89); //1.234.567.9
	 * 
	 */

public class DecimalFormatExample {

	public static void main(String[] args) {
		
		double num = 1234567.89;
		
		DecimalFormat df;
		
		//정수 자리까지 표기
		df = new DecimalFormat("#.###");
		System.out.println(df.format(num) );
		
		//무조건 소수 첫 째 자리까지 표기
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
		

	}

}
