package ch12.Format.SimpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
	 * SimpleDateFormat은 날짜를 형식화된 문자열로 변환하는 기능을 제공한다, 원하는 형식으로 표현하기 위해 다음과 같은
	 * 패턴을 사용한다.
	 * 
	 * 패턴 문자 		의미 					패턴문자		의미
	 * y			년						H			시(0~23)
	 * M			월						h			시(1~12)
	 * d			일						K			시(0~11)
	 * D			월 구분이 없는 일(1~365)	k			시(1~24)
	 * E			요일						m			분
	 * a			오전/오후					s 			초
	 * w			년의 몇 번째 주			S			밀리세컨드(1/1000초)
	 * W			월의 몇 번째 주			
	 * 
	 * 패턴에는 자릿수에 맞게 기호를 반복해서 작성할 수 있다, 예를 들어 yyyy는 년도를 4자리로 MM
	 * 과 dd는 각각 월과 일을 자리로 표시하라는 의미이다. 패턴 정보와 함께 SimpleDateFormat 객체
	 * 를 생성하고 format() 메소드로 날짜를 제공하면 패턴과 동일한 문자열을 얻을 수 있다.
	 * 
	 * SimpleDateFormat sdf	= new SimpleDateFormat("yyyy년 MM월 dd일");
	 * String strDate = sdf.format(new Date()); // 2021년 11월 28일
	 * 
	 * 
	 * 
	 */

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("올해의 D번째 날");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("이달의 d번째 날");
		System.out.println(sdf.format(now));
		
	}

}
