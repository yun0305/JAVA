package ch12.System.CRLF;

public class LF {

	/*
	 * <ASCII 10 (LF, Line Feed, \n)>
	 * 		
	 * 		\n(LF)이란:
	 * 				줄바꿈(Line Feed) 이라는 의미로 커서를 다음 줄로 이동시키는 역할을 함
	 * 				커서를 왼쪽 맨 처음 으로 이동함
	 * 				유닉스 시스템에서는 줄바꿈 문자로 사용됨
	 * 				Windows에서는 \r\n(CR+LF)을 줄바꿈 문자로 사용하지만, Linux/macOS에서는 \n(LF)만 사용.
	 * 

	 * 
	 * 		LF의 원리
	 * 				타자기에서 \n의 개념
	 * 				옛날 타자기에서 한 줄을 아래로 내리려면 줄을 올리는 동작이 필요했음
	 * 				이 동작을 컴퓨터에서도 구현하기위해 ASCII 10 이 정의됨
	 * 
	 * 				현재 위치에서 한 줄 아래로 이동(줄 바꿈)
	 * 				자동으로 커서를 왼쪽 맨 처음으로 이동함
	 * 				Windows는 \r\n을 줄바꿈 문자로
	 * 				
	 * 
	 * 
	 * 	결론:
	 * 		✔\n(LF, Line Feed)은 줄을 바꾸고 자동으로 커서를 맨 왼쪽으로 이동시킴.
	 *		✔Windows에서는 \r\n(CR+LF)을 줄바꿈 문자로 사용하지만, Linux/macOS에서는 \n(LF)만 사용.
	 *		✔ 콘솔에서 여러 줄을 출력하거나 애니메이션 효과를 만들 때 활용 가능. 🚀
	 *
	 * 
	 */
		
	public static void main(String[] args) {
		System.out.print("Hello\nWorld");
	}
	
}
