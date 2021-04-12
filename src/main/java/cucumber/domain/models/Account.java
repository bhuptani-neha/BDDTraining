package cucumber.domain.models;

public class Account {

	private int balance;

	public void deposit(int amount) {
		balance = balance + amount;
		
	}

	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int amount) {
		this.balance = amount;
		
	}

}
