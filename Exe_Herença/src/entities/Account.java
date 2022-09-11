package entities;

public class Account {	
	
	private Integer number;
	private String holdes;
	protected Double balance;
	
	public Account() {
	}

	public Account(Integer number, String holdes, Double balance) {
		this.number = number;
		this.holdes = holdes;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHoldes() {
		return holdes;
	}

	public void setHoldes(String holdes) {
		this.holdes = holdes;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
}
