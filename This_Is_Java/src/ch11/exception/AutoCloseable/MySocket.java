package ch11.exception.AutoCloseable;

import java.io.IOException;
import java.net.Socket;

/*
 * 2. 네트워크 소켓에서 close() 구현 (네트워크 연결 종료)
 * 
 * AutoCloseable과 Closeable의 차이
	✔ AutoCloseable
	
	try-with-resources 구문에서 사용 가능
	close() 메서드에서 Exception을 던질 수 있음
	데이터베이스, 네트워크 연결 등에서 주로 사용됨
	Exception (모든 예외 가능)
	데이터베이스, 네트워크, 사용자 정의 리소스
	
	✔ Closeable (java.io.Closeable 인터페이스)
	
	IOException을 던지는 close()를 제공함
	파일 스트림, 입력/출력 스트림 등에서 사용됨
	IOException (I/O 예외만 가능)
	파일 스트림, 입력/출력 리소스 (I/O 관련)
	AutoCloseable을 상속
	
	🚀 결론
	✔ close() 메서드는 파일, 네트워크, 데이터베이스 등의 리소스를 안전하게 닫기 위한 메서드임.
	✔ AutoCloseable 또는 Closeable을 구현하면 try-with-resources를 사용하여 자동으로 리소스를 정리할 수 있음.
	✔ close() 메서드에서는 예외 처리, 중복 호출 방지, 리소스 해제 로직이 포함됨.
	✔ 파일을 닫을 때는 file.close(), 네트워크 연결은 socket.close(), DB 연결은 conn.close()를 호출해야 함. 🚀
 * 
 */

public class MySocket implements AutoCloseable {
    private Socket socket;

    public MySocket(String host, int port) throws IOException {
        this.socket = new Socket(host, port);
    }

    @Override
    public void close() throws IOException {
        if (socket != null && !socket.isClosed()) {
            System.out.println("소켓 연결을 닫습니다...");
            socket.close(); // 네트워크 연결 종료
        }
    }

    public static void main(String[] args) {
        try (MySocket socket = new MySocket("localhost", 8080)) {
            System.out.println("소켓 사용 중...");
        } catch (IOException e) {
            System.out.println("네트워크 오류 발생: " + e.getMessage());
        }
    }
}
