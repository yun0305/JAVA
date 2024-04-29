package ch12.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 자바는 컴퓨터의 날짜 및 시각을 읽을수 있도록 java.util 패키지에서 
 * Date와 Calendar 클래스를 제공하고 있다. 또한 날짜와 시간을 조작할 수 있도록
 * java.time 패키지에서 LocalDateTime 등의 클래스를 제공한다.
 * 
 * 클래스				설명
 * Date				날짜 정보를 전달하기 위해 사용
 * Calendar			다양한 시단대별로 날짜와 시간을 얻을 때 사용
 * LocalDateTime	날짜와 시간을 조작할 때 사용
 * 
 * <Date 클래스>
 * Date는 날짜를 표현하는 클래스로 객체간에 날짜 정보를 주고 받을때 사용된다.
 * Date 클래스에는 여러 개의 생성자가 선언되어 있지만 대부분 Deprecated(더이상 사용되지 않음)되어 Date()
 * 생성자만 주로 사용된다. Date 생성자는 컴퓨터의 현재 날짜를 읽어 Date 객체로 만든다.
 * 
 * Date now = new Date();
 * 
 * 현재 날짜를 문자열로 얻고 싶다면 toString() 메소드를 사용할 수 있지만
 * 영문으로 출력되기 때문에 우리가 원하는 형식이 아니다. 원하는 문자열로 얻고 싶다면 
 * SimpleDateFormat 클래스와 함께 사용해야 한다. 다음 예제는 "년 월 일 시 분 초" 형식으로 문자열을 얻는 방법을 보여준다.
 * 
 * SimpleDateFormat() 에 대한 자세한 내용은 12.9절에서 학습하기로 하고 여기서는
 * 현재 날짜와 시간 정보를 가진 Date객체를 만드는 방법만 알아두자
 * 
 * 
 * 
 * 
 */

public class DateExample {

	public static void main(String[] args) {
		
		Date now = new Date();//년 월 일 시 분 초 한번에 나온다 따로 나오게 할 수 없다.
		String strNow1 = now.toString();// now참조 변수 의 toString을 하면  날짜를 문자열로 받아 올수 있다.
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");//데소문자 의미 있음
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		/*
		 * Date 클래스로 현재 날짜와 시간을 얻어오고 참조값을
		 *  SimpleDateFormat 객체의 format() 메소드에 매개값으로 넣어준다.
		 */
		
		
	}

}
