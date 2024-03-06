package ch12.DTO.record;

/*
 * 데이터 전달을 위한 DTO(데이터를 전달할 목적으로 사용되는 객체)를 작성할 떄 반복적으로 사용되는 코드를 줄이기 위해 java14부터 레코드가
 * 도입되었다. 예를 들어 사람의 정보를 전달하기 의한 Person DTO가 다음과 같다고 가정해보자.
 * 
 * public class Person{
 * 
 * 	private final String name;
 * 	private final String age;
 * 
 * 	public Person(String name, String age){
 * 	
 * 		this.name = name;
 * 		this.age = age;
 * 
 * }
 * 
 * public String name(){
 *  	return this.name;
 * }
 * 
 * public String age(){
 *  	return this.age;
 * }
 * 
 * 	@Override
 * 	public int hashCode(){
 * }
 * 
 * @Override
 * 	public int equals(Object Obj){
 * }
 * 
 * @Override
 * 	public int toString(){
 * }
 *
 * }
 * 
 * Person의 데이터(필드)는 읽기만 가능하도록 필드를 private final 선언하였으며, 필드 이름과
 * 동일한 getter 메소드(name(), age())를 가지고 있다, 그리고 동등 비교를 위해 hashCode(),equals()
 *  메소드를 재정의하고 있고, 의미 있는 문자열 출력을 위해 toString() 메소드를 재정의 하였다.
 *  
 *  다음 코드는 위와 동일한 코드를 생성하는 레코드 선언이다. class 키워드 대신에 record로 대체하고
 *  클래스 이름 뒤에 괄호를 작성해서 저장할 데이터의 종류를 변수로 선언하였다.
 *  
 *  public record Person(String name, int age){
 *  }
 *  이렇게 선언된 레코드 소스를 컴파일하면 변수의 타입과 이름을 이용해서 private final 필드가 자동
 *  생성되고, 생성자 및 Getter 메소드가 자동으로 추가된다. 그리고 hashCode(), equals() toString()
 *  메소드를 재정의한 코드도 자동으로 추가된다.
 *  다음은 레코드로 선언된 Member를 이용하는 방법을 보여준다,
 */



public record Member(String id, String name, int age) {

}
