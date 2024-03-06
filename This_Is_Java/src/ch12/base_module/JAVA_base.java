package ch12.base_module;
public class JAVA_base {

	/*
	 * <java.base 모듈>
	 * java.base는 모든 모듈이 의존하는 기본 모듈로, 모듈 중 유일하게 requires 하지 않아도 사용할수 있다.
	 * 이 모듈에 포함되어 있는 패키지는 대부분의 자바 프로그램에서 많이 사용하는 것들이다.
	 *  다음은 java.base 모듈에
	 * 표함된 주요 패키지와 용도를 설명한 표이다.
	 * 
	 *  [패키지]		[용도]
	 *  java.lang	자바 언어의 기본 클래스를 제공
	 *  java.util	자료 구조와 관련된 컬랙션 클래스를 제공
	 *  java.text 	날짜 및 숫자를 원하는 형태의 문자열로 만들어 주는 포맷 클래스를 제공
	 *  java.time 	날짜 및 시간을 조작하거나 연산하는 클래스를 제공
	 *  java.io		입출력 스트림 클래스를 제공
	 *  java.net 	네트워크 통신과 관련된 클래스를 제공
	 *  java.nio	데이터 저장을 위한 Buffer 및 새로운 입출력 클래스 제공
	 *  
	 *  우리가 지금까지 사용한 String, System, Integer, Double, Exception,
	 *  RuntimeException 등의 클래스는
	 *  java.lang 패키지에 있고, 키보드 입력을 위해 사용한 Scanner는 java.util 패키지에 있다
	 *  
	 *  java.lang은 자바 언어의 기본적인 클래스를 담고 있는 패키지로, 이 패키지에 있는 클래스와 인터페이스는
	 *  import 없이
	 *  사용할 수 있다. 다음은 java.lang 패키지에 포함된 주요 클래스와 용도를 설명한 표이다
	 *  
	 *  <클래스>		<용도>
	 *  Objet		자바 클래스의 최상위 클래스로 사용
	 *  
	 *  			키보드로부터 데이터를 입력받을들 때 사용
	 *  			모니터(콘솔)로 출려하기 위해 사용
	 *  System		프로세스를 종료 시킬때 사용
	 *  			진행 시간을 읽을때 사용
	 *  			시스템 속성을 읽을때 사용 
	 *
	 * 
	 * 			String						문자열을 저장하고 조작할 때 사용	
	 * 문자열관련	StirngBuilder				효율적인 문자열 조작 기능이 필요할 때 사용 
	 * 			java.util.StringTokenizer 	구분자로 연결된 문자열을 분리할 때 사용
	 * 
	 * 			Byte, Short,Character,		기본 타입의 값을 포장할때 사용
	 * 포장관련	Integer,Float,Double,
	 * 			Boolean  					문자열을 기본 타입으로 변환할 때 사용
	 * 
	 * Math		수학 계산이 필요할때 사용
	 * 
	 * Class	클래스의 메타 정보 등을 조사할때 사용
	 * 
	 */
	
	
}
