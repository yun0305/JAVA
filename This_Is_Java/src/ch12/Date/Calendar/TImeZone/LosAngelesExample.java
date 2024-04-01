package ch12.Date.Calendar.TImeZone;

import java.util.Calendar;
import java.util.TimeZone;

/*
 * Calendar 클래스의 오버로딩된 다른 getInstance() 메소드를 이용하면 미국/ 로스엔젤레스 와 같은
 * 다른 시간대의 Calendar를 얻을 수 있다. 알고싶은 시간대의 TimeZone 객체를 얻어 
 * getInstance() 메소드의 매개값으로 넘겨주면 된다.
 * 
 * TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
 * Calendar now = Calendar.getInstance(timeZone);
 * 
 * America/LosAngeles와 같은 시간대 ID는 TimeZone.getAvailableIDs() 메소드가 리턴하는
 * 값 중 하나를 사용하면 된다. 다음 예제는 TimeZone.getAvailableIDs() 메소드가 리턴하는 시간대 ID를 모두 출력한다.
 */


public class LosAngelesExample {

	public static void main(String[] args) {
		
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		//타임존 클래스로 원하는 지역을 가져옴
		Calendar now = Calendar.getInstance(timeZone);//대입
		
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
		
		System.out.print(strAmPm+" ");
		System.out.print(hour+"시간");
		System.out.print(minute+" 분");
		System.out.println(second+" 초");
		
		//시간대 ID	
		
		printTimeZoneID();

	}
	
	public static void printTimeZoneID() {
		//TimeZone 아이디 얻어오기
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
		
	}

}
