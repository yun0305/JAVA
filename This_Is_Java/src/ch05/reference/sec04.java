package ch05.reference;

public class sec04 {

	public static void main(String[] args) {
		//NullPointerException
		int[] intArray = null;//null은 0이 아니라 객체를 참조하지 않겠다는 뜻이다
		
		try {
			
		intArray[0] = 10;
		//배열에 객체를 만들어주지 않고 객체를 불러오면 java.lang.NullPointerException오류가 발생한다
		String str = null;
		System.out.println("총 문자 수: "+str.length());
		
		
		
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			
		}finally {
			
			
		}
		
		System.out.println("종료");
		
	}
}