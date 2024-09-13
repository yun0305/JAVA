package ch15Data_Structure_Collection_Framework.Set_Collection;

public class Member {

	public String name;
	public int age;
	
	public Member(String name,int age) {
		
		this.name = name;
		this.age = age;
		
	}

	@Override
	public int hashCode() {//name 과 age가 같으면 항상 동일한 값이 나온다.
		return this.name.hashCode()+age;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member target) {
			if(target.name.equals(this.name)&&target.age==this.age) {
				return true;
			}		
		}
			return false;
	}
	
}
