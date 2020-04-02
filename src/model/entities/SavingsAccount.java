package model.entities;

public class SavingsAccount extends Acount {
	
	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(int number, String holder, double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance*interestRate;
	}
	

	@Override
	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + "]";
	}
	
	

}
