package ch12.Annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] DeclaredMethod = Service.class.getDeclaredMethods();
		//리플랙션을 위해 Sercice메소드를 얻어서 DeclaredMethods를 해서 Service 객체의 메소드를 얻어와서
		//Method[] 타입의 객체변수에 넣으면 Service가 가지고 있는 메소드들을 객체로 받아올수 있다.
		for(Method method : DeclaredMethod) {
			
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			/* method.getAnnotation(PrintAnnotation.class);
			 * Service 메소드의 객체로 getAnnotation()을 접근해서 PrintAnnotation이 메소드에 적용되어 있다면
			 * 메소드 객체에 적용된 PrintAnnotation 객체를 리턴하고 없다면 null을 리턴받는다.
			 * 
			 */
		printLine(printAnnotation);
		
		method.invoke(new Service());
		//리플레션으로 얻은 메소드 객체의 invoke메소드에 Service 객체를 넣어준다 왜냐면 해당 메소드는 인스턴스라서 객체가 필요하기때문
		
		printLine(printAnnotation);
		
		}
	}

		public static void printLine(PrintAnnotation printAnnotation){ 
			
			if(printAnnotation != null) {
				int number = printAnnotation.number();
				for(int i=0;i<number;i++) {
					String value = printAnnotation.value();
					System.out.print(value);
				}
				System.out.println();
			}
	}
	
}
