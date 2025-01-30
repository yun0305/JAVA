package ch05.reference;

public class sec03 {
	
	static int b;//필드는 초기값을 지정해주지 않아도 기본값이 있기때문에 기본값이 들어감
	int c;
	public static void main(String[] args) {
		
		int a;
		//System.out.println(a); 지역변수는 초기값이 없기때문에 초기화가 필수다
		System.out.println(b);
		System.out.println(new sec03().c);
		//주소
		int[] arr1;//배열 변수 선언
		int[] arr2;//배열 변수 선언
		int[] arr3;//배열 변수 선언
		
		arr1 = new int[] {1,2,3};//배열 객체를 생성하고 {1,2,3} 대입
		arr2 = new int[] {1,2,3};//배열 객체를 생성하고 {1,2,3} 대입
		arr3 = arr2;// 열변수 arr2배열 를 arr3에 대입
		System.out.println(arr1==arr2);//다르다 왜냐면 주소만 나타내 주니까 값은 같지만 주소는 다르다
		System.out.println(arr2==arr3);
		
		
	}

}
