package cucumber.domain.models;

public class CashSlot {

	private int cashBalance;

	public int getCashBalance() {
		return cashBalance;
	}

	public void dispense(int requestedAmount) {
		
		cashBalance = requestedAmount;
	}

}
