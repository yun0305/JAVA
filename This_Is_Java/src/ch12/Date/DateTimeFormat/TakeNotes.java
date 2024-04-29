package ch12.Date.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class TakeNotes {
	
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.ss");
		
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.get(Calendar.YEAR));
		
		System.out.println(sdf.format(d));
		
		System.out.println(now.format(dtf));
		System.out.println(now.minusYears(23).format(dtf));
		System.out.println(now.format(dtf));
		
	}
}
