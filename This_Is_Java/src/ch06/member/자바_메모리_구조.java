package ch06.member;

public class 자바_메모리_구조 {

	/*Memory Area 의 구조
	 * 
	 * 자바 소스파일(.java)은 javac(자바 컴파일러)가 바이트코드로 바꿔준다 확장자는 .class
	 * 이렇게 코드를 바꾸는 이유는 코드를 1차적으로 숨겨주는 역할도 하고 소스코드를 한번 검사하고 바이트 코드로
	 * 바꾸기 때문에 바이트 코드로 바뀐 후에는 더 이상 문법 검사를 하지 않기 때문에 속도면에서 이득이다.
	 * 하지만 이 방법은 소스코드를 변경 할때마다. 컴파일을 하고 실행시켜야 하기 때문에 실행이 오래걸린다.
	 * 
	 * 이렇게 .class 파일은 클래스 로더가 jvm 메모리 영역(RunTime Data Area)로 로딩 시킨다.
	 * 여기서 메모리 영역은 5가지의 영역으로 나눠져있다. 
	 * 
	 * 메소드와 힙 영역은 모든 스레드가 공유하는 공간이고 나머지 Stack, PC Register , Native Method Stack
	 * 은 스레드마다 하나씩 생성되는 영역이다.
	 * 
	 * <메소드 영역>
	 * 메소드 영역은 jvm이 시작될때 생성되는 공간으로 바이트코드가 이 영역에 저장된다.
	 * 뿐만 아니라 모든 스레드가 공유하는 영역이니까. 클래스와 변수의 정보 static 키워드로 선언된 공유 변수가 저장된다.
	 * 
	 * <힙 영역>
	 * 힙 영역은 동적으로 생성된 객체가 저장되는 영역이다 즉 힙 영역에는 new 연산을 통하여 동적으로 생성된
	 * 인스턴스 변수가 저장되는 영역이다 new 연산을 통해서 생성된 데이터는 예를 들어 클래스의 객체 배열이 있다.
	 * 이런 객체는 소멸되기 전이나 가비지 컬랙터가 정리하기 전까지는 이 영역에 남았다
	 * 
	 * 또한 힙영역은 가비지 컬랙터의 대상이 되는 영역이다. 더 효과적인 가비지 컬랙션을 수행하기 위해서
	 * 5가지 영역으로 힙영역이 나뉜다
	 * 
	 * <Stack 영역>
	 * Stack 영역은 지역변수나 메소드의 매개변수 일시적으로 사용되는 변수, 메소드의 정보가 저장되는 영역이다.
	 * 지역변수와 매개변수의 특성상 메소드의 호출이 종료되면 Stack메모리 안에 선언된 변수들은 사라진다.
	 * 그렇기 때문에 금방쓰고 사라지는 데이터가 저장되는 영역이다.
	 * 
	 * 헷갈리면 안되는게 객체를 생성할때 객체의 참조 변수는 Stack에 저장되고 new 연산자로 생성한 인스턴스는 힙에 저장된다
	 * 
	 * 
	 * <PC Register>
	 * PC Register는 프로그램 카운터라고 우리가 알고있는 일반적인 컴퓨터를 말하는 것이 아니다.
	 * 스래드가 어떤 부분을 어떤 명령어로 수행할지를 저장하는 공간이다, 즉 스레드가 실행되면 생성되고 현재 수행중인 jvm 명령어 주소를 저장하는
	 * 공간이다.
	 * 
	 * <Native Method Stack>
	 * Native Method Stack 은 자바가 아닌 다른 언어로 작성된 코드를 위한 공간이다.
	 * C언어나 키타 언어들을 위한 공간이고 바이트코드가 아닌 실제 기계어로 만들어진 코드가 실행되는 영역이다.
	 * 
	 * 
	 * 
	 * 차례대로 살펴 보자.

	클래스 영역(Class Area)
	Static, Method 영역이라고도 불리며, 클래스 정보, static 변수, 변수 정보(데이터타입, 접근제어자), 
	메소드 정보(메소드명, 리턴타입, 파라미터, 접근제어자), final class, constant pool 등이 저장되는 메모리 영역이다.
	JVM이 동작해서 클래스가 로딩될 때 생성되며, JVM이 종료될 때까지 유지된다.
	또한 런타임 중에 변경할 수 없는 특징을 가지고 있고 고정된 공간을 차지하고 있다.
	해당 메모리를 잘 사용하는 경우(Singleton 패턴) 메모리 사용에서 이점을 볼 수 있으나,
	static 변수와 같이 공유되는 자원의 경우 잘못 사용하면 멀티 쓰레드 환경에서 치명적인 버그를 불러올 수 있다.

	힙 영역(Heap Area)
	힙 영역에는 new 키워드로 생성된 객체(인스턴스)의 데이터와 참조 자료형(class, interface, enum, Array 등)이 저장된다.
	클래스 영역에 로드된 클래스로만 객체 생성이 가능하며 garbage collector의 주요 대상이 된다.
	인스턴스가 생성될 때 힙에 생성되며, 가비지 컬렉터가 메모리를 수거할 때 소멸한다.

	스택 영역(Stack Area)
	스택 영영에는 int, boolean 등 기본 자료형과 지역 변수, 파라미터, 리턴값 등 연산에 임시로 사용되는 정보들이 저장된다.
 	또한, 객체의 참조 주소값도 스택 영역에 저장된다. 메소드 호출 시 개별적으로 스택이 생성되며, 종료 시 소멸한다.

	PC Register
	스레드가 생성되면서 생기는 공간
	스레드가 어느 명령어를 처리하고 있는지 그 주소를 등록한다.
	JVM이 실행하고 있는 현재 위치를 저장하는 역할

	Native Method Stack
	Java 가 아닌 다른 언어 (C, C++) 로 구성된 메소드를 실행이 필요할 때 사용되는 공간
	 * 
	 * 
	 */
}
