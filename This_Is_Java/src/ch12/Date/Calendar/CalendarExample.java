package ch12.Date.Calendar;

import java.util.*;

/*
 * Calendar 클래스는 달력을 표현하는 추상 클래스이다. 날짜와 시간을 계산하는 방법은 지역과 문화
 * 에 따라 다리기 때문에 특정 연법에 따르는 달력은 자식 클래스에서 구현하도록 되어 있다.
 * 
 * 특별한 역법을 사용하는 경우가 아니라면 직접 하위 클래스를 만들 필요는 없고 Calendar클래스의 정적 메소드인 getInstance()
 * 메소드를 이용하면 컴퓨터에 설정되어 있는 시간대를 기준으로 Calendar 하위 객체를 얻을 수 있다.
 * 
 * Calendar now = Calendar.getInstance();
 * Calendar 가 제공하는 날짜와 시간에 대한 정보를 얻기 위해서는
 * get() 메소드를 이용한다. get() 메소드의 매개값으로 Calendar에 정의된 상수를 주면 상수가
 * 의미하는 값을 리턴한다.
 * 
 * int year = now.get(Calendar.YEAR); 			//년도를 리턴
 * int month = now.get(Calendar.MONTH)+1;		//월을 리턴
 * int day = now.get(Calendar.DAY_OF_MONTH);	//일을 리턴 
 * int week = now.get(Calendar.DAY_OF_WEEK);	//요일을 리턴
 * int amPm = now.get(Calendar.AM_PM);			//오전.오후를 리턴
 * int hour = now.get(Calendar.HOUR);			//시를 리턴
 * int minute = now.get(Calendar.MINUTE);		//분을 리턴 
 * int second = now.get(Calendar.SECOND);		//초를 리턴
 */

public class CalendarExample {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		//getIncetance() 메소드 내부에 로컬 클래스로 자식 클래스를 만들어서 자식 클래스가 리턴된다 
		
		int year = now.get(Calendar.YEAR); 			//년도를 리턴
		int month = now.get(Calendar.MONTH)+1;		//월을 리턴
		int day = now.get(Calendar.DAY_OF_MONTH);	//일을 리턴 
		int week = now.get(Calendar.DAY_OF_WEEK);	//요일을 리턴
		
		String strWeek = null;
		
		switch(week) {
		case Calendar.MONDAY:	
			strWeek = "월"; break;
		case Calendar.TUESDAY: 
			strWeek = "화"; break;
		case Calendar.WEDNESDAY: 
			strWeek = "수"; break;
		case Calendar.THURSDAY: 
			strWeek = "목"; break;
		case Calendar.FRIDAY: 
			strWeek = "금"; break;
		case Calendar.SATURDAY: 
			strWeek = "토"; break;
		default : strWeek = "일";
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		}
		else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
	
		System.out.print(year+"년 ");
		System.out.print(month+"월 ");
		System.out.print(day+"일 ");
		System.out.print(strWeek+"요일 ");
		System.out.print(strAmPm+" ");
		System.out.print(hour+"시 ");
		System.out.print(minute+"분 ");
		System.out.println(second+"초 ");
	}

}
