package ch06.object;

public class KoreanExample {

	public static void main(String[] args) {
		
		//코리안 객체 생성
		Korean k1 = new Korean("허윤","010305-3253514");
		//코리안 객체 데이터 읽기
		System.out.println("k1.nation "+k1.nation);
		System.out.println("k1.name "+k1.name);
		System.out.println("k1.ssn "+k1.ssn);
		
		Korean k2 = new Korean("김자바","930525-1234567");
		
		System.out.println("k2.nation "+k2.nation);
		System.out.println("k2.name "+k2.name);
		System.out.println("k2.ssn "+k2.ssn);
	
	}

}
