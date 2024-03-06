package ch12.Object.hashCode;

public class HashCodeExample {

	public static void main(String[] args) {
		
		Student st1 = new Student(1,"허윤");
		Student st2 = new Student(1,"허윤");
		
		if(st1.hashCode()==st2.hashCode()) {
			
			if(st1.equals(st2)) {
				System.out.println("동등객체 입니다");
			}
			else {
				System.out.println("데이터가 다름");
			}
			
		}
		else {
			System.out.println("해시 코드가 다릅니다");
		}
		
		
		

	}

}
