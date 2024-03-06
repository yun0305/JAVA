package ch10.module;

public class Module01 {

	/*
	 * /*
	 * <모듈 설명>
	 * 이번엔 모듈을 배워볼것이다 모듈도 물리적인 형태는 JAR이고 비슷하지만 다른점이 있다.
	 * 라이브러리 보단 모듈이 더 많은 기능을 제공한다.
	 * 
	 * 모듈은 패키지 관리 기능까지 포함된 라이브러리다. 일반 라이브러리는 내부에 포함된 모든 패키지에
	 * 외부 프로그램에서의 접근이 가능하지만, 모듈은 일부 패키지를 은닉하여 접근할 수 없게끔 할 수 있다.
	 * 
	 * 간단하게 라이브러리는 모든 패키지에 접근이 가능하지만 모듈은 패키지를 선택적으로 은닉 시킬수 있다.
	 * 막는 이유는 만약 A라이브러리(모듈) 안에 pack1,pack2,pack3이 있다. 근데 pack3의 존재는
	 * pack1과 pack2의 존재에 의해 사용되는 패키지일 경우 외부에서 접근할 필요도 없고 접근해서도 안된다.
	 * (private와 비슷)보안성을 위함이 있다
	 * 
	 *  <의존관계>
	 *  만약 모듈 A, B, C 가 있다. 내가 모듈 A를 사용하고 싶어서 path설정을 해줬는데
	 *  실행 할수 없다. 왜냐면 A모듈(라이브러리)를 만들때 B모듈이 필수적으로 필요하기 때문이다.
	 *  
	 *  모듈에서는 이런 "의존관계를" 모듈 기술자(module-info.java)에 기술할 수 있다.
	 *  모듈 기술자에는 만약 A모듈을 사용하려면 B모듈이 필요하다. 라는 내용이 들어가 있다.
	 *  
	 *  모듈도 물리적인 파일은 jar이라서 모듈인지 아닌지 아는 방법은 해당 라이브러리 안에 
	 *  module-info.java 가 있으면 라이브러리가 아니라 모듈이다. 
	 *  
	 *  하나의 응용 프로그램을 만들때 프로그램 전체가 너무 커서 응용 프로그램의 기능을 모듈 단위로 쪼개서
	 *  나중에 완성되면 합치는 방식으로 개발한다.
	 *  
	 *  module-info.java 모듈 기술자 뜻이 이 모듈을 사용하기 위해서 reqiers; 를 선언해줌으로서
	 *  reqiers (이런 모듈이 필요하다);
	 *  라는 뜻이다.
	 * 
	 */	
}
	
	

