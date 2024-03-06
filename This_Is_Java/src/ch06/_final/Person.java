package ch06._final;

public class Person {
	//final
		/*
		 * final은 초기화 해줄수 있는 방법이 2가지 뿐이다
		 * 1.final 필드는 처음에 필드를 생성해 줄때 초기화를 해주거나
		 * 2.생성자로 받아서 한번 초기화 해줄수 있다
		 * 객체마다 같은 값을 가지면 필드에서 초기화 해주고 
		 * 객체마다 다른값을 가지면 생성자에서 초기화 해주면 된다
		 * 
		 * 생성자를 사용할때까지 final필드를 초기화 해줘야한다 만약 초기화 하지 않은 final 필드를 그대로 남겨두면
		 * 컴파일 에러가 발생한다
		 * 
		 * 한번 초기화 해주고 바뀌면 안돼는 데이터를 선언할떄 final을 사용한다
		 * 
		 */
		final String nation = "korean";
		final String ssn;
		String name;
		Person(String ssn,String name){
			this.ssn = ssn;
			this.name = name;
		}
		
		
		
	}
