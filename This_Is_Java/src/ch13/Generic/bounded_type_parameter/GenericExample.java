package ch13.Generic.bounded_type_parameter;

	/*
	 * <제한된 타입 파라미터>
	 * *매우중요*
	 * 타입 파라미터는 기본적으로 오브젝트 타입이다
	 * 경우에 따라서는 타입 파라미터를 대체하는 구체적인 타입을 제한할 필요가 있다. 예를 들어 숫자를 연산하는 제네릭 메소드는
	 * 대체 타입으로 Number 또는 자식 클래스(Byte, Short, Integer, Long, Double)로 제한할 필요가 있다.
	 * 
	 * 이처럼 모든 타입으로 대체할 수 없고, 특정 타입과 자식 또는 구현 관계에 있는 타입만 대체할 수 있는
	 * 타입 파라미터를 제한된 타입 파라미터 라고 한다. 정의는 다음과 같이 한다.
	 * 
	 * pubkic <T extends 상위타입> 리턴타입 메소드(메개변수,...){
	 * }
	 * 
	 * 상위 타입은 클래스 뿐만 아니라 인터페이스도 가능하다. 인터페이스라고 해서 implements를 사용하지는 않는다. 다음은
	 * Number 타입과 자식 클래스에만 대체 가능한 타입 파라미터를 정의한 것이다.
	 * 
	 * ex)
	 * public <T extends Number> boolean compare(T t1, T t2){ Number거나 Number를 상속받은 객체만 올수 있다.
	 * 
	 * 	double v1 = t1.doubleValue(); // Number의 doubleValue()메소드 사용
	 * 	double v2 = t1.doubleValue(); // Number의 doubleValue()메소드 사용
	 * 	
	 * 	return (v1==v2); 
	 * }
	 * 
	 * 타입 파라미터가 Number 타입으로 제한되면서 Object의 메소드 뿐만 아니라 Number가 가지고 있는 메소드도 사용할 수 있다.
	 * 위 코드에서 doubleValue()메소드는 Number타입에 정의되어 있는 메소드로, double 타입 값을 리턴한다.
	 * 
	 */

public class GenericExample {
	
	public static <T extends Number> boolean compare(T t1, T t2) {
		
		System.out.println("compare("+t1.getClass().getName()+","+t2.getClass().getName()+")");
		
		double v1 = t1.doubleValue();//사용할수 있는 메소드는 Number의 메소드 뿐 Number의 자식 메소드는 사용할수 없다
		double v2 = t1.doubleValue();//단지 타입 파라미터로 Number이거나 Number의 자식 메소드만 받을수 있는것이다.
		
		return (v1==v2);
		
	}
	
	public static void main(String[] args) {
		
		//제네릭 메소드 호출
		boolean result1 = compare(10,20);
		System.out.println(result1+"\n");
		
		boolean result2 = compare(4.5,4.5);
		System.out.println(result2);
		
	}
}
