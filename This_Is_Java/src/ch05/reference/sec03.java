package ch05.reference;

public class sec03 {

	public static void main(String[] args) {
		int[] arr1;//배열 변수 선언
		int[] arr2;//배열 변수 선언
		int[] arr3;//배열 변수 선언

		arr1 = new int[] {1,2,3};//배열 객체를 생성하고 {1,2,3} 대입
		arr2 = new int[] {1,2,3};//배열 객체를 생성하고 {1,2,3} 대입
		arr3 = arr2;// 열변수 arr2배 를 arr3에 대입
		System.out.println(arr1==arr2);//다르다 왜냐면 주소만 나타내 주니까 값은 같지만 주소는 다르다
		System.out.println(arr2==arr3);
	}

}
