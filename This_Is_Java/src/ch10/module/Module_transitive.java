package ch10.module;

public class Module_transitive {

	/*
	 * <전이 의존>
	 * 
	 * my_application_2 모듈과 my_module_b 모듈의 의존 관계는 다음과 같이 표현할 수 있다.
	 *--------------------------------- 
	 * 					 -> my_module_a
	 * 					|	
	 * my_application_2			
	 *					|
	 *					 -> my_module_b
	 * ---------------------------------				
	 * 위와같이 my_application_2는 직접적으로 두개의 모듈을 requires하고 있다.
	 * 
	 * 다음과 같이 의존 관계를 변경한다고 가정해 보자.
	 * 
	 *--------------------------------- 
	 * 					 
	 * 						
	 * my_application_2	 -> my_module_a	-> my_module_b	
	 *					
	 *					
	 * --------------------------------- 
	 * 	my_application_2는 mymodule_a에 의존하고, my_module_a는 my_module_b에 의존한다. 따라서 my_application_2와
	 * 	my_module_a의 모듈 기술자는 다음과 같이 작성할 수 있을 것이다.
	 * 
	 * 	module my_application_2 {
	 * 		requires my_module_a;  //my_application_2 모듈은 module_a가 필요하다.
	 * }
	 * 
	 * 	module my_module_a{
	 * 		export pack1;	//pack1 패키지만 공개 하겠다
	 * 		requires my_module_b; // my_module_a는 my_module_b 가 필요하다.
	 * }
	 * 
	 * 이렇게 작성라면 my_application_2의 Main 클래스는 my_module_b 모듈을 사용할수 없다.
	 * my_application_2 는 my_module_b를 requires 하지 않았기 때문이다
	 * my_application_2 의 Main 클래스에서 my_module_b를 지우면 되겠지만
	 * 제거 할수 없는 경우도 있다. 
	 * 
	 * 다음과 같이 my_module_a 소속의 A클래스가 my_module_b 소속의 C 타입 객체를 리턴하는 경우다.
	 * `Collection로 이동
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
}
