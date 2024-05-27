package ch12.Date.Calendar;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class TakeNotes {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		String strWeek = null;
		
		switch(week) {
			
		case Calendar.MONDAY:
			strWeek = "월요일";
			break;
		case Calendar.TUESDAY:
			strWeek = "화요일";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수요일";
			break;
		case Calendar.THURSDAY:
			strWeek = "목요일";
			break;
		case Calendar.FRIDAY:
			strWeek = "금요일";
			break;
		case Calendar.SUNDAY:
			strWeek = "토요일";
			break;
			default :
				strWeek = "일요일";
		
				
				
		}
		System.out.println(strWeek);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일");
		
		System.out.println(sdf.format(date));
		
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY년 MM월 dd일");
		
		System.out.println(ldt.minusYears(10).plusMonths(5).minusDays(21).format(dtf));
		
		
		
	}
}
