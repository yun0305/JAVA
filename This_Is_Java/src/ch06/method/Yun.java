package ch06.method;

public class Yun {

	private int ssn; // 객체 필요



	public int getSsn() {
		return ssn;
	}


	public void setSsn(int ssn) {
		this.ssn = ssn;
	}




	public static void main(String[] args) {// 메인 메소드
		
		Yun yun = new Yun();
		yun.getSsn();
		yun.setSsn(010305);
		
	}
	
	
	

}

