package ch12.Object.equals;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member obj1 = new Member("bule");
		Member obj2 = new Member("bule");
		String str = "나";
		
		/*
		 * 기본적으로 equals가 가지고 있는 기능은 == 과 같다 동등비교를 할려면 재정의 해줘야 한다.
		 * 구체적은 클래스에서 어떤 데이터가 같아야 같은 동등한 클래스다 라는걸 재정의할 필요가있다.
		 * 
		 * String도 equals 가 재정의 되어있다. 문자열만 같다면 동등 객체라는 것이 재정의가 되어있다.
		 * 
		 */
		
		System.out.println(obj1 == obj2);//flase 
		System.out.println(obj1.equals(obj2));//true
		
		/*
		 * obj1과 obj2는 Member 클래스의 객체인데 Member 클래스는 equals() 라는 메소드를 가지고
		 * 있지 않다 그런데 사용할수 있는 이유는 기본적으로 extends Object 를 받고 있기 때문이다
		 * 생략되어 우리눈에 보이지 않을뿐 가지고 있다.
		 * 
		 */
		
	}

}
