package ch05.array;

public class sec13 {

	public static void main(String[] args) {
		//int[] num = {1,2,3,4};
		int[] scores;//그리고 괄호 데이터 타입 앞에 붙여주는거 습관 드릴것
		//배열 변수에 배열을 대입
		scores = new int[]{83,90,87};
		//배열 항목에 총합을 구하고 출력
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			sum += scores[i];
		}
		System.out.println("총합 : "+sum);

		printitem(new int[]{83,90,97});//메소드 파라미터가 배열이면 메소드의 인덱스로 객체를 생성해줘서 값을 넣어줘야 한다
		
	}
	
	public static void printitem(int[] scores) {
		for(int i=0;i<scores.length;i++) {
			System.out.println("scores["+i+"] = "+scores[i]);
		}
		
	}		
}


