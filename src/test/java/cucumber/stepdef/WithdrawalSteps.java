package cucumber.stepdef;

import org.junit.Assert;

import cucumber.domain.helpers.DomainHelper;
import cucumber.domain.models.Account;
import cucumber.domain.models.CashSlot;
import cucumber.domain.models.Teller;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WithdrawalSteps {

	private DomainHelper helper;
	
	public WithdrawalSteps() {
		helper = new DomainHelper();
	}
	
	@Given("I have a balance of ${int} in my account")
	public void iHaveABalanceOf$InMyAccount(int amount) {
	    helper.getAccount().deposit(amount);
	    Assert.assertEquals(amount, helper.getAccount().getBalance());
	    
	}

	@When("I request ${int}")
	public void iRequest$(int requestedAmount) {
	    helper.getTeller().withDrawCash(helper.getAccount(),requestedAmount);
	}
	
	@Then("${int} should be dispensed")
	public void $ShouldBeDispensed(int dispensedAmount) {
	   Assert.assertEquals(dispensedAmount,helper.getCashSlot().getCashBalance());
	}
	
	@Then("I should have balance of ${int} in my account")
	public void i_should_have_balance_of_$_in_my_account(int RemainingBalance) {
		Assert.assertEquals(RemainingBalance,helper.getAccount().getBalance() -helper.getCashSlot().getCashBalance());
	}
}
