package ch12.Object.hashCode;

public class TakeNotes {
		
	private int no;
	private String name;
	
	public TakeNotes(int no, String name) {
		this.no = no;
		this.name = name;
		
	}
	
	public int getNumber() {
		return this.no;
	}
	
	public String getName() {
		return this.name;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student target) {
			
			if(getName().equals(target.getName())) {
				return true;
			}
			
		}
		
		return false;
		
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.no+this.name.hashCode();
	}
	
	
}
