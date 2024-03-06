package ch10.module;

public class Module03 {

	/*<jar모듈>
	 * my_applictuon_2에서는 모듈을 Build path 시킬때 프로젝트 형태라서 프로젝트로 시켰지만 이번엔
	 *  my_applictuon_3를 만들고 my_module_a,b를 jar파일로 만들어서 사용해 볼것이다.
	 *  
	 *  그리고 jar파일 만들떄 classpath와 porject 파일은 선택 안해줘도 된다 이 두 파일은
	 *  이클립스가 프로젝트인거를 인식하기 위해서 필요한것이기 때문에 필요한 것이라서 바이트 코드만 들어가면 된다
	 *  src만 선택해준다
	 *  
	 *  jar을 압축 풀어보면 패키지의 바이트 코드와 모듈 기술자만 있다.
	 *  
	 *  <최종정리>
	 *  모듈 은 은닉성과 의존성을 표시해줄수 있다 
	 *  exports 공개/선언 안하면 은닉
	 *  requires 의존(~가 필요하다. requires해주고 빌드 패스 해줘라)
	 *  
	 *  my_applictuon_2는 프로젝트로 모듈을 받아서 사용했고
	 *  my_applictuon_3은 jar파일로 받아서 사용했다.
	 *  
	 * 	의존성을 기술하고 Build path로 설정해주자
	 * 
	 * 	오픈소스로 jar을 받았다면 3번처럼
	 * 	내가 만든 프로젝트가 너무 방대해져서 프로젝트를 나눠서 관리 할거면 2번처럼  
	 *  
	 *  
	 *  
	 */
	
}
