package ch13.Generic.GenericType;

	/*
	 * <제네릭 타입>
	 * 제네릭 타입은 결정되지 않은 타입을 파라미터로 가지는 클래스와 인터페이스를 말한다.
	 * 제네릭 타입은 선언부에 '<>' 부호가 붙고 그 사이에 타입 파라미터들이 위치 한다.
	 * 
	 * ex)
	 * public class 클래스명<A,B...> {
	 * 
	 * }
	 * 
	 * public interface 인터페이스명<A,B...>{
	 * 
	 * }
	 * 
	 * 타입 파라미터는 변수명과 동일한 규칙에 따라 작성할 수 있지만 일반적으로는 대문자 알파벳 한 글자로
	 * 표현한다. 외부에서 제네릭 타입을 사용하려면 타입 파라미터에 구체적인 타입을 지정해야 한다.
	 * 만약 지정하지 않으면 Object 타입이 암묵적으로 사용된다.
	 * 
	 * 다음 예제에서 Product 클래스를 제네릭 타입으로 선언해보자. kind와 model 필드를 타입 파라미터로
	 * 선언하고, Getter의 매개변수와 Setter의 리턴 타입 역시 타입 파라미터로 선언한다
	 * 이렇게 타입 파라미터를 사용하는 이유는 Product에 다양한 종류와 모델 제품을 저장하기 위해서이다.
	 * 
	 * 
	 * 
	 */

public class Product<K, M> {

	//필드	
	private K kind;
	private M model;
	
	//메소드
	
	public K getKind(){	
		return this.kind;
	}
	public M getModle() {
		return this.model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
}	
