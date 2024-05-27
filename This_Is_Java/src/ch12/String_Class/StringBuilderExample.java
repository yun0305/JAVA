package ch12.String_Class;

	/*
	 * String은 내부 문자열을 수정할 수 없다. 다음 코드를 보면 다른 문자열을 결합해서 내부 문자열을 변경하는 것처럼 보이지만
	 * 사실 "ABCDEF"라는 세로운 String 객체를 생성하는 것이다. 그리고 data 변수는 새로 생성된 String 객체를 참조하게 된다.
	 * 
	 * String data = "ABC";
	 * data += "DEF";
	 * 
	 * 문자열의 + 연산은 새로은 String 객체가 생성되고 이전 객체는 계속 버려지는 것이기 떄문에 효율성이 좋다고 볼 수 없다.
	 * 잦은 문자열 변경 작업을 해야 한다면 String 보다는 StringBuilder 를 사용하는 것이 좋다.
	 * 
	 * StringBuilder는 내부 버퍼(데이터를 저장하는 메모리)에 문자열을 저장해두고 그 안에서 추가, 수정, 삭제 잡업을 하도록
	 * 설계되어 있다. 따라서 String 처럼 객체를 만들지 않고도 문자열을 조작할 수 있다. StringBuilder가 제공하는 조작 메소드는
	 * 다음과 같다
	 * 
	 * 리턴타입				메소드						설명
	 * StringBuilder		append(기본값||문자열)			문자열을 끝에 추가
	 * StringBuilder		insert(기본값||문자열)			문자열을 지정 위치에 추가
	 * 
	 * StringBuilder		delete(시작위치,끝위치)			문자열 일부를 삭제
	 * StringBuilder		replace(시작위치,끝위치,문자열)	문자열 일부를 대체
	 * String				toString()					완성된 문자열 리턴
	 * 
	 * toString을 제외한 다른 메소드는 StringBuilder를 다시 리턴하기 때문에 연이어서 다른 메소드를
	 * 호출할 수 있는 메소드 체이닝 패턴을 사용할 수 있다. 
	 */


public class StringBuilderExample {

	public static void main(String[] args) {
		
		String data = new StringBuilder()//메소드 체이닝 자기 자신을 리턴하기 때문에 가능
						.append("DEF")
						.insert(0, "ABC")
						.delete(3, 4)
						.toString();// 결국 마지막에 String을 리턴하기 때문에 data에 완성된 문자열이 들어간다.
		System.out.println(data);
		

	}

}
