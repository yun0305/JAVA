package ch06._final;

public class Person_Exampla {

	public static void main(String[] args) {
		Person p1 = new Person("010305-5543444","허윤");
		System.out.println("이름 : "+p1.name);
		System.out.println("국적 : "+p1.nation);
		System.out.println("주민등록 번호 : "+p1.ssn);
		//p1.nation = "북한"; final 필드를 바꿔주려하면 컴파일 오류 발생
		//p1.ssn = "010305-2203514"; 
		p1.name = "허륜";		
	}

}
