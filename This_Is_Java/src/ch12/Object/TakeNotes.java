package ch12.Object;

public class TakeNotes {

	private int id;
	private String name;
	
	public TakeNotes(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		
		return id+name.hashCode();
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof TakeNotes target) {
			
			if(target.getName().equals(this.name) && target.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		 TakeNotes tn1 = new TakeNotes(1,"허윤");
		 TakeNotes tn2 = new TakeNotes(1,"허윤");
		 
		 if(tn1.hashCode() == tn2.hashCode()) {
			
			 if(tn1.equals(tn2)) {
				 System.out.println("동등 객체입니다.");
			 }
			 
		 }
		 else {
			 System.out.println("해쉬코드가 다릅니다");
		 }
	}
	
}
