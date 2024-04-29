package ch12.Object;

/*
 * 동등객체를 설정할때는 hashCode() 메소드와 equals()메소드를 재정의한다
 * 
 * hashCode는 필드값중 문자열의 해쉬코드와 정수를 합을 리턴하도록 재정의하고
 * 
 * equals() 메소드는 instanceof로 equals() 메소드의 매개값으로 들어오는 객체의 타입이 같은지 확인하고
 * 매개값의 객체와 현재의 객체의 데이터가 같은지 확인한다 이렇게 서로 따로 따로 재정의 한다음에 
 * 
 * 동등객체인지 확인할때 해쉬코드를 먼저 확인해주고 다음에 equals 메소드로 객체를 비교해주면 동등객체인지 확인할수 있다.
 * 
 * 
 * 
 * 
 */
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
