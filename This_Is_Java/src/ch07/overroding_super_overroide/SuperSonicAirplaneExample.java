package ch07.overroding_super_overroide;

public class SuperSonicAirplaneExample {

	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.flay();//여기서 사용하는 flay 메소드는 재정의한 메소드이다
		sa.flayMode = SupersonicAirplane.SUPERSONIC;
		sa.flay();
		sa.flayMode = SupersonicAirplane.NOMAL;
		sa.flay();
		sa.land();
		
		
		
		
	}

}
