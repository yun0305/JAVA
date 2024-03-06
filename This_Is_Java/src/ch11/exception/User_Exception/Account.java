package ch11.exception.User_Exception;

public class Account {

	private long balance;//잔고
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {//예금
		balance += money;
	}
	
	public void withdraw(int money) throws InsufficienException {//출금
		
		if(balance<money) {
			throw new InsufficienException("잔고부족");
		}
		else {
			balance -= money;
		}
	}
	
}
