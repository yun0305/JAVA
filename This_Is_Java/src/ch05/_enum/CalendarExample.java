package ch05._enum;

public class CalendarExample {

	public static void main(String[] args) {
		//name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name();//name() 메소드는 열거형을 문자열에 넣어서 사용할수 있게 만들어준다
		System.out.println(today);
		//ordinal() 메소드
		int ordinal = today.ordinal();//ordinal()메소드는 현재 담긴 열거형이 몇번째 위치인지 나타내준다
		System.out.println(ordinal);
		//compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);//compareT() 괄호 안에 매개를 기준으로 앞으로 몇번 뒤로 몇번 차이가 나는지 알려준다
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		//ValueOf 메소드
		if(args.length == 1){
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);//valueOf() 메소드는 Enum 클래스에서 지정된 문자열과 일치하는 Enum 상수를 반환하는 메소드입니다. 
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이군요");
			}
			else {
				System.out.println("평일이군요");
			}	
		}
		//values() 메소드
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}

	}

}
