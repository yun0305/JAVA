package ch06.member;

public class Calculator_Static {
	//정적 멤버
	/*
	 * 
	 * 정적멤버는 객체마다 생성할 필요가 없다 그말은 즉 객체가 없이도 클래스로 접근해서
	 * 바로 사용할수 있다. 		 
	 * 정적 필드나 메소드는 클래스 영역 메모리에 선언된다.(클래스 소속 멤버)
	 * 정적 필드와 정적 메소드는 클래스에 고정된 멤버이므로 클래스 로더가 
	 * 바이트 코드를 로딩해서 메소드 영역에 적재할때 클래스 별로 관리된다
	 * 따라서 클래스 로딩이 끝나면 바로 사용할수 있다.
	 * 
	 * 사용기준
	 * 사용 기준은 객체마다 가지고 있어야 하는 필드 멤버이면 인스턴스멤버, 객체마다 가지고 있을 필요가 없다면
	 * 정적멤버로 지정해 주면 된다.
	 * 
	 * 메소드는 메소드가 인스턴스 필드를 사용하여야 한다면 인스턴스 메소드로 만들어주면 되고
     * 정적메소드는 객체와 독립적으로 분리시켜주거나 메인 메소드나 정적 메소드에서 바로 사용해 주려면
	 * static을 붙여줘야 한다.
     * 
	 * 독립적으로 분리 시켜줄때는 메소드가 객체에 소속 시켜줄 필요가 없을때다
	 * 
	 * 정적 메소드도 인스턴스 필드를 사용할수는 있지만 그러면 정적 메소드 안에 객체를 만들어서 사용해야한다 
	 * 
	 * (추가설명)
	 * 정적 멤버 (Static Member):
	 *
     * 클래스의 상태를 나타내는 변수나 클래스 수준의 동작을 수행하는 메서드를 정적 멤버로 선언합니다.
  	 * 클래스가 메모리에 로드될 때 한 번만 초기화되며, 모든 객체가 이를 공유합니다.
  	 * 주로 객체 간에 공유되어야 하는 상태나 동작을 나타내기 위해 사용됩니다. 
  	 * 
  	 * 정적 필드는 공유필드라 다른 곳에서 값을 바꾸면 정적 필드값이 바뀌고 유지된다.
  	 * 
	 */
	
		static double pi = 3.14;
		int a = 1;
		static int plus(int x,int y) {
			return x+y;
			
		}
		static int minus(int x, int y) {//정적 메소드에 인스턴스 메소드를 사용하려면 객체가 필요
			return x-y;
		}
		void test() {//인스턴스 메소드에 정적메소드 바로 호출 가능
			int a = plus(1,1);
			System.out.println(pi);
		}
}
