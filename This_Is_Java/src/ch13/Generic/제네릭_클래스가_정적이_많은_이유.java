package ch13.Generic;

public class 제네릭_클래스가_정적이_많은_이유 {

	
	
	/*https://devlog-wjdrbs96.tistory.com/201
	 * 
	 * 제네릭 메소드가 static으로 정의되는 경우는 흔히 있습니다.
	 *  그 이유는 제네릭 메소드가 주로 타입-독립적인 기능을 수행하기 때문입니다. 
	 *  static 제네릭 메소드는 인스턴스 생성 없이 클래스 이름을 통해 직접 접근할 수 있기 때문에 유틸리티 함수나 도우미(helper) 함수로서 자주 사용됩니다.

		예를 들어, 자바의 Collections 클래스는 다양한 static 제네릭 메소드를 포함하고 있으며,
		이들은 모든 종류의 컬렉션 객체에 대해 작업을 수행할 수 있습니다. 이런 메소드들은 컬렉션 타입에 관계없이 사용할 수 있는
		타입 안전성을 제공합니다. 예를 들면, Collections.max()나 Collections.min() 같은 메소드들이 이에 해당합니다.

		public class Collections {
    		public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll) {
        		Iterator<? extends T> i = coll.iterator();
        		T candidate = i.next();

        		while (i.hasNext()) {
            		T next = i.next();
            		if (next.compareTo(candidate) > 0)
                		candidate = next;
        		}

        		return candidate;
    		}
		}
		이와 대조적으로, 클래스의 특정 인스턴스 상태와 밀접한 관련이 있는 기능에는 static이 아닌 제네릭 메소드가 사용됩니다.
		이 경우 메소드는 클래스의 인스턴스 변수에 접근하거나 수정할 수 있으며, 클래스 타입 파라미터를 활용할 수 있습니다.

		public class Box<T> {
    		private T content;

    		public void setContent(T content) {
        		this.content = content;
    		}

    		public T getContent() {
        		return content;
    		}
		}
		결론적으로, 제네릭 메소드가 static으로 정의되는지 여부는 해당 메소드가 어떤 종류의 작업을 수행하는지,
		그리고 클래스의 인스턴스 상태에 의존하는지 여부에 달려 있습니다. 유틸리티 함수로서의 역할을 할 때는 주로 static으로
		정의되며, 인스턴스에 특화된 기능을 수행할 때는 비-static으로 정의됩니다.
	 * 
	 * 
	 * 
	 * 
	 */
}
