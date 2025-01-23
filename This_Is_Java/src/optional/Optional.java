package optional;

import java.util.List;

public class Optional {
	
	/*<Optional 이란>
	 * Optional은 java8에서 도입된 클래스이고 null값을 다루는데 도움을 주는 도구다.
	 * 주요 목적은 null 값을 안전하게 처리하고 null로 인행 NPE을 방지하는데 있다. 
	 * 즉 어떤 값이 있을 수도 있고 없을수도 있는 상황을 표현하기 위해 사용한다
	 * 
	 * <왜 Optional이 필요할까>
	 * java 에서는 null을 직접 다룰때 NPE이 발생할 가능성이 높다.
	 * 기존에는 null 체크를 직접 수행했지만 이는 귀찮고 실수를 유발하기 쉽다.
	 * 
	 * 예: null체크 없이 코드를 작성했을 때
	 * 
	 * String name = null;
	 * System.out.println(name.length());//NullPointerException
	 * 
	 * <Optinal의 주요 기능>
	 * 		1.Optional 생성
	 * 			Optional 객체는 직접 값을 감싸는 방법으로 생성된다.
	 * 
	 * 			Optional<String> optionalvalue = Optional.of("Hello");//값이 있는 Optional 생성
	 * 			Optional<String> emptyValue = Optional.empty(); 	  //빈 Optional 생성
	 * 			Optional<String> nullableValue = OfOptional.ofNullable(null); // null일 수도 있는 값 처리
	 * 
	 * 		2.값 존재 여부 확인
	 * 			isPresent() : 값이 존재하는지 확인
	 * 			ifPersent() : 값이 존재하면 특정 동작 수행
	 * 
	 * 			Optional<String> optionalValue = Optional.of("Hello");
	 *
	 * 			if (optionalValue.isPresent()) {
 	 *			    System.out.println("Value exists: " + optionalValue.get());
	 *			}
	 *			
	 *			// 더 간단하게 (람다인가?)
	 *			optionalValue.ifPresent(value -> System.out.println("Value: " + value));
	 *  		
	 *  	3.값 가져오기
	 *  		get() : 값을 가져옴 하지만 값이없으면 예외발생
	 *  		orElse() : 값이 없으면 기본값을 반환
	 *  		orElseGet() : 값이 없으면 지정된 함수 실행
	 *  		orElseThrow() : 값이 없으면 예외 발생
	 *  	
	 *  		
	 *  		
	 */
		
		class Person<T>{
				
			T name;//name이 null일경우 NPE가 발생
		
			T getNames() {
				
				if(name != null) {//NPE를 방지하기 위해 null 검사를 해야함
					return name;
				}
				
				return null;
			}	
			void setNames(T name) {
				this.name = name;
			}
		}
		/*
		 * [Optional이란]
		 * java8에서는 Optional<T> 클래스를 사용해서 NPE 를 방지할 수 있도록 도와준다.
		 * Optional<T> 는 null이 올 수 있는 값을 감싸는 Wrapper 클래스로 참조하더라도 NPE가
		 * 발생하지 않도록 도와준다. Optional 클래스는 아래와 같은 vlaue에 값을 저장하기
		 * 떄문에 값이 null이더라도 바로 NPE가 발생하지 않으며 클래스이기 떄문에 각종 메소드를
		 * 제공해준다.
		 * 
		 * public final class Optional<T> {

			  // If non-null, the value; if null, indicates no value is present
			  private final T value;
			   
			  ...
			}
			출처: https://mangkyu.tistory.com/70 [MangKyu's Diary:티스토리]
		 */
		
		/*<Optional 활용하기>
		 * 		Optional.empty() - 값이 Null인 경우
		 * 		Optional은 Wrapper클래스이기 때문에 값이 없을 수도 있는데 이때는 Optional.empty()
		 * 		로 생성할 수 있다. 
		 * 
		 * 		Optional<String> optional = Optional.empty();

				System.out.println(optional); // Optional.empty
				System.out.println(optional.isPresent()); // false
			
				
		 * 
		 */
		
		public static void main(String[] args) {
			
			Optional op = new Optional();
			Optional.Person<String> per = op.new Person();
			
			//per.setNames("heoyun");
			System.out.println(per.getNames());
			
		}
	
}
