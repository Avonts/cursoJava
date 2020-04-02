package model.entities;

public abstract class Acount {

	private int number;
	private String holder;
	protected double balance;

	public Acount() {}
	
	public Acount(int number, String holder, double balance) {
		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double valor) {
		
		if(valor<this.balance-5)
			this.balance -= valor+5;
	}
	
	public void deposit(double valor) {
		
		if(valor>0) {
			this.balance += valor;
		}else {
			System.out.println("Valor para deposito deve ser maior que Zero!");
		}
			
	}

	
	
	
}
