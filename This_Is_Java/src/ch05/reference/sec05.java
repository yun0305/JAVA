package ch05.reference;

public class sec05 {

	public static void main(String[] args) {
		
		//<가비지 컬랙터가 수거해가는 경우>
		String hobby = "여행";
		hobby = null;
		
		/*
		 *hobby String 객체에 여행이 들어 있었지만 null을 넣어줘서 hobby를 더이상
		 *사용하지 않는 객체로 만들어 주었다
		 *null을 이용해 더이상 사용하지 않는 객체로 만들어 줄 수 있고 더이상
		 *사용하지 않는 객체는 자바에서 가비지 컬렉터가 객체를 사용하지 않는다
		 * 
		 */
		
		//<메모리에 남아있는 경우>
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null;
		System.out.println("kind2: "+kind2);
		
		/*
		 *여기서는 kind1을 kind2가 참조하고 있다 kind1 null로 바꿔줘도 
		 * 정상적으로 자동차가 출력된다 이유는 kind1을 null로 바꿔줘도 kind2는 여전히 
		 * kind1에 있는 객체의 주소를 참조하고 있기 때문이다 객체가 하나라도 변수에 참조가 되면
		 * 쓰래기 객체가 될수 없다
		 */
	}

}
