package ch11.exception.Throws;

public class Throws_Example {

    /*
     * ✅ `throws` 키워드 개념
     * 메서드 내부에서 예외가 발생할 때, 일반적으로 try-catch 블록으로 예외를 처리하지만,
     * 해당 예외를 메서드를 호출한 쪽으로 떠넘길 수도 있다.  
     * 이때 사용하는 키워드가 `throws`이며, 메서드 선언부 끝에 작성한다.
     *
     * `throws`를 사용하면 해당 메서드를 호출하는 곳에서 예외 처리를 강제해야 하므로,
     * 예외를 보다 체계적으로 관리할 수 있다.
     *
     * ✅ `throws` 사용법
     * 예외를 떠넘길 때는 다음과 같이 메서드 선언부에 `throws`와 예외 클래스를 나열하면 된다.
     *
     *     리턴타입 메서드명(매개변수,...) throws 예외클래스1, 예외클래스2,... {
     *         // 예외 발생 가능 코드
     *     }
     *
     * 예제:
     *     void method() throws IOException, SQLException {
     *         // 파일 I/O 또는 데이터베이스 관련 예외 발생 가능
     *     }
     *
     * ✅ `throws`를 사용하는 이유
     * 1️⃣ 예외를 직접 처리하지 않고, **더 상위의 메서드에서 처리할 수 있도록 위임 가능**
     * 2️⃣ **코드의 가독성을 높일 수 있음** (예외 처리를 한 곳에서 집중 관리 가능)
     * 3️⃣ 예외가 발생할 가능성이 있는 메서드임을 명시적으로 알릴 수 있음
     *
     * ✅ 예외 클래스가 많을 경우, `throws Exception` 또는 `throws Throwable`을 사용하면
     * 모든 예외를 한 번에 떠넘길 수도 있다.
     *
     *     리턴타입 메서드명(매개변수,...) throws Exception {
     *         // 다양한 예외를 던질 가능성이 있음
     *     }
     *
     * ✅ main()에서 `throws`를 사용하면 결국 JVM이 최종적으로 예외를 처리하게 된다.
     * JVM이 예외를 처리하는 방식은 **예외 내용을 콘솔에 출력한 후, 프로그램을 비정상 종료하는 것**이다.
     *
     * 예제 (좋지 않은 방식):
     *     public static void main(String[] args) throws ClassNotFoundException {
     *         method2();
     *         System.out.println("프로그램 종료"); // 이 코드가 실행되지 않음
     *     }
     *
     * 📌 따라서, main()에서 예외를 `throws`로 떠넘기지 않고, **try-catch로 직접 처리하는 것이 바람직하다.**
     * 예외를 직접 처리해야 프로그램이 실행 중에 예외가 발생해도 멈추지 않고 정상적으로 진행될 수 있다.
     */

    public static void main(String[] args) {
        try {
            method2(); // 예외 발생 가능 메서드 호출
        } catch (ClassNotFoundException e) {
            // 📌 예외를 직접 처리하면 프로그램이 중단되지 않음
            System.out.println("예외 처리됨: " + e.toString());
        }
        System.out.println("프로그램 종료"); // ✅ 예외가 발생해도 정상적으로 실행됨
    }

    /*
     * ✅ `throws`를 사용한 예외 던지기
     * `method2()` 내부에서는 `Class.forName("java.lang.String2")`을 호출하는데,
     * 이 메서드는 `ClassNotFoundException`을 발생시킬 가능성이 있다.
     *
     * 📌 따라서 `method2()`는 직접 예외를 처리하지 않고, `throws`를 사용하여 호출한 쪽(main 메서드)으로 예외를 넘긴다.
     */
    public static void method2() throws ClassNotFoundException {
        // 존재하지 않는 클래스를 로드하려고 시도 → `ClassNotFoundException` 발생
        Class.forName("java.lang.String2");

        /*
         * 📌 일반 예외(Exception 계열)는 반드시 예외 처리가 필요하다.
         *   - try-catch를 사용하여 직접 처리하거나
         *   - throws를 사용하여 호출한 곳으로 예외를 떠넘겨야 한다.
         *
         * `throws`를 사용한 메서드를 호출할 경우, 호출하는 쪽에서 예외를 반드시 처리해야 한다.
         */
    }
}

