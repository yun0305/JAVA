package ch12.Object.equals;

public class TakeNotes {
		
	private String id;
	
	public TakeNotes(String id){
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof TakeNotes args) {
			
			if(args.id.equals(this.id)) {
				return true;
			}
			else {
				return false;
			}
			
		}
		return false;
		
	}
	
}
