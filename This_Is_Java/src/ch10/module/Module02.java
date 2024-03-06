package ch10.module;

public class Module02 {

	/*<모듈 사용법>
	 * my_application_2라는 프로젝트를 만드는데 개발양이 많아서 
	 * A,B 모듈로 쪼개서 따로 개발한다 개발이 끝나고 최종적으로 모듈을 결합해서 완성시킨다.
	 * 
	 * 그리고 A모듈을 또 나눠서 여러개의 모듈로 개발할수 있다 이런과정에서 의존성이 생기고
	 * 은닉 시켜야하거는 패키지는 은닉시킬수 있다 이게 모듈의 장점이다.
	 * 
	 * 이제 이 과정을 실습할거다.
	 * 
	 * <모듈생성>
	 * 모듈은 프로젝트를 만들때 설정할수 있다. my_module_a라는 프로젝트를
	 * 만든다(이 프로젝트는 모듈로 만들려고 생성하는 프로젝트이다).
	 * 만들때 Mobule 이라는 체크 박스를 선택해 주어야 한다.이 체크박스 밑에 모듈 기술자를
	 * 생성한다는 설명이 있다. 생성하고 나면 모듈 기술자가 나올것이다.
	 * 
	 * 이제 모듈 안에 pack1이랑 pack2를 패키지를 만들어주고  메소드도 A,B를 만들어준다.
	 * 
	 * 이번엔 은닉과 공개를 시켜볼거다.
	 * 
	 * my_module_a에 들어간다. 모듈 기술자에 들어간다. 다음과 같이 작성한다
	 * exports pack1; (export : 공개하겠다)
	 * exports 를 안해주면 은닉된다.
	 * 
	 * 
	 * my_module_b도 만들어 준다.
	 * pack1 과 pack2를 만들어주고 
	 * 
	 * 메소드 C,D를 만들어준다 그리고 모듈 기술자에 공개하고 싶은 패키지를 설정해 준다.
	 * 
	 * 그리고 응용프로그램으로 쓸 모듈을 하나 만들어 준다 이름은 my_application_2이다.
	 * 모듈을 이용하는 응용프로그램 또한 모듈이기 때문에 모듈로 설정해줘야 한다.
	 * 응용 프로그램안에 모듈 기술자에 의존성을 기술해 주어야 하기 떄문에 최종 프로젝트라고 하더라도
	 * 모듈 기술자가 필요한 이유다.
	 * 
	 * 이제 의존성을 my_application_2의 모듈 기술자에 작성해 줄거다.
	 * 
	 * requires(~가 필요하다.) 키워드에 작성해준다.
	 * <문법 연습>
	 * requires,requires,requires
	 * 
	 * requires my_module_a;
	 * requires my_module_b; 이 두개의 모듈이 있어야 사용할수 있다는 의존성이 있다는 뜻이다.
	 * 
	 * 하지만 아직 Bulid Path에 my_module_a, my_module_b 넣어주지 않아서  오류가 날것이다.
	 * 
	 * 넣어주자
	 * 
	 * my_application_2 Bulid Path에 들어가서 현재 my_application_2의 물리적 형태가
	 * 아직 jar가 아니라 프로젝트이기 때문에 라이브러리가 아니라 프로젝트 path에 넣어줘야한다.
	 * 프로젝트를 눌러보면 모듈path와 클래스path가 있다. 모듈이니까 모듈에 넣어준다.
	 * 
	 *  my_module_a, my_module_b를 넣어준다
	 *  
	 *  이제 my_application_2가 my_module_a, my_module_b 위치를 참조 받아서 사용할수 있다.
	 * 
	 * 
	 */

}