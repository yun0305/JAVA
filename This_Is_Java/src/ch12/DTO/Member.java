package ch12.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/*
 * 이제 롬복 라이브러리를 사용해보자. 먼저 다음과 같이 member 클래스를 선언한다. 3개의 필드를 선언하고,
 * class 선언위에 @Date를 붙인다. 이@Date를 어노테이션 이라 하는데, 어노테이션은 12.12절에서 자세히 설명한다
 * 
 * DTO는 데이터를 전달할 목적으로 만든 클래스이다.
 * 
 * 어노테이션으로 Date가 붙게되면 컴파일 과정에서 기본 생성자와 함께 Getter, Setter hashCode(), equals()
 * ,toString() 메소드가 자동 생성된다. Package Explorer 뷰에서 Member 클래스를 확장해보면 알 수 있다.
 * 
 * Data 외에도 다음과 같은 어노테이션을 사용할 수 있다
 * 
 * 어노테이션				설명
 * @NoArgsConstructor	기본 생성자 포함
 * 
 * @AllArgsConstructor 	모든 필드를 초기화시키는 생성자 포함(기본생성자는 사라짐)
 * 
 * @RequiredArgsConstructor 	기본적으로 매개변수가 없는 생성자 포함, 만약 final또는 NonNull이 붙은
 * 								필드가 있다면 이 필드만 초기화시키는 생성자 포함
 * 								
 * 								
 * 
 * @Getter	Getter 메소드 포함
 * 
 * @Setter 메소드 포함
 * 
 * @EqualsAndHashCode	equals() 와 hashCode() 메소드 포함
 * 
 * @ToString	toString() 메소드 포함
 * 
 * @Data 는  @RequiredArgsConstructor,Getter,Setter,EqualsAndHashCode,ToString 어노테이션 들을
 * 합쳐진 것과 동일한 효과를 낸다.
 * 
 * @Data에 포함되어 있는 @RequiredAresConstructor는 기본적으로 매개변수가 없는 생성자를 포함시키지만
 * final 또는 @NonNull이 붙은 필드가 있다면, 이 필드만 초기화시키는 생성자를 포함시킨다.
 * 
 * final과 @NonNull은 null이 아닌 다른 값으로 Setter를 통해 변경할 수 있다는 것입니다.
 * 
 * 
 */


//
//@RequiredArgsConstructor
//public class Member {
//	private final String id;
//	@NonNull private String name;
//	private int age;
	
	
//}
