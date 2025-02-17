package ch12.DTO;

public class VO {

}

/*
 * 📌 [1] VO (Value Object)란?
 * - VO는 값 자체를 표현하는 객체이다.
 * - 값이 같으면 같은 객체로 간주한다.
 * - 불변 객체(Immutable Object)로 만드는 것이 일반적이다.
 * - DTO와 다르게 비즈니스 로직을 포함할 수도 있다.
 */

/*
 * 📌 [2] VO의 특징
 * ✅ 1. 값 자체를 표현 (데이터 그 자체)
 * ✅ 2. 불변 객체 (Immutable) → Setter가 없음
 * ✅ 3. Equals & HashCode 오버라이딩 필수 (값 비교를 위해)
 * ✅ 4. DTO와 다름 (DTO는 데이터 전달용, VO는 값 자체를 의미)
 * ✅ 5. VO 내부에 비즈니스 로직을 포함할 수도 있음
 */

/*
 * 📌 [3] VO와 DTO의 차이점
 * 
 * | 비교 항목       | VO (Value Object)         | DTO (Data Transfer Object) |
 * |---------------|---------------------|---------------------------|
 * | **목적**       | 값 자체를 표현        | 데이터 전달을 위한 객체    |
 * | **변경 가능 여부** | **불변 객체 (Immutable)** | 변경 가능 (Setter 사용 가능) |
 * | **비즈니스 로직** | 포함될 수 있음         | **비즈니스 로직 없음**      |
 * | **Equals & HashCode** | **값이 같으면 같은 객체로 취급** | 보통 오버라이딩하지 않음   |
 * | **데이터 저장 방식** | **필드 + Getter만 제공 (Setter 없음)** | **Getter/Setter 제공** |
 */

/*
 * 📌 [4] 기본 VO 예제
 * - VO는 불변 객체로 만들며, Setter 없이 값을 변경할 수 없다.
 */
class Money {
    private final int amount; // 금액 필드 (불변)

    // 생성자를 통해 초기화 (한 번 설정되면 변경 불가능)
    Money(int amount) {
        this.amount = amount;
    }

    // Getter만 제공 (Setter 없음)
    int getAmount() {
        return amount;
    }

    // 값 비교를 위한 equals & hashCode 오버라이딩 (값이 같으면 같은 객체로 취급)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money money = (Money) obj;
        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(amount);
    }
}

/*
 * 📌 [5] VO 사용 예제
 */
class Main {
    public static void main(String[] args) {
        Money m1 = new Money(1000);
        Money m2 = new Money(1000);
        Money m3 = new Money(500);

        // VO는 값이 같으면 같은 객체로 간주
        System.out.println(m1.equals(m2)); // true (값이 같으므로 동일한 객체로 취급)
        System.out.println(m1.equals(m3)); // false (값이 다름)
    }
}

/*
 * 📌 [6] VO에서 비즈니스 로직 포함 가능
 * - VO는 단순한 데이터 저장용 객체가 아니라, 값을 다루는 로직을 포함할 수도 있다.
 */
class Temperature {
    private final double value;

    // 생성자로 초기화
    Temperature(double value) {
        this.value = value;
    }

    // 섭씨를 화씨로 변환하는 비즈니스 로직 포함
    double toFahrenheit() {
        return (value * 9/5) + 32;
    }

    // Getter 제공
    double getValue() {
        return value;
    }
}

/*
 * 📌 [7] VO 사용 예제 (비즈니스 로직 포함)
 */
class TemperatureExample {
    public static void main(String[] args) {
        Temperature temp = new Temperature(25);
        System.out.println("섭씨: " + temp.getValue()); // 25.0
        System.out.println("화씨: " + temp.toFahrenheit()); // 77.0
    }
}

/*
 * 📌 [8] VO를 사용할 때 주의할 점
 * ✅ 모든 필드를 `final`로 선언하여 불변 객체로 만들기
 * ✅ Setter를 만들지 않고, 생성자로 초기화하도록 설계
 * ✅ 값 비교를 위해 `equals()`와 `hashCode()`를 반드시 오버라이딩
 * ✅ VO에 비즈니스 로직을 추가할 수도 있음
 */

/*
 * 🚀 VO 정리
 * ✅ VO는 값 자체를 의미하는 객체이다.
 * ✅ 불변 객체로 만들어야 한다. (Setter 없음, final 필드)
 * ✅ 값이 같으면 같은 객체로 간주하기 위해 `equals()`와 `hashCode()` 오버라이딩 필요.
 * ✅ VO는 단순한 데이터 저장뿐만 아니라, 비즈니스 로직을 포함할 수도 있다.
 * ✅ DTO와 다르게 VO는 값 자체를 의미하며, 변경될 수 없다.
 */
