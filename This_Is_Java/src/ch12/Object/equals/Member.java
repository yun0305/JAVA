package ch12.Object.equals;

/*
 * <객체 동등 비교>
 * 
 * Object의 equals() 매소드는 객체의 번지를 비교하고 boolean 값을 리턴한다.
 * 
 * 	public boolean equals(Object obj)
 * 
 * 	equals() 메소드의 매개변수 타입이 Object이므로 자동 타입 변환에 의해
 *  모든 객체가 매개값으로 대입될 수 있다.
 * 	equals() 메소드는 기본적으로 비교 연산자인 == 동일한 결과를 리턴한다.
 *  두 객체가 동일한 객체라면 true를 리턴하고, 그렇지 않으면 false 를 리턴한다.
 *  
 *  Object obj1 = new Object();
 *  Object obj2 = obj1;
 *  boolean result = obj1.equals(obj2); 결과 : true
 *  boolean result = obj1 == obj2; 결과 : true
 * 	
 * 	일반적으로 Object의 equals() 메소드는 재정의해서 동등 비교용으로 사용된다.
 *  동등 비교란 객체가 비록 달라도
 * 	내부의 데이터가 같은지를 비교하는 것을 말한다. 예를 들어 String은
 *  equals() 메소드를 재정의해서 내부 문자열이 같은지를 비교한다.
 *  
 *  다음 예제는 Member 객체의 동등 비교를 위해서 equals() 메소드를 재정의한다. Member 타입이면서 
 *  id 필드값이 같을 경우는 true를 리턴하고 그외의 다른 경우에는 false를 리턴한다,
 * 	
 */


public class Member {
	
	public String id;
	
	public Member(String id) {
		
		this.id = id;
		
	}
	@Override
	public boolean equals(Object obj) {//동등비교를 하기위해 equals()메소드를 재정의함
		
		if(obj instanceof Member target) {//instaceof 로 odj객체가 member 객체로 만든 객체를 받은거라면
										  // Member 객체로 다운캐스팅 해서 target변수에 담는다 
			if(id.equals(target.id)) {// 현재 id와 target 변수가 외부에서 받아온 Member 객체의 id가 같다면
									  // true를 리턴
				return true;
			}
		}
		return false;// 아니면 false
		
	}
	
}
