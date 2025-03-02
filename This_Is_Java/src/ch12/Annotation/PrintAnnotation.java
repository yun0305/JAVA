package ch12.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * <어노테이션>
 * 코드에서 @으로 작성되는 요소를 어노테이션이라고 한다.
 * 어노테이션은 클래스 또는 인터페이스를 컴파일 하거나
 * 실행할 때 어떻게 처리해야 할 것인지를 알려주는 설정 정보이다.
 * 어노테이션은 다음 세 가지 용도로 사용된다
 * 
 * 1. 컴파일 시 사용하는 정보 전달
 * 2. 빌드 툴이 코드를 자동으로 생성할 때 사용하는 정보 전달
 * 3. 실행 시 특정 기능을 처리할 때 사용하는 정보 전달
 * 
 * 컴파일 시 사용하는 정보 전달의 대표적인 예는 @Override 어노테이션이다.
 * @Override는 컴파일러가 메소드
 * 재정의 검사를 하도록 설정한다. 정확히는 재정의가되지 않았다면 컴파일러는 에러를 발생 시킨다.
 * 
 * 어노테이션은 자바 프로그램을 개발할 때 필수 요소가 되었다.
 * 웹 개발에 많이 사용되는 Spring 프레임워크 또는 Spring Boot는
 * 다양한 종류의 어노테이션을 사용해서 웹 애플리케이션을 설정하는 데 사용된다. 따라서
 * 자바 개발자라면 어노테이션의 사용 방법을 반드시 알아야 한다.
 * 
 * <어노테이션 타입 정의와 적용>
 * 어노테이션도 하나의 타입이므로 어노테이션을 사용하기 위해서는 먼저 정의부터 해야한다.
 * 어노테이션을
 * 정의하는 방법은 인터페이스를 정의하는 것과 유사하다.
 * @interface 뒤에 사용할 어노테이션 이름이 온다.
 * 
 * ex)
 * public @interface Annotation{
 * 
 * }
 * 
 * 이렇게 정의한 어노테이션은 코드에서 다음과 같이 사용된다
 * ex)
 * @Annotation
 * 
 * 어노테이션은 속성을 가질 수 있다. 속성은 타입과 이름으로 구성되며, 이름 뒤에 괄로를 붙인다. 
 * 속성의 기본값은 default 키워드로
 * 지정할 수 있다. 예를 들어 String 타입의 prop1과 int 타입의 prop2 속성은 다음과 같이 선언할 수 있다.
 * 
 * ex)
 * public @interface AnnotationName{
 * 	String peop1();
 * 	int prop default 1;
 * }
 * 
 * 이렇게 정의한 어노테이션은 코드에서 다음과 같이 사용할 수 있다. prop1은 기본값이 없기 때문에
 * 반드시 값을 기술해야 하고, prop2는 기본값이 있기 떄문에 생략 가능하다.
 * 
 * ex)
 * @AnnotationName(prop1 = "값"); //prop2 생략가능
 * @AnnotationName(prop1 = "값", prop2 = 3);
 * 
 * 어노테이션은 기본 속성인 Value를 다음과 같이 가질 수 있다.
 * 
 * ex)
 * public @interface AnnotationName{
 * 	String value();// value() 속성값의 이름은 예약어다.
 * 	int prop2() default 1;
 *
 * }
 * 
 * Value 속성을 가진 어노테이션을 코드에서 사용할 때에는 다음과 같이 값만 기술할 수 있다.
 * 이 값은 Value 속성에 자동으로 대입된다.
 * 
 * ex)
 * @AnnotationName("값");// 값만 넣을 경우 value(); 속성에 들어간다
 * 
 * 하지만 value() 속성과 다른 속성의 값을 동시에 주고 싶다면 value() 이름을 반드시 언급해야 한다.
 * 
 * ex)
 * @AnnotationName(vlaue = "값",prop2 = 3);
 * 
 * 
 */

/*<어노테이션 적용 대상>
 * 자바에서 어노테이션은 설정 정보라고 했다, 그렇다면 어떤 대상에 설정 정보를 적용할 것인지,
 * 즉 클래스에 적용할 것인지,
 * 메소드에 적용할 것인지 명시해야 한다,
 * 적용할 수 있는 대상의 종류는 ElementType 열거 상수로 정의되어 있다.
 * 
 * ElementType 열거 상수			적용 요소
 * 
 * TYPE							클래스, 인터페이스 열거 타입
 * ANNTATION,TYPE				어노테이션
 * FILED						필드
 * CONSTRUCTOR					생성자
 * METHOD						메소드
 * LOCAL_VARIABLE				로컬변수
 * PACKAGE						패키지
 * 
 * 적용 대상을 지정할 때에는 @Target 어노테이션을 사용한다. @Target기본 속성인 value는 ElementType 배열을 값으로 가진다
 * 이것은 적용 대상을 복수 개로 지정하기 위해서이다. 예를 들어 다음과 같이 적용 대상을 지정했다고 가정해보자.
 *
 * ex)
 * @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
 * pbulic @interface AnnotationName{
 * 
 *  }
 *  
 *  이 어노테이션은 다음과 같이 클래스, 필드, 메소드에 적용할 수 있고 생성자는 적용할 수 없다.
 *	
 * 	ex)
 * 	@AnnotationName //TYPE(클래스)에 적용
 * 	public class ClassName{
 * 		
 * 		@AnnotationName // FIELD에 적용
 * 		private String fieldName;
 * 		
 * 		//@AnnotationName // Target에 CONSTRUCTOR가 없으르로 생성자에는 적용 못함 
 * 		public ClassName(){
 * 		}
 * 	
 * 		@AnnotationName // 메소드에 적용
 * 		public void	methodName(){
 * 
 * 		 }
 */

