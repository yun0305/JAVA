package ch09.Local_Nested_Class.Example;

public class A {

	/*
	 * 로컬 변수 (생성자 또는 메소드의 매개변수 또는 내부에서 선언된 변수)를 로컬 클래스에서 사용할 경우 로컬 변수는 
	 * final 특성을 갖게 되므로 값을 읽을 수만 있고 수정할 수 없게 된다. 이것은 로컬 클래스 내부에서 값을 변경하지
	 * 못하도록 제한하기 때문이다.
	 * 
	 * java8 이후부터는 명시적으로 final 키워드를 붙이지 않아도 되지만, 로컬 변수에 final키워드를 추가해서 
	 * final 변수임을 명확히 할 수도 있다. 참고로 java7 이전에는 final키워드를 반드시 붙여야 했다.
	 */
	
	
	public void method1(int arg) {//매개변수

		int val = 0;//로컬 변수 선언
	
		class B{// 외부에서 접근 불가. 메소드 실행 중에만 사용됨 접근제한자도 붙지 않는다
			//메소드　
			void method2() {
				//로컬 변수 읽기
				System.out.println("arg : " + arg);//로컬 클래스에서 사용하는 순간 final 특성을 갖는다.
				System.out.println("val : " + val);
				
			//arg = 10; 한번이라도 로컬 변수가 로컬 클래스에서 사용이 된다면 final 특성을 가지게 된다  
			//val = 10; 이유는 로컬 변수가 복사 되서 로컬 클래스로 들어오기 때문에 로컬 클래스의 값이 바뀌면 안되기 때문이다.
			}	
		}
		
		B b = new B();
		b.method2();
		
		//arg = 10; 로컬 클래스 외부에서 수정해주면 에러는 안나지만 대신 로컬 클래스 내부에서 사용할수 없게 된다. 
		//val = 10;
		
	}
	
	
	
}
