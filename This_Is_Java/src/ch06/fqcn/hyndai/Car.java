package ch06.fqcn.hyndai;

import ch05.reference.sec06;
import ch06.fqcn.hankook.SnowTire;
import ch06.fqcn.kumho.AllSeasonTire;

//import sec06.fqcn.kumho.Tier;
//import sec06.fqcn.hankook.Tier;

/*
 * 
 * 같은 패키지에 속하는 클래스들은 아무런 조건없이 사용할수 있지만 다른 패키지에 속하는
 * 클래스를 사용하려면 두가지 방법이 있다
 * 
 * 첫번째 사용하려는 클래스의 패키지 주소를 모두 입력하는 것이다(sec6.fqcn.hankook.Tire tire = new sec6.fqcn.hankook.Tire();)
 * 
 * 두번째 방법은 import문을 사용하는 것이다
 * import문으로 선언할때는 클래스 이름을 생략하고 패키지 옆에 *를 사용하면 해당 패키지가 가지고 있는 모든 클래스를 사용할수 있다
 * 하지만 *를 사용할때 주의할점은 import문으로 지정된 하위 패키지는 import의 대상이 아니다 상위 패키지를
 * import하고 *를 한다하면 그 패키지의 클래스만 사용하는것이지 상위 패키지 안에 하위 패키지까지 사용할수 있는건 아니라는 것이다 
 * 그래서 따로 선언해줘야 한다
 * import com.maycompay*;
 * import com.maycompay.porject*;
 * 
 * 첫번째 방법이 꼭 필요한 경우가 있는데 클래스 이름이 같을 경우다
 * 
 * Tire 클래스는 hankook 패키지랑 kumho 패키지에 두개가 선언되어있는데 이럴경우 두 패키지를 임포트하고 사용하면 컴파일 에러가 발생한다
 * 이럴경우 첫번째 방법을 사용해서 직접 모든 주소를 입력해서 클래스를 사용해야 한다
 * 
 * 추가**23년 08 15 3:11**(타입변환 공부중 갑자기 생각남)
 * 다른 패키지에서 클래스를 상속 시키고 싶으면 import 시키고 그 클래스를 사용하면 된다
 * 
 * 추가**23년 08 16 12:14**
 * 정적 메소드도 다른 패키지에서 사용하고 싶으면 import 시켜서 사용할수 있다 
 * 
 *	 
 */

public class Car {
	/*Tier tier1 = new Tier();tire 클래스를 두개를 만들었는데 하나는 한국타이어
	 *하나는 금호 타이어를 쓰고싶어서 2개를 임포트를 했다 하지만 이름이 같아서 인식을 할수가 없다
	  Tier tier2 = new Tier();
	*/
	ch06.fqcn.hankook.Tire tier1 = new ch06.fqcn.hankook.Tire();
	ch06.fqcn.kumho.Tire tier2 = new ch06.fqcn.kumho.Tire();
	SnowTire tier3 = new SnowTire();	
	AllSeasonTire tier4 = new AllSeasonTire();
}

