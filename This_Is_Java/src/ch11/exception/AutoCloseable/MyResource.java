package ch11.exception.AutoCloseable;

import java.io.File;

public class MyResource implements AutoCloseable {

	/*
	 * 리소드란 데이터를 제공하는 객체를 말한다. 리소스는 사용하기 위해 열어야 하며, 사용이 끝난 다음에는 닫아야한다.
	 * 예를 들어 파일 내용을 읽기 위해서는 파일을 열어야 하며, 다 읽고 난 후에는 파일을 닫아야 다른 프로그램에서 사용할수 있다.
	 * 리소스를 사용하다가 예외가 발생될 경우에도 안전하게 닫는 것이 중요하다, 그렇지 않으면 리소스가 불안정한 상태로 남아있게 된다.
	 * 
	 * 다음 코드는 file.txt 파일의 내용을 읽기 위해 FileInputStream 리소스를 사용하는데, 예외 발생 여부와 상관없이
	 * finally 블록에서 안전하게 close한다.
	 * 
	 * FileInputStream fis = null;
	 * 
	 * try{
	 * 
	 * 		fis = new FileInputStream("file.txt"); 파일 열기
	 * 		...
	 * }catch(IOException e){
	 * 		...
	 * 
	 * }finally{
	 * 		fis.close(); 파일 닫기
	 * }
	 * 
	 * 좀더 쉬운 방법이 있다. try-with-resources 블록을 사용하면 예외 발생 여부와 상관없이 리소스를 자동으로 닫아준다.
	 * try 괄호 안에 리소스를 여는 코드를 작성하면 try 블록이 정상적으로 실행을 완료했거나 도중에 예외가 발생하면 자동으로
	 * 리소스의 close() 메소드가 호출된다.
	 * 
	 * try(FileInputStream fis = new FileInputStream("file.txt")){
	 * ...
	 * } catch(IOException e){
	 * ...
	 * }
	 * 
	 * try-with-resiurces 블록을 사용하기 위해서는 조건이 하나 있다. 리소스는 java.lang.AutoCloseable 인터페이스를 구현해서
	 * AutoCloseable 인터페이스의 close() 메소드를 재정의해야 한다. 예를 들어 FileInputStream은 다음과 같이 AutoCloseable
	 * 인터페이스를 구현하고 있다.
	 * 
	 * public class FileInputStream implements AutoCloseable{
	 * 
	 * 	@Overrride
	 * 	public void close() throws Exception {
	 * 
	 * 	}
	 * }
	 * 
	 * 복수 개의 리소스를 사용해야 한다면, 다음과 같이 try()괄호 안에 세미콜론(;)으로 구분해서 리소스를 여는 코드를 작성하면된다.
	 * 
	 * try(FileInputStream fis1 = new FileInputStream("file1.txt");
	 * 	   FileInputStream fis2 = new FileInputStream("file1.txt")){
	 * ...
	 * 	
	 * 
	 * }catch(IOEception e){
	 * 	...
	 * }
	 * 
	 *  java8 이전 버전은 try 괄호안에서 리소스 변수를 반드시 선언해야 했지만 java9 이후부터는 외부 리소스 변수를 사용할 수 있다.
	 *  따라서 위 코드는 다음과 같이 변경할수 있다.
	 *  
	 *  FileInputStream fis1 = new FileInputStream("file1.txt");
	 * 	FileInputStream fis1 = new FileInputStream("file1.txt");
	 *  
	 *  try(fis1;fis2){
	 * 	
	 * 	...
	 * 
	 * }catch(IOEception e){
	 * 	...
	 * }
	 *
	 *  다음 예제는 AutoCloseable 인터페이스를 구현한 MyResosource 리소스를 try-with-resiurces 블록에서 사용한다.
	 *  try블록에서 예외 발생 여부와 상관없이 안전하게 close() 메소드가 실행되는 것을 볼 수 있다. 
	 *  
	 */
	
	
	
	private String name;
	
	public MyResource(String name) {
		this.name = name;
		System.out.println("MyResource ("+name+") 열기");
	}
	
	public String read1() {
		System.out.println("MyResource ("+name+") 읽기");
		return "100";
	}
	
	public String read2() {
		System.out.println("MyResource ("+name+") 읽기");
		return "abc";
	}
	@Override
	public void close() throws Exception {
		System.out.println("MyResource ("+name+") 닫기");
		
	}
	
}
