package ch12.String_Class;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

	/*
	 * 자바에서 문자열과 관련된 주요 클래스는 다음과 같다.
	 * 
	 * 클래스				설명
	 * 
	 * String			문자열을 저장하고 조작할때 사용
	 * StringBuilder 	효율적인 문자열 조작 기능이 필요할때 사용
	 * StringTokenizer 	구분자로 연결된 문자열을 분리할 때 사용
	 * 
	 * String 클래스
	 * 
	 * String 클래스는 문자열을 저장하고 조작할 때 사용한다. 문자열 리터럴은 자동으로 String 객체로 생성되지만
	 * String 클래스의 다양한 생성자를 이용해서 직접 객체를 생성할 수도 있다.
	 * 
	 * 프로그램을 개발하다 보면 byte 배열을 문자열로 변환하는 경우가 종종있다. 예를 들어 네트워크 통신으로 얻은 byte 배열을
	 * 원래 문자열로 변환하는 경우이다. 이때는 String 생성자 중에서 다음 두 가지를 사용해 String 객체로 생성할 수 있다.
	 * 
	 * 기본 문자셋으로 byte 배열을 디코딩해서 String 객체로 생성
	 * String str = new String(byte[] bytes);
	 * 
	 * 특정 문자셋으로 byte 배열을 디코딩해서 String 객체로 생성
	 * String str = new String(byte[] bytes, String charsetName);
	 * 
	 * 다음 예제는 문자열을 byte 배열로 변환시키고 다음 문자열로 복원 하는 방법을 보여준다.
	 * 
	 * 
	 * euc-kr = 한글 1개당 2바이트
	 * utf-8 = 한글 1개당 3바이트
	 */


public class BytesToStringEample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//인코딩 String -> byte[]
		String data = "자바";
		//byte[] arr1 = data.getBytes("UTF-8"); 문자셋을 지정해줄수 있다. 아무것도 안쓰면 이클립스의 기본 문자셋을 따라간다.
		byte[] arr1 = data.getBytes("EUC-KR");
		//byte[] arr1 = data.getBytes();//data의 리터럴 문자를 바이트당 배열 1개로 만들어줌
		System.out.println(arr1.length);
		System.out.println(Arrays.toString(arr1));//여기서 나오는 값들은 그 언어의 숫자코드이다.
		
		//디코딩 byte[] -> String
		String data2 = new String(arr1, "EUC-KR");//디코딩 할떄는 인코딩의 문자셋과 같아야 깨지지 않는다.
		System.out.println(data2);
		
		

	}

}
