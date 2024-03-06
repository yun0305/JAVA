package ch05._enum;

import java.util.Calendar;

public class WeekExample1 {

	public static void main(String[] args) {
		// 열거변수 선언
				Week today = null; // 열거타입 변수 선언
				Calendar now = Calendar.getInstance();
				int week = now.get(Calendar.DAY_OF_WEEK);// 일(1)~토(7)까지의 숫자를 반환함
				switch(week) {
				case 1:
					today = Week.SUNDAY;
					break;
				case 2:
					today = Week.MONDAY;
					break;
				case 3:
					today = Week.TUESDAY;
				case 4:
					today = Week.WEDNESDAY;
					break;
				case 5:
					today = Week.THURSDAY;
					break;
				case 6:
					today = Week.FRIDAY;
				case 7:
					today = Week.SATURDAY;
					break;
				}
				
				System.out.println("오늘의 요일 "+today);
				if(today == Week.TUESDAY) {
					System.out.println("쉬는날");
				}
				else {
					System.out.println("공부하는날");
				}
			}

	}


