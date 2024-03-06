package ch08._interface.constance_interface;

public class RemoteControlExample {

	public static void main(String[] args) {
		/*
		 * 인터페이스의 모든 필드는 상수 필드이다
		 * 만약 RemoteControl 상수를 바꿔주려고 한다면 컴파일 오류가 발생한다
		 * RemoteControl.MAX_VOLUM = 20; <- 컴파일 오류
		 * 
		 * 
		 */
		
		System.out.println(Remotecontrol.MAX_VOLUM);
		System.out.println(Remotecontrol.MIN_VOLUM);
		/*
		 * 이런 방식으로 사용할수 있지만 대부분 인터페이스 상수필드는 구현객체 안에서 사용 한다.
		 */
		
	}

}
