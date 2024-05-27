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
	
	@Override
	public boolean equals(Object obj) {
	
		if(obj instanceof TakeNotes target){
			
			if(target.name.equals(this.name)) {
				
				return true;
			}
			
			
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id+name.hashCode();
	}
	
}
