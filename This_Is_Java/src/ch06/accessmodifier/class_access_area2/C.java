package ch06.accessmodifier.class_access_area2;

import ch06.accessmodifier.class_access_area1.B;

public class C {
	//A a; //클래스는 default 라서 import해도 사용할수 없다
	B b;//B클래스는 public 이라서 import 시키면 B클래스를 사용할수 있다
}
