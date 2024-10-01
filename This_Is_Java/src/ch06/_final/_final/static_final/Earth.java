package ch06._final._final.static_final;

public class Earth {
	/*
	 * 상수 (static final) 은 객체마다 저장할 필요가 없고(static)
	 * 값이 변하면 안되기 때문에(final) 상수라고 한다
	 * 초기값은 처음 필드 생성할때 한번 해줄수 있고 아니면 정적블록에서 복잡한 초기값을 줄수 있다
	 */
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_ARREA;
	
	static {
		EARTH_SURFACE_ARREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	
	
}
