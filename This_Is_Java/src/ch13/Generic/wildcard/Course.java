package ch13.Generic.wildcard;

public class Course {

	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+"이 Course1을 등록함");
		
	}
	
	public static Applicant<? extends Student> test(){
		return new Applicant<Student>(new Student());
	}
	
	//학생만 등록 가능
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+"이 Course2을 등록함");
	}
	
	//직장인 및 일반인만 등록 가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+"이 Course3을 등록함");
	}
	
}
