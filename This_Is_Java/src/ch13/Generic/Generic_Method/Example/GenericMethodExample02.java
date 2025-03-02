package ch13.Generic.Generic_Method.Example;

public class GenericMethodExample02 {
	
	//두 개의 설 다른 제네릭 타입을 사용하는 메소드
	public static <K,V> void printKeyValue(K key, V value) {
		System.out.println("key : " + key + "value : "+ value );
	}
	
	public static void main(String[] args) {
		GenericMethodExample02.<Integer,String>printKeyValue(1,"one");//타입 명시
		printKeyValue(1,"one");//타입 추론
		
		GenericMethodExample02.<Double,Boolean>printKeyValue(3.14,true);//타입 명시
		printKeyValue(3.14,true);//타입 추론
		
		GenericMethodExample02.<String,Integer>printKeyValue("Name", 25);//타입 명시
		printKeyValue("Name", 25);//타입 추론
	}
}
