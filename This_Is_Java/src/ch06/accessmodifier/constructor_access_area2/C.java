package ch06.accessmodifier.constructor_access_area2;

import ch06.accessmodifier.constructor_access_area1.A;

public class C {

	A a1 = new A(true);
	//A a2 = new A(1); default 라서 다른 패키지에서 사용 불가능
	//A a3 = new A("문자열"); private라서 사용 불가능
	
}
