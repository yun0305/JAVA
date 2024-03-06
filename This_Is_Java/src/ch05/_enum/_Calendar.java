package ch05._enum;

import java.util.Calendar;

public class _Calendar {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();//싱글톤 패턴 캘린더 객체는 하나의 생성된 객체만 사용한다
		int year = now.get(Calendar.YEAR);//년//get 메소드를 사용
		int month = now.get(Calendar.MONTH)+1;//월(1~12)
		int day = now.get(Calendar.DAY_OF_MONTH);//일
		int week = now.get(Calendar.DAY_OF_WEEK);//요일(1~7)
		int hour = now.get(Calendar.HOUR);//시간
		int minute = now.get(Calendar.MINUTE);//분
		int second = now.get(Calendar.SECOND);//초
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
	}

}
