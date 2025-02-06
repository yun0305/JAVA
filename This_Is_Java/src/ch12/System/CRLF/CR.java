package ch12.System.CRLF;

public class CR {
	
		/*<ASCII 13>
		 * 
		 * \r 캐리지 리턴 이라는 의미로 커서를 현재 줄의 맨 왼쪽으로 이동시키는 역할을함
		 * 	줄을 바꾸지는 않음(즉 다음줄로 이동하지 않음)
		 * 옛날 타자기의 캐리지 동작에서 유래됨
		 * Windows에서는 \r\n 조합으로 줄바꿈 문자로 사용함
		 * 
		 * 원리:
		 * 		타자기에서 \r 개념 
		 * 		옛날 타자기는 글자를 한줄에 입력한 후 줄의 맨 앞으로 돌아가기 위해 손으로 캐리지를 이동시켜야 했음
		 * 		이 동작을 캐리지 리턴 이라고 불렸고 컴퓨터에서도 같은 역할을 하도록 \r이 정의됨
		 * 
		 * 역할:
		 * 		커서를 현재 줄의 맨 왼쪽으로 이동
		 * 		줄바꿈은 하지 않음(\n이 필요함)
		 * 	
		 */
	
	    public static void main(String[] args) throws InterruptedException {
	        for (int i = 0; i <= 100; i += 10) {
	            System.out.print("\r진행 중: " + i + "%");
	            Thread.sleep(500); // 0.5초 대기
	        }
	        System.out.print("\n완료!");
	    
	        
	        
	        System.out.println("Hello\rworldo");
	        System.out.println("Hello\rworldo");
	    }
	

	
}
