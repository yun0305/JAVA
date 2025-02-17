package ch12.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
	@interface MyAnnotation {
	    String value();
	}
@MyAnnotation("Example Class")
class MyClass {}

public class Reflection {

	/*
	 * <자바 리플렉션>
	 * 		실행시간(Runtime)에 클래스 메소드 필드 등의 정보를 조회하고 수정할 수 있는 기능
	 * 		컴파일 타임이 아니라 실행 중에 동적으로 클래스의 구조를 분석하고
	 * 		조작할 수 있다
	 * 
	 * <리플렉션 주요기능>
	 * 		자바 리플랙션을 사용하면 다음과 같은 작업이 가능하다.
		
	 * 		1.클래스 정보 조회		
	 * 			클래스 이름, 패키지 정보 가져오기
	 * 			Class.forName("mypackage.MyClass");
	 * 
	 * 		2.생성자 정보
	 * 			특정 생성자를 찾고, 동적으로 객체 생성
	 * 			clazz.getConstructor().newInstance();
	 * 
	 *  	3.필드(멤버 변수)조회 및 수정
	 *  		private 필드 포함 모든 필드 접근
	 *  		field.setAccessible(true);
	 *  		field.set(obj,"value")
	 *  
	 *  	4.메소드 조회 및 실행
	 *  		private,public 메소드 조회및 실행가능
	 *  		method.invoke(obj,args);
	 *  
	 *  	5.어노테이션 조회
	 *  		클래스, 필드, 메소드 등에 붙은 어노테이션 정보 가져오기
	 *  		clazz.getAnnotation(MyAnnotation.class);
	 * 		
	 * 	1.<클래스 정보를 얻는 3가지 방법>
	 * 		1. Class<?> clazz = Class.forName(패키지.MyClass.class);
	 * 
	 * 		2. Class<?> clazz = Myclass.class;
	 * 
	 * 		3. MyClass obj = new MyClass();
	 * 		   Class<?> clazz = obj.getClass();
	 * 
	 * 		Class.forName("패키지.클래스명");은 동적 로딩 가능 주로 프레임워크에서 사용
	 * 	  	클래스 정보를 사용하면 생성자, 메소드, 필수 등 조회 가능
	 * 	
	 *  2.생성자 정보 조회 및 동적 객체 생성
	 *  	생성자 조회
	 */
	
		static class ReflectionConstructor {
			
			public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
				Class clazz = Class.forName("ch12.reflection.Car");
				
				//모든 생성자 조회
				Constructor<?>[] constructors = clazz.getConstructors();
				for(Constructor<?> get : constructors) {
					
					System.out.println("생성자 : "+get);
					
				}
				
				//리플렉션으로 가져온 객체 생성
				Object obj = clazz.getDeclaredConstructor().newInstance();
				Object obj2 = clazz.getDeclaredConstructor(String.class,int.class).newInstance("밴츠",1);
				System.out.println("객체 생성 성공" + obj);
				System.out.println("객체 생성 성공" + obj2);
			}
		}
		/*
		 * 리플랙션을 이용해서 생성자 정보를 가져오고, newInstance() 를 호출하려 객체 생성가능
		 */
		
		//3.필드(멤버 변수) 조회 및 수정
		static class ReflectionField{
			
			public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
				Class<?> clazz = Class.forName("ch12.reflection.Car");
				Object obj = clazz.getDeclaredConstructor(String.class,int.class).newInstance("벤츠",12360);
				
				//모든 필드 조회
				Field[] field = clazz.getDeclaredFields(); 
				for(Field get : field) {
					System.out.println("필드 : "+get);
				}
				
				//private 필드 접근 및 값 설정  
				Field privatefield = clazz.getDeclaredField("model");
				privatefield.setAccessible(true);
				privatefield.set(obj, "new set");
				System.out.println("변경된 값 : " + privatefield.get(obj));
				
			}
		}
		//getDeclearedFields()를 사용하면 private 필드도  포함하여 모든 필드 조회 가능
		//setAccessible(true)를 사용하면 private 필드에도 접근 가능
		
		
		//4.메소드 조회 및 동적 호출
		//메소드 정보 조회 및 실행
		static class ReflectionMethod{
			
			public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
				
				Class<?> clazz = Car.class;
				Object obj = clazz.getDeclaredConstructor(String.class,int.class).newInstance("벤츠" ,1);
				
				//모든 메소드 조회
				Method[] methods = clazz.getMethods();
				for(Method get : methods) {
					System.out.println("메소드 : "+get);
				}
				
				Method method = clazz.getDeclaredMethod("getOwner");
				method = clazz.getDeclaredMethod("getModel");
				System.out.println(method.invoke(obj));
			}
		}
		//getDeclaredMethods()를 사용하면 private 메서드 포함 모든 메서드 조회 가능
		//invoke(obj, args...)를 사용하면 특정 객체에서 메서드를 실행 가능
		
		//5.어노테이션 조회 
		//클래스에 선언된 어노테이션 가져오기
		static class ReflectionAnnotation{
			
			public static void main(String[] args) {
				Class<?> clazz = MyClass.class;
				
				//클래스에 선언된 어노테이션 가져오기
				MyAnnotation annotation = clazz.getAnnotation(MyAnnotation.class);
				if (annotation != null) {
		            System.out.println("어노테이션 값: " + annotation.value());
		        }
			}
			
		}
		
//		✔ @Retention(RetentionPolicy.RUNTIME)을 사용하면 리플렉션을 통해 어노테이션 정보 조회 가능
//		✔ Spring, JPA 등 프레임워크에서 동적으로 어노테이션을 읽어 설정을 적용할 때 사용
//		
		public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
				//생성자
			//Reflection.ReflectionConstructor.main(args);
				//필드
			//Reflection.ReflectionField.main(args);
				//메소드
			//Reflection.ReflectionMethod.main(args);
				//어노테이션
			Reflection.ReflectionAnnotation.main(args);
			
		}
		
		
	
}
