package ch12.DTO.record;

public class RecordExample {

	public static void main(String[] args) {
		
		Member m = new Member("winter","눈송이",25);	
		System.out.println(m.id());//getter 메소드 호출
		System.out.println(m.name());//getter 메소드 호출
		System.out.println(m.age());//getter 메소드 호출
		System.out.println(m.toString());
		
		System.out.println();
		
		Member m1 = new Member("winter","눈송이",25);
		Member m2 = new Member("winter","눈송이",25);
		System.out.println("m1.hashCode()"+ m1.hashCode());
		System.out.println("m2.hashCode()"+ m2.hashCode());
		System.out.println("m1.equals(m2)"+ m1.equals(m2));
		/*recode는 hashCode와 equals,toString을 재정의 해서 사용한다
		 * hashCode는 필드 데이터를 재조합 해서 해쉬 코드를 다시 만든다.
		 * equals도 데이터들이 같을 경우 true를 출력하도록 재정의 되있고
		 * toStinrg도 데이터의 정보를 문자열로 출력하도록 재정의 되어있다.  
		 *
		 *
		 */
		 
	}

}
