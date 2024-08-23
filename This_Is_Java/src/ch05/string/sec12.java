package ch05.string;

public class sec12 {

	public static void main(String[] args) {
		// 문자열 분리
		String board = "1,자바학습,참조 타입 ,타입 String을 학습합니다,홍길동";
		
		
		String[] tokens = board.split(" "); 
		System.out.println(tokens.length);
		
		for(int i=0;i<tokens.length;i++) {
			System.out.println(tokens[i]);
		}
		
		System.out.println();
	
	}
	
}
