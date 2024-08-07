package ch12.Wrapper;

/*
 * <문자열을 기본 타입 값으로 변환>
 * 포장 클래스는 문자열을 기본 타입 값으로 변환할 떄도 사용된다. 대부분의 포장 클래스에는 'parse+기본타입' 명으로
 * 되어있는 정적 메소드가 있다. 이 메소도는 문자열을 해당 기본 타입 값으로 변환한다.
 * 
 * <포장 값 비교>
 * 포장 객체는 내부 값을 비교하기 위해 == 와 != 연산자를 사용할 수 없다. 이 연산은 내부의 값을 비교하는 것이
 * 아니라 포장 객체의 번지를 비교하기 때문이다. 예를 들어 다음 두 Integer 객체는 300 이라는 동일한 값을 갖고
 * 있지만 == 연산의 결과는 false가 나온다.
 * 
 * Integer obj1 = 330;
 * Integer obj2 = 330;
 * System.out.println(obj1 == obj2);
 * 
 * 예외도 있다 포장 객체의 효율적 사용을 위해 다음 범위의 값을 갖는 포장 객체는 공유된다. 이 범위의 값을 갖는 포장
 * 객체는 ==와 != 연산자로 비교할 수 있지만, 내부 값을 비교하는 것이 아니라 객체 번지를 비교한다는 것을 알아야 한다.
 * 
 * 타입				값의 범위
 * boolean			true, false
 * char				\u0000 ~ \u007f
 * byte,short,int	-128 ~ 127
 * 
 * 포장 객체에 정확히 어떤 값이 저장될 지 모르는 상황이라면 ==과 !=은 사용하지 않는 것이 좋다.
 * 대신 equals() 메소들 내부 값을 비교할 수 있다. 포장 클래스의 equals() 메소드는 내부의 값을 비교하도록 재정의
 * 되어 있다.
 * 
 * 값을 비교할떈 == 보단 Integer의 equals를 사용하자
 */

public class ValueCompareExample {

	public static void main(String[] args) {
		
		//-128 ~ 127 초과값일 경우
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		 
		
		//-128 ~ 127 범위값일 경우
		Integer obj3 = 100;
		Integer obj4 = 100;
		System.out.println(obj3 == obj4);
		System.out.println(obj3.equals(obj4));
		

	}

}
