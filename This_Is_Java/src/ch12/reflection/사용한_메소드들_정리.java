package ch12.reflection;

public class 사용한_메소드들_정리 {

	/*
	 * 📌 [1] 클래스 정보 조회 메소드
	 * Class.forName(String className)  → 클래스 이름으로 Class 객체 얻기
	 * 클래스명.class  → 컴파일 타임에 Class 객체 얻기
	 * 객체.getClass()  → 런타임에 객체의 Class 객체 얻기
	 * clazz.getPackage()  → 클래스의 패키지 정보 가져오기
	 * clazz.getSimpleName()  → 클래스의 간단한 이름(패키지 제외)
	 * clazz.getName()  → 클래스의 전체 이름(패키지 포함)
	 *
	 * 예제:
	 * Class<?> clazz = Class.forName("ch12.reflection.Car");
	 * System.out.println("패키지: " + clazz.getPackage().getName());
	 * System.out.println("클래스 이름: " + clazz.getSimpleName());
	 * System.out.println("전체 클래스 이름: " + clazz.getName());
	 */

	/*
	 * 📌 [2] 생성자 정보 조회 및 객체 생성
	 * clazz.getConstructors()  → public 생성자만 조회
	 * clazz.getDeclaredConstructors()  → 모든 생성자(접근 제어자 무관) 조회
	 * clazz.getConstructor(매개변수 타입...)  → 특정 public 생성자 가져오기
	 * clazz.getDeclaredConstructor(매개변수 타입...)  → 특정 생성자(접근 제어자 무관) 가져오기
	 * constructor.newInstance(인자...)  → 리플렉션을 이용한 객체 생성
	 *
	 * 예제:
	 * Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);
	 * Object obj = constructor.newInstance("벤츠", 1);
	 */

	/*
	 * 📌 [3] 필드(멤버 변수) 조회 및 수정
	 * clazz.getFields()  → public 필드 조회
	 * clazz.getDeclaredFields()  → 모든 필드(접근 제어자 무관) 조회
	 * clazz.getField("필드명")  → 특정 public 필드 가져오기
	 * clazz.getDeclaredField("필드명")  → 특정 필드(접근 제어자 무관) 가져오기
	 * field.setAccessible(true)  → private 필드 접근 허용
	 * field.set(객체, 값)  → 필드 값 설정
	 * field.get(객체)  → 필드 값 가져오기
	 *
	 * 예제:
	 * Field privateField = clazz.getDeclaredField("model");
	 * privateField.setAccessible(true);
	 * privateField.set(obj, "BMW");
	 * System.out.println("변경된 값: " + privateField.get(obj));
	 */

	/*
	 * 📌 [4] 메소드 조회 및 실행
	 * clazz.getMethods()  → public 메소드 조회
	 * clazz.getDeclaredMethods()  → 모든 메소드(접근 제어자 무관) 조회
	 * clazz.getMethod("메소드명", 매개변수 타입...)  → 특정 public 메소드 가져오기
	 * clazz.getDeclaredMethod("메소드명", 매개변수 타입...)  → 특정 메소드(접근 제어자 무관) 가져오기
	 * method.invoke(객체, 인자...)  → 메소드 실행
	 *
	 * 예제:
	 * Method method = clazz.getDeclaredMethod("getModel");
	 * Object result = method.invoke(obj);
	 * System.out.println("getModel() 결과: " + result);
	 */

	/*
	 * 📌 [5] 어노테이션 조회
	 * clazz.getAnnotation(Annotation.class)  → 특정 어노테이션 가져오기
	 * clazz.getAnnotations()  → 모든 어노테이션 가져오기
	 *
	 * 예제:
	 * MyAnnotation annotation = clazz.getAnnotation(MyAnnotation.class);
	 * if (annotation != null) {
	 *     System.out.println("어노테이션 값: " + annotation.value());
	 * }
	 */

	/*
	 * 🚀 리플렉션 요약
	 * [1] 클래스 정보 조회: Class.forName(), .class, .getClass()
	 * [2] 생성자 조회 및 객체 생성: getDeclaredConstructor(), newInstance()
	 * [3] 필드 조회 및 수정: getDeclaredFields(), getDeclaredField(), set(), get()
	 * [4] 메소드 조회 및 실행: getDeclaredMethods(), getDeclaredMethod(), invoke()
	 * [5] 어노테이션 조회: getAnnotation(), getAnnotations()
	 *
	 * ✅ 리플렉션은 동적으로 클래스, 필드, 메소드를 제어할 수 있지만, 성능 저하 및 보안 문제를 고려해야 함.
	 */

	
}
