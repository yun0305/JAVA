package ch05.array;

public class sec16 {

	public static void main(String[] args) {
		//포이치 반복
		int[] scores = new int[] {95,71,84,93,87}; 
		int sum = 0;
		
		for(int score : scores){//scores배열에서 하나씩 데이터를 꺼내와서 score변수에 넣어서 출력한다
			sum += score;		//Iterable 인터페이스를 구현했다면 포이치 사용가능
		}

		System.out.println("총합 = "+sum);
		double avg = (double)sum/scores.length;
		System.out.println("평균 = "+avg);
	}
}
