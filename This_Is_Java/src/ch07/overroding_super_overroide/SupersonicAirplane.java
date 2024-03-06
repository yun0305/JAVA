package ch07.overroding_super_overroide;

public class SupersonicAirplane extends AirPlane {
	//부모 메소드 호출
	/*
	 * 재정의를 하면 상속받은 자식 메소드는 재정의한 메소드만을 인식한다 
	 * 부모 메소드의 재정의 하기전의 메소드를 불러오고 싶으면 super.메소드이름 을 사용해주면 부모 메소드의
	 * 메소드를 호출한다 그러면 이전에 재정의 하기전에 사용하던 코드를 그대로 가져오고 그 뒷줄에서 재정의 코드를 넣어주면
	 * 가독성도 줄어들고 코드의 중복도 줄어든다
	 */
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	public int flayMode = 1;
	
	@Override
	public void flay() {
		
		if(flayMode == SUPERSONIC) {
			System.out.println("초음속 모드입니다.");
		}
		else {
			super.flay();//부모 메소드 호출
		}
		
	}
	
}
