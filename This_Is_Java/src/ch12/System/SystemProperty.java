package ch12.System;

public class SystemProperty {

	public static void main(String[] args) {
		/*
		 * 시스템 프로퍼티(System Properties)란 자바 프로그램 실행 시 자동으로 설정되는 환경 정보를 의미한다.
		 * 이는 운영체제 정보, 사용자 정보, 자바 버전 등의 환경 변수를 포함하며, 
		 * `System.getProperty("key")`를 사용하여 특정 속성을 가져올 수 있다.
		 * 
		 * 주요 시스템 프로퍼티는 다음과 같다:
		 * 
		 * 속성 이름(key)                  설명
		 * ----------------------------------------------
		 * java.version                  현재 실행 중인 자바 버전
		 * java.specification.version    자바 스펙 버전 (예: 1.8, 11, 17)
		 * java.home                     JDK 또는 JRE의 설치 디렉토리 경로
		 * java.class.path               클래스 경로 (Classpath)
		 * os.name                       운영체제 이름 (예: Windows 10, Linux, macOS)
		 * os.version                    운영체제 버전
		 * user.name                     현재 로그인한 사용자 이름
		 * user.home                     사용자 홈 디렉토리
		 * file.separator                파일 경로 구분자 (Windows: "\", Linux/macOS: "/")
		 * line.separator                줄바꿈 문자 (Windows: "\r\n", Linux/macOS: "\n")
		 * 
		 * `System.getProperties()`를 호출하면 모든 시스템 프로퍼티를 출력할 수 있다.
		 */

		
		System.out.println("Java 버전: " + System.getProperty("java.specification.version"));
        System.out.println("JDK 경로: " + System.getProperty("java.home"));
        System.out.println("운영체제: " + System.getProperty("os.name"));
        System.out.println("운영체제 버전: " + System.getProperty("os.version"));
        System.out.println("사용자 이름: " + System.getProperty("user.name"));
        System.out.println("사용자 홈 디렉토리: " + System.getProperty("user.home"));
        System.out.println("파일 구분자: " + System.getProperty("file.separator"));
        System.out.println("Java 클래스 경로: " + System.getProperty("java.class.path"));
		

	}

}
