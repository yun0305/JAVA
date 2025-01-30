package ch06.member;

public class Instance_Block {
	/*
	 * 생성자와 비슷하게 객체가 생성될 때 실행됨
	 * 모든 생성자에서 공통으로 싱행해야 할 코드가 있을떄 사용
	 * 객체가 생성될 때 마다 실행되므로 static 필드를 초기화하는 데 사용할 수 없음
	 */
	int num; // 인스턴스 변수

    // ✅ 인스턴스 초기화 블록
    {
        System.out.println("인스턴스 초기화 블록 실행");
        num = 100; // 공통 초기화 코드
    }

    // 생성자 1
    Instance_Block() {
        System.out.println("생성자 호출");
    }

    // 생성자 2
    Instance_Block(int x) {
        System.out.println("생성자 호출: " + x);
    }



    public static void main(String[] args) {
        System.out.println("첫 번째 객체 생성");
        Instance_Block obj1 = new Instance_Block();  

        System.out.println("\n두 번째 객체 생성");
        Instance_Block obj2 = new Instance_Block(200);
    }

}