package ch12.Object.hashCode;

	/*
	 * 객체 헤시코드란 객체를 식별하는 정수를 말한다. Object의 hashCode는() 메소드는 객체의 메모리 번지를
	 * 이용해서 헤시코드를 생성하기 때문에 객체마다 다른 정수값을 리턴한다. 
	 * hashCode()메소드의 용도는 equals()메소드와 비슷한데 두 객체가 동등한지를 비교할때 주로 사용된다.
	 * 
	 * public int hashCode()
	 * 
	 * equals() 메소드와 마찬가지로 hashCode() 메소드 역시 객체의 데이터를 기준으로 재정의해서
	 * 새로운 정수값을 리턴하도록 하는 것이 일반적이다. 객체가 다르다 할지라도 내부 데이터가 동일하다면
	 * 같은 정수값을 리턴하기 위해서다.
	 * 
	 * 자바는 두 객체가 동등함을 비교할 때 hashCode()와 equals() 메소드를 같이 사용하는 경우가 많다.
	 * 우선 hashCode() 가 리턴하는 정수값이 같은지 확인하고, 그 다음 equals() 메소드가 true를 리턴하는지
	 * 확인해서 동등 객체임을 판단한다.(HashSet, HashMap의 동등 객체를 판단하는 방법은 15.3~4절에서 자세히 설명한다.) 
	 *
	 * 다음 예제는 Student 객체를 동등 비교하기 위해 hashCode()와 equals() 메소드를 재정의했다.
	 * 학생 번호와 이름으로 헤시코드를 생성하고, 학생 번호와 이름이 동일한 경우에만 equals() 가 true를
	 * 리턴하도록 했다.	
	 */

	


public class Student {

	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
		
	}
	
	public int getNumber() {
		return this.no;
	}
	
	public String getName() {
		return this.name;
		
	}
	
	@Override
		public int hashCode() {		
		
		/*
		 * hashCode() 메소드를 재정의해서 새로운 해시 코드를 만들어 줄거다
		 * no 와 name 의 해시코드를 결합해서 새로운 해시코드를 생성하는데 name 문자열의 해시 코드는
		 * 문자열만 같다면 같은 문자열 한정으로 모두 같은
		 *  해시 코드가 나올거다(문자열만 같다면 해시코드는 같은값을 받아옴)<-새로운 문자열 객체가 아니라면>
		 */
		
			int hashCode = no + name.hashCode(); //새로운 해시코드를 만듬
	
			return hashCode;
		}
	
	
	
	@Override
		public boolean equals(Object obj) {
			
		/*
		 * Object의 equals() 메소드를 재정의해서 Student 객체인지 확인하고, 학생 번호와 이름이 같으면
		 * true를 리턴하도록 한다.
		 */
		
			if(obj instanceof Student target) {
				if(target.getNumber() == no && target.getName().equals(name)) {
					
					return true;
				}	
			}
			return false;
		}
	
	
}
