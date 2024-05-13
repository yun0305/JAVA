package ch12.Object.equals;

public class TakeNotes {
		
	private String id;
	
	public TakeNotes(String id){
		this.id = id;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(obj instanceof Member target) {
			
			if(this.id.equals(target.id)) {
				return true;
			}			
		}
		
		return false;
		
	}
	
	
}
