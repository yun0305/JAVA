package ch12.Object.toString;

	/*
	 * Object의 toString() 메소드는 객체의 문자 정보를 리턴한다.
	 * 객체의 문자 정보란 객체를 문자열로 표현한 것을 말한다. 기본적으로 Object의 toString() 메소드는
	 * "클래스명@16진수해시코드" 로 구성된 문자열을 리턴한다.
	 * 
	 * Object obj = new Object();
	 * System.out.println(obj.toString);
	 * 
	 * 결과:
	 * java.lang.Object@de6ced
	 * 
	 * 객체의 문자 정보가 중요한 경우에는 Object의 toString()메소드를 재정의해서 간결하고 유익한 정보를
	 * 리턴하도록 해야 한다. 예를 들어 Date클래스는 현재 날짜와 시간을, String클래스는 저장된 문자열을
	 * 리턴하도록 toString() 메소드를 재정의하고 있다.
	 * 
	 * System.out.println(); 메소드는 매개값이 기본 타입(byte, short, int, long, float, double,
	 * char, boolean); 이거나 문자열일 경우 그대로 출력한다. 만약 매개값이 객체인 경우
	 * 객체의 toString() 메소드를 호출해서 리턴값을 출력한다. 
	 * 
	 */


public class SmartPhone {

	private String companey;
	private String os;
	
	public SmartPhone(String companey, String os) {
		this.companey = companey;
		this.os = os;
	}
	
	@Override
	public String toString() {
		
		return companey+ " " + os ;
		/*
		 * Object 의 toString(); 메소드를 재정의해서 제조사와 운영체제가 결합된 문자열을 리턴함
		 * 
		 */
	}
}