/*<어노테이션 유지 정책>
 * 어노테이션을 정의할 때 한가지 더 추가할 내용은 @AnnotationName을 언제까지 유지할 것인지를 정의하는 것이다.
 * 어노테이션 유지 정책은 RetentionPolicy 열거 상수로 다음과 같이 정의되어 있다.
 * 
 * 		1.SOURCE 
 * 			적용 시점: 컴파일이 끝난 후 제거됨
 * 			
 * 			제거 시점: 컴파일이 끝난 후 제거됨
 * 	
 * 			특징: .class 파일에도 남지 않고 실행 시에도 존재하지 않음
 * 
 * 			예시: @Overrride, @SuppressWarnings
 * 
 * 				이 어노테이션들은 컴파일러가 호가인하는 용도로만 사용되고 실제 .class
 * 				파일에는 포함되지 않음
 * 
 * 		2.CLASS
 * 			적용시점: 컴파일할 때 적용됨
 * 
 * 			제거 시점: 클래스 파일에는 포함되지만 JVM이 클래스를 로딩한 후 제거됨
 * 
 * 			특징: .class 파일에는 남아 있지만, 실행 시(런 타임)에는 접근할 수 없음
 * 
 * 			예시: 기본적으로 커스텀 어노테이션을 만들면 CLASS가 기본 유지 정책임
 * 
 * 
 * 		3.RUNTIME
 * 			적용 시점: 실행할 때 적용됨
 * 
 * 			제거 시점: 계속 유지됨((Reflection API를 이용해 접근 가능)
 * 
 * 			특징: 실행 중에도 어노테이션 정보를 유지하며, Reflection을 통해 조회할 수 있음.
 * 
 * 			예시: @Deprecated, @Test (JUnit), @Entity (Spring, Hibernate)
 * 
 * 
 * 유지 정책을 지정할 때에는 @Retention 어노테이선을 사용한다. @Retention의 기본 속성인 value()는
 * RetentionPolicy 열거 상수 값을 가진다. 다음은 실행 시에도 어노테이션을 설정 정보를 이용할 수 있도록
 * 유지 정책을 RUNTIME으로 지정한 예이다. 
 * 
 * ex)
 * @Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
 * @Retention(RetentionPolicy.RUNTIME)
 * public @interface Annotation{
 * 
 * }
 * 
 */

/*<어노테이션 설정 정보 이용>
 * 어노테이션은 아무런 동작을 가지지 않는 설정 정보일 뿐이다.
 * 이 설정 정보를 이용해서 어떻게 처리할 것인지는 애플리케이션의 몫이다.
 * 애플리케이션은 12.11절에서 학습한 리플랙션을 이용해서
 * 적용 대상으로부터 어노테이션 정보를 다음 메소드로 얻어낼 수 있다.
 * 
 * 리턴타입		메소드명(매개변수)								설명
 * 
 * Boolean 		isAnnotationPersent(AnnotationName.class)	지정한 어노테이션이 적용되었는지 여부	
 * 
 * Annotation	getAnnotation(AnnotationName.class)			지정한 어노테이션이 적용되어 있으면 어노테이션을 리턴하고
 * 															그렇지 않다면 null을 리턴
 * 
 * Annotation[]	getDeclaredAnnotations()					적용된 모든 어노테이션을 리턴
 * 
 * 다음 예제는 적용 대상을 METHOD, 유지 정책을 RUNTIME으로 하고 구분선에 대한 설정 정보를 속성으로 가지고 있는
 * @printAnnotation을 정의한다.
 * 
 */



@Target({ElementType.METHOD})//어노테이션 적용대상을 메소드로 하겠다
@Retention(RetentionPolicy.RUNTIME)//어노테이션 유지정책은 RunTime으로 하겠다
public @interface PrintAnnotation {
	String value() default "-";	//value() 속성 : 선의종류
	int number() default 15; // number() 속성 : 출력 횟수
	/*
	 * 출력하는 기능은 없다.	
	 */
}
