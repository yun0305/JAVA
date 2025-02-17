package ch12.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * <멤버 정보 얻기>
 * 타입(클래스. 인터페이스)이 가지고 있는 멤버 정보는 다음 메소드를 통해 얻을 수 있다.
 * 
 * 메소드										용도
 * Constructor[] getDeclaredConstructors()  생성자 정보 읽기
 * Field[] getDeclaredFields()				필드 정보 읽기
 * Method[] getDeclaredMethods()				메소드 정보 읽기	
 * 
 * 메소드 이름에서 알 수 있듯이 각각 Constructor 배열, Field 배열, Method 배열을 리턴한다.
 * Constructor, Field, Method 클래스는 모두 java.lang.reflect 패키지에 있는데 각각 생성자, 필드,
 * 메소드에 대한 선언부 정보를 제공한다. 다음은 Car 클래스에서 선언된 생성자, 필드, 메소드의 선언부 정보를
 * 얻고 출략하는 예제이다.
 * 
 * 
 */
public class ReflectionExample {

	public static void main(String[] args) {
		
		Class clazz = Car.class;
		
		System.out.println("생성자 정보");
		Constructor[] constructors = clazz.getDeclaredConstructors();//생성자 정보 가져옴
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName()+"(");// 생성자의 패키지를 포함한 메소드 이름 출력
			Class[] parameters = constructor.getParameterTypes();//매개변수의 정보
			printParameters(parameters);
			System.out.println(")");
		}
		
		System.out.println();
		
		System.out.println("필드정보");
		Field[] fields = clazz.getDeclaredFields();
		
		for(Field field : fields) {
			System.out.println(field.getType().getName()+" "+field.getName());
		}
		System.out.println();
		
		System.out.println("메소드 정보");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.print(method.getName()+"(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");		
		}
	}
	private static void printParameters(Class[] parameters) {
			
		for(int i=0;i<parameters.length;i++) {	
			System.out.print(parameters[i].getSimpleName());
			if(i<parameters.length-1) {
				System.out.print(",");
			}
		}
		
	}
	
}
/*생성자 (Constructor)
	getName() 메서드는 생성자가 속한 클래스의 이름을 반환해.	
	따라서 패키지 정보까지 포함된 클래스 이름이 반환되는 거야.
	생성자는 클래스의 이름과 동일하기 때문에, 리플렉션에서 생성자를 식별할 때
	클래스 이름을 반환하는 것처럼 보여.

메서드 (Method)
	getName() 메서드는 메서드의 이름만 반환해. 패키지 정보는 포함되지 않아.	
	메서드 이름은 메서드 자체의 이름만을 나타내기 때문에 클래스 정보나 패키지 정보가 필요하지 않아.

필드 (Field)
	getName() 메서드는 필드의 이름만 반환해. 이 역시 패키지 정보는 포함되지 않아.
	필드 이름은 필드 자체의 이름만을 나타내기 때문에 클래스 정보나 패키지 정보가 필요하지 않아.*/