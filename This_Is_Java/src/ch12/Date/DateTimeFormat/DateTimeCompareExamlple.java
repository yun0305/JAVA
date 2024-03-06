package ch12.Date.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*
	 * LocalDateTime 클래스는 날짜와 시간을 비교할 수 있는 다음 메소드를 제공한다.
	 * 
	 *리턴 타입 			메소드				설명
	 *
	 * boolean			isAfter(other)		이후 날짜인지
	 * 					isBefore(other)		이전 날짜인지
	 * 					isEqual(other)		동일 날짜인지
	 * 
	 * long				until(other , unit)	주어진 단위(unit) 차이를 리턴	
	 * 
	 * 
	 * 다음 예제는 2021년 1월 1일과 2021년 12월 31일을 비교한다.
	 * 
	 * 
	 */


public class DateTimeCompareExamlple {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a hh:mm:ss");
		
		
		LocalDateTime startDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
		//now 말고도 of로 현재 말고 내가 날짜를 지정해서 받아올수도 있다.
		System.out.println("시작일 : " + startDateTime.format(dtf));
		
		LocalDateTime endDateTime = LocalDateTime.of(2021, 12, 31, 0, 0, 0);
		System.out.println("종료일 : " + endDateTime.format(dtf));
		
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println("진행 중입니다.");
		}
		else if(startDateTime.isEqual(endDateTime)) {
			System.out.println("종료합니다.");
		}
		else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("종료했습니다.");		
		}
		
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
	}

}
