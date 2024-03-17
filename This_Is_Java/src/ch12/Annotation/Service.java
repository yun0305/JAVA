package ch12.Annotation;

public class Service {

		@PrintAnnotation
		public void method1() {
			System.out.println("실행 내용1");
		}
		
		@PrintAnnotation("*")//value() 속성 값으로 "*"를 줌
		public void method2() {
			System.out.println("실행 내용2");
		}
		
		@PrintAnnotation(value = "#", number = 20)
		public void method3() {
			System.out.println("실행 내용3");
		}
		/*
		 * 실행 클래스인 PrintAnnotationExample에서는 Service 클래스에 선언된
		 * 메소드를 리플렉션해서 @PrintAnnotation 설정 정보를 얻어낸 후, 구분선을 출력하고
		 * 해당 메소드를 호출시킨다.
		 */
}
