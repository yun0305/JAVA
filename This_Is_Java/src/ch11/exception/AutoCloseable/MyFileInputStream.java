package ch11.exception.AutoCloseable;

import java.io.IOException;


/*1. 파일 스트림에서 close() 구현 (파일을 닫는 경우)
 * 
 * close()에 들어가는 일반적인 로직
📌 close() 메서드에는 보통 다음과 같은 작업이 포함됨.

	리소스 해제 (파일 스트림, 네트워크 소켓, 데이터베이스 연결 등 닫기)
	예외 처리 (try-catch-finally 또는 throws 활용)
	중복 호출 방지 (이미 닫힌 리소스를 또 닫지 않도록 확인)
	오류 발생 시 대체 동작 수행 (예: 로그 기록)
 */


public class MyFileInputStream implements AutoCloseable {
    private boolean isClosed = false; // 중복 close 방지

    @Override
    public void close() throws IOException {
        if (!isClosed) {
            System.out.println("파일 스트림을 닫습니다...");
            // 실제로 파일 닫는 로직 (여기서는 단순 출력)
            isClosed = true;
        } else {
            System.out.println("이미 닫힌 스트림입니다.");
        }
    }
    
    public static void main(String[] args) {
        try (MyFileInputStream stream = new MyFileInputStream()) {
            System.out.println("파일 읽기 중...");
        } catch (IOException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}

