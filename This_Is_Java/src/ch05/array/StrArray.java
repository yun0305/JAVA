package ch05.array;

public class StrArray {
	
	public static void main(String[] args) {
	
//		//1.<선언>
//		String[] subject = new String[6];
//		//0~5
//	
//		
//		
//		//2.<데이터 리스트>
//		String[] favorite = new String[] {"햄버거","치킨","고기","toffj"};
//		//0~2
//		
//		//출력
//		
//		//데이터 타입 변수이름 = 값;
//		
//		for(int i =0;i<favorite.length;i++) {
//			System.out.println(favorite[i]);
//		}
//		
//		//포이치
//		
////		for(데이터타입  새로담을변수이름  : 뽑을 배열) {
////			
////			System.out.println(새로담을변수이름);
////		}
//		
//		for(String a : favorite) {
//			System.out.println(a);
//		}
		
		String[][] A = new String[][]{{"1","2","3","4"} ,{"1","2","3","4"},{"1","2","3","4"}};
				
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[i].length;j++) {
				System.out.println(A[i][j]);
			}
		}
		

		
		
		
		
		
		
	}

}
