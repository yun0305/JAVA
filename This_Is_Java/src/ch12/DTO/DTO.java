package ch12.DTO;

public class DTO {

}
/*
 * 📌 [1] DTO (Data Transfer Object)란?
 * - DTO는 데이터를 전달하는 역할만 하는 객체이다.
 * - 데이터를 저장하고, 다른 계층으로 전달하는 데 사용된다.
 * - 비즈니스 로직 없이 **데이터 저장 및 전달**의 역할만 한다.
 */

/*
 * 📌 [2] DTO가 필요한 이유
 * 
 * 🔹 1. 데이터를 깔끔하게 전달할 수 있다.
 * - 여러 개의 값을 한 번에 전달할 수 있어 코드가 간결해진다.
 * - 매개변수가 많아질 경우 DTO를 사용하면 코드가 보기 좋아진다.
 * 
 * 🔹 2. 불필요한 데이터 노출을 막을 수 있다.
 * - 보안이 중요한 경우, DTO를 사용하여 필요한 데이터만 전달할 수 있다.
 * - 예를 들어, 사용자 정보에서 비밀번호를 숨기고 싶다면 DTO에서 해당 필드를 제외하면 된다.
 * 
 * 🔹 3. 유지보수가 쉬워진다.
 * - 새로운 필드가 추가될 때 DTO만 수정하면 되므로 유지보수가 쉬워진다.
 * - 만약 매개변수로 직접 데이터를 전달했다면, 해당 코드를 모두 수정해야 한다.
 */

/*
 * 📌 [3] 기본 DTO 예제
 * - DTO는 필드, 생성자, Getter/Setter만 포함한다.
 */
class UserDTO {
    String name; // 사용자 이름
    int age;     // 사용자 나이
}

/*
 * 📌 [4] DTO 사용 예제
 * - DTO를 사용하여 데이터를 한 번에 전달할 수 있다.
 */
class UserService {
    void saveUser(UserDTO user) {
        System.out.println("사용자 저장: " + user.name + ", " + user.age);
    }
}

/*
 * 📌 [5] DTO를 활용하면 불필요한 데이터 노출을 방지할 수 있다.
 * - 예를 들어, 데이터베이스에서 가져온 전체 사용자 정보를 그대로 보내면 보안 문제가 발생할 수 있다.
 * - DTO를 사용하여 필요한 데이터만 전달하면 보안성이 향상된다.
 */
class SecureUserDTO {
    String name; // 공개 가능한 데이터
    int age;     // 공개 가능한 데이터
    // 비밀번호 같은 중요한 정보는 DTO에 포함하지 않음!
}

/*
 * 📌 [6] DTO의 구조 (Getter/Setter 포함)
 * - 필드(private) + 생성자 + Getter/Setter를 포함할 수 있다.
 */
class UserWithGetterSetterDTO {
	
    private String name;
    private int age;

    // 생성자
    UserWithGetterSetterDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter (값을 가져오는 메소드)
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    // Setter (값을 설정하는 메소드)
    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }
}

/*
 * 📌 [7] DTO를 불변(Immutable) 객체로 만들기
 * - Setter 없이 생성자를 통해 값을 한 번만 설정하면 불변 객체가 된다.
 */
class ImmutableUserDTO {
    private final String name;
    private final int age;

    // 생성자에서 필드를 초기화 (한 번만 설정 가능)
    ImmutableUserDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter만 제공 (Setter 없음 → 불변 객체)
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}

/*
 * 📌 [8] DTO를 사용하면 유지보수가 쉬워진다.
 * - 새로운 필드가 추가되면 DTO만 수정하면 된다.
 * - 기존 코드(메서드 호출 부분)를 변경할 필요가 없다.
 */

/*
 * 📌 [9] DTO를 사용해야 하는 경우
 * ✅ 데이터를 전달할 때 매개변수가 많아질 경우
 * ✅ 데이터를 안전하게 보호하고 싶을 때
 * ✅ 특정 데이터만 전달하고 싶을 때
 * ✅ 유지보수가 쉬운 코드를 만들고 싶을 때
 */

/*
 * 📌 [10] DTO를 사용하지 않아도 되는 경우
 * ❌ 전달할 데이터가 하나 또는 두 개밖에 없는 경우
 * ❌ 간단한 테스트 코드에서는 DTO 없이도 충분할 때
 */

/*
 * 🚀 DTO 정리
 * ✅ DTO는 데이터를 저장하고 전달하는 객체이다.
 * ✅ 데이터를 하나의 객체로 묶어서 전달할 수 있다.
 * ✅ 불필요한 데이터 노출을 막아 보안성을 높일 수 있다.
 * ✅ 유지보수를 쉽게 할 수 있다.
 * ✅ 불변 객체로 만들면 안전성이 향상된다.
 */
