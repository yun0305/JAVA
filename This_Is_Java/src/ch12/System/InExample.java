package ch12.System;

import java.io.IOException;

/*
 * 자바는 키보드로부터 입력받은 키를 읽기 위해 System 클래스에서 in 필드를 제공한다. 다음과 같이 in 필드를 이용해서
 * read() 메소드를 호출하면 입력된 키의 아스키코드 값을 얻어올수 있다.
 * 
 * int keyCode = System.in.read();
 * 
 * read() 메소드는 호출과 동시에 키 코드를 읽는 것이 아니라 엔터 키를 누르기 전까지는 대기 상태이다가
 * 엔터 키를 누르면 입력했던 키들을 하나씩 읽기 시작한다. 단, read() 메소드는 IOException을 발생할 수 있는 코드이므로 예외 처리가
 * 필요하다.
 * 
 * 다음은 숫자 키 1과 2를 입력함에 따라 speed 필드 값이 증감하는 예제이다 숫자 키인 3을 입력하면 while 문은 종료하도록 했다
 * 
 */


public class InExample {

	public static void main(String[] args) throws IOException {
	
		
		int speed = 0;
		int keyCode = 0;
		
		while(true) {
			
			System.out.println("-------------------");
			System.out.println("1.증속  2.감속  3.멈춤");
			System.out.println("-------------------");
			System.out.println("현재 속도" + speed);
			System.out.println("선택");
			keyCode = System.in.read();
			
			if(keyCode != 13&&keyCode != 10) {
				
				if(keyCode == 49) {
					speed++;
				}
				else if(keyCode == 50) {
					speed--;
				}
				else if(keyCode == 51) {
					break;
				}
				
				
			}
		}
			
		System.out.println("종료");
		
		
	}

}


