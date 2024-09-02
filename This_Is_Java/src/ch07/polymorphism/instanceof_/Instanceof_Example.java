package ch07.polymorphism.instanceof_;

public class Instanceof_Example {

	public static void personInfo(Person person) {
		System.out.println("name: "+person.name);
		person.walk();
	
	//person이 참조하고 있는 객체가 Student가 맞는지 확인
		
		if(person instanceof Student student) {
			//Student 객체일 경우 강제 타입 변환(다운 캐스팅)
			//Student student = (Student)person;
			//Student 객체만 가지고 있는 필드 및 메소드 사용
			System.out.println("studentNo: " + student.studentNo);
			//타입을 다운캐스팅 하는 이유는 오버라이딩이 되지 않은 자식의 고유 메소드를 사용하고 싶어서이다
			student.study();
		}
		
	}
	public static void main(String[] args) {
		//Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
		Person p1 = new Person("홍길동");
		
		personInfo(p1);
		System.out.println();
		
		//student 객체를 매개값으로 제공하고 personInfo 메소드 호출
		Person p2 = new Student("김길동",10);
		
		personInfo(p2);
		
		
	}
}