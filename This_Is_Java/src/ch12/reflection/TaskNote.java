package ch12.reflection;

import java.lang.reflect.Method;

public class TaskNote {

	public static void main(String[] args) {
		
		Class clazz = Car.class;//
		
		Method[] method = clazz.getDeclaredMethods();
		
		for(Method get_method : method) {
			
			System.out.println(get_method.getName());
			
			Class[] parameter = get_method.getParameterTypes();
			
			for(Class get_Parameter:parameter) {
				System.out.println(get_Parameter.getSimpleName());
			}
		}

	}

}
