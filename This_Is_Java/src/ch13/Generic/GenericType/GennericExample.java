package ch13.Generic.GenericType;

public class GennericExample {

	public static void main(String[] args) {
		//K는 Tv로 대체 M은 String으로 대체
		Product<Tv,String> product1 = new Product<>();
		
		//Setter 매개값은 반드시 Tv와 String을 제공
		product1.setKind(new Tv());
		product1.setModel("스마트 TV");
		
		//Getter 리턴값은 Tv와 String이 됨
		Tv tv = product1.getKind();
		String kind = product1.getModle();
		
		//----------------------------------------------
		
		//K는 Car로 대체. M은 String으로 대체
		Product<Car, String> product2 = new Product<>();
		
		//Setter 매개값은 반드시 Car와 String을 제공
		product2.setKind(new Car()); 
		product2.setModel("SUV승용차");
		
		//Getter 리턴값은 Car와 String이 됨
		Car car = product2.getKind();
		String carModel = product2.getModle();
		/*
		 * 이번에는 Rentable 인터페이스를 제네릭 타입으로 선언해보자. 다양힌 대상을 렌트하기 위해 rent()매소드의 리턴 타입을 타입 파라미터로 선언한다.
		 * 
		 */
	}

}
