package ch11.exception.User_Exception;

public class Account_Example {

	public static void main(String[] args) {
		Account at = new Account();
		
		at.deposit(10000);
		System.out.println("현재 예금금액 : "+at.getBalance());
		
		try {
		at.withdraw(30000);
		}catch(InsufficienException e){
			System.err.println(e.getMessage());
		}finally {
			System.out.println("현재 예금금액 : "+at.getBalance());
		}
		System.out.println("프로그램 정상 종료");
	}
}
