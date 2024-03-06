package ch10.module;

public class Collection {

	
	/*<집합 모듈>
	 * 
	 * 집합 모듈은 여러 모듈을 모아놓은 모듈을 말한다. 자주 사용되는 모듈들을 일일이 requires하는
	 * 번거로움을 피하고 싶을때 집합 모듈을 생성하면 편리하다. 집합 모듈은 자체적인 패키지를 가지지 않고, 모듈 기술자만 존재하고
	 * 모듈 기술자에 전이 의존 설정만한다.
	 * 
	 * 예를 들어 my_module은 my_module_a와 my_module_b를 제공하는 집합 모듈이라고 가정해보자.
	 * my_module 의 모듈 기술자는 다음과 같이 작성할수 있다.
	 * 
	 *  my_module {
	 *   
	 *   requires transitive my_module_a;
	 *   requires transitive my_module_b;
	 *   
	 *  }
	 *  
	 *  이때 다른 프로젝트에서 my_module만 requires하게 되면 my_module_a 와 my_module_b 모듈 둘다 사용할수 있게 된다.
	 *  (하지만 빌드 패스는 my_module 만 해주는 것이 아니라 my_module_a와 my_module_b 도 같이 해줘야 한다.)
	 *  
	 *  1.my_module 이라는 이름의 프로젝트를 만들어 준다(집합모듈)
	 *  
	 *  2.my_module 모듈 기술자에 자주 쓰이는 모듈인 my_module_a와 my_module_b를 전이 의존 시켜준다.
	 *  
	 *  3.my_application_2 는 이전 실습에서 my_module_a와 my_module_b를 의존 시켜놨는데 이번실습에서
	 *   집합 모듈을 사용하기 위해 집합 모듈만 requires 시켜줄거다
	 *   
	 *  4.주의 my_module은 my_module_a와 my_module_b 가 필요하기 때문에 requires transitive 해주고 빌드 패스로
	 *    my_module_a와 my_module_b를 가져온다.
	 *    그리고 집합 모듈이 필요한 프로젝트에서(my_application_2) my_module 를 requires 시켜주고
	 *    빌드 패스로 my_module 를 설정해준다 하지만 my_module은 my_module_a와 my_module_b를 의존하기 때문에
	 *     my_application_2 에서  my_module_a와 my_module_b를 사용하기 위해
	 *    my_module_a와 my_module_b를 빌드 패스 시켜줘야 한다.
	 *    
	 *    <추가>
	 *    1. 집합 모듈로 전의 의존을 시킬경우에도, 예시로 my_module 이 집합모듈이고 내부에 자주 쓰이는 모듈 a 와 모듈 b가 있다
	 *    이 모듈 a,b를  my_module에 전의 의존시켜놓고 다른 프로젝트에서 my_module를 사용해도 reqires만 안써줄 뿐 
	 *    빌드 패스는 시켜줘야 한다.
	 *  	 
	 * 
	 * 
	 * 
	 */
	
	
}
