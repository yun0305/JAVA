package ch07.class_extends.Dynamic_Binding.Static_Binding;



/*
 * <정적 바인딩>
 * 		원시 프로그램의 컴파일링 또는 링크 시에 확정되는 바인딩을 정적 바인딩이라고 한다
 * 		실행 이전에 값이 확정되면 정적 바인딩 이다
 * 		
 * 		static, private, final method 해당 - override 불가능하여, compile 시점에 타입이 결정된다.

 		정적 바인딩 컴파일 할때 발생
 		
 		Compile-time 시점에 결정(소스 코드를 바이트코드로 변환하는 과정)
 		
 			소스 코드(java 코드)를 바이트코드 로 변환하는 과정에서 
 			즉 코드가 컴파일러에 의해 해석되고 문법적으로 문제가 없는지 확인되는 시점
 			
 		Compile-time 에서는 문법 검사가 이루어짐 코드가 올바른지 확인한다
 			ex)변수 선언, 타입 검사, 메소드 호출 가능 여부 등
 			
 			정적바인딩: 호출할 메소드나 필드가 참조 변수의 타입만으로 결정될 수 있는 경우
 			ex)정적 메소드, 오버로딩, private 메소드
 * 
 * 	
 */
class Human{
	   public static void walk() {
	       System.out.println("Human walks");
	   }
	}

class Boy extends Human{
	   public static void walk(){
	       System.out.println("Boy walks");
	   }


public class Main {
	
	public static void main( String args[]) {
	       
	       Human obj = new Boy();
	       
	       
	       Human obj2 = new Human();
	       
	       obj.walk();
	       obj2.walk();
	   }
	
	}
}
