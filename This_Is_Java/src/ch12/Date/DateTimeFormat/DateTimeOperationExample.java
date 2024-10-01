package ch12.Date.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * Date와 Calendar는 날짜와 시간 정보를 얻기에는 충분하지만, 날짜와 
 * 시간을 조작할수는 없다. 이때는 java.time 패키지의 LocalDateTime 클래스가 제공하는
 * 다음 메소드를 이용하면 매우 쉽게 날짜와 시간을 조작할수 있다.
 * 
 * 
 * 메소드(매개변수)			설명
 * 
 * minusYears(long)		년 빼기
 * minusMonths(long)	월 빼기
 * minusDays(long)		일 빼기
 * minusWeeks(long)		주 빼기
 * 
 * plusYears(long)		년 더하기
 * plusMonths(long)		월 더하기
 * plusWeeks(long)		주 더하기
 * plusDays(long)		일 더하기
 * 
 * minusHours(long)		시간 빼기
 * minusMinutes(long)	분 빼기
 * minusSeconds(long)	초 빼기
 * minusNanos(long)		나노초 빼기
 * 
 * plusHours(long)		시간 더하기
 * plusMinutes(long)	분 더하기
 * plusSeconds(long)	초 더하기
 * 
 * LocalDateTime 클래스를 이용해서 현재 컴퓨터의 날짜와 시간을 얻는 방법은 다은과 같다
 * 
 * LocalDateTime now = LocalDateTime.now();
 * 
 * DateTimeFormatter는 날짜와 시간을 주어진 문자열 패턴으로 변환할 때 사용한다.
 * LocalDateTime의 format() 메소드 호출 시 매개값으로 제공하면 문자열 패턴과 동일한 문자열을 얻을수 있다 
 * 문자열 패턴은 12.9절에서 자세히 설명한다.
 */


public class DateTimeOperationExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();// 현재 시간을 받아옴
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");// 해당형식의 날짜로 포맷함
		System.out.println("현재 시간 " + now.format(dtf));
		
		LocalDateTime result1 = now.plusYears(1);
		System.out.println("1년 더하기 "+result1.format(dtf));
		
		LocalDateTime result2 = now.minusMonths(2);
		System.out.println("2년 빼기 "+result2.format(dtf));
		
		LocalDateTime result3 = now.plusDays(7);
		System.out.println("7일 더하기 "+ result3.format(dtf));
		
		
		/*
		 * LocalDateTime 을 포맷 할때는 DateTimeFormatter를 사용한다. 
		 * LocalDateTime 객체를 만들고 DateTimeFormatter 객체를 만든다음
		 * LocalDateTime 메소드중 format() 메소드의 DateTimeFormatter 객체를 넣어준다.
		 * 
		 * 
		 * 
		 */

	}

}
