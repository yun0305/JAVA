package ch06.method;

public class Overroding1 {
	//메소드 오버로딩
		/*
		 *  조건
		 *  리턴 타입은 상관 없고, 정적 유무, 접근제한자도 상관없다.
		 *  이름만 같으면 되고 매개변수의 타입 순서 개수도 달라한다 
		 *  오버로딩이 필요한 이유는 다양한 매개값을 받아서 처리해야 할때 유용하기 때문이다
		 *  
		 *  jvm은 매개값을 보고 구별한다. 그다음 자동 타입 변환이 가능한지 확인한다.  (*책 231페이지*)
		 */
	
		public static double areaRectangle(double width) {
			return width * width;
		}
		
		double areaRectangle(double width,double height) {
			return width*height;
		}
		
		 int areaRectangle(int a, int b,int c) {
			 return a*b*c;
		 }
}
