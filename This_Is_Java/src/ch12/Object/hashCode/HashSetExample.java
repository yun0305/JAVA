package ch12.Object.hashCode;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		
		/*
		 * 15장에서 배울 컬렉션에 속하는 HashSet은 동등객체를 중복 저장하지 않는 특징이 있다.
		 * HashSet은 haseCode() 와 equals() 메소드를 이용해서 동등 객체인지 판단한다.
		 * 
		 * <추가>
		 *  HashSet이 동등 객체를 판단할 때에는 해당 객체의 hashCode()와 equals() 메소드를
		 *  사용하며, 개발자가 이를 재정의하면 원하는 동등성 비교를 할 수 있습니다.
		 *  즉 내가 hashSet.add()에 넣을 객체의 hashCode와 equals 메소드를 직접 재정의해줘서
		 *  어떤기준으로 동등객체인지 정해줄 필요가 있다.
		 *  
		 *  재정의 하지 않을시 결과가 1,2,3 으로나온다
		 *  재정의 할시 1,1,2 로나옴
		 *  
		 */
		HashSet hashset = new HashSet();
		
		Student s1 = new Student(1,"허윤");
		hashset.add(s1);
		System.out.println(hashset.size());

		Student s2 = new Student(1,"허윤");
		hashset.add(s2);
		System.out.println(hashset.size());
		
		Student s3 = new Student(2,"허윤");
		hashset.add(s3);
		System.out.println(hashset.size());
		
		
	}

}
