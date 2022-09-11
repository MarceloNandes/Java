package entities;

public class Conta {
	
	private String name;
	private int number;
	private double balance;
	
	public Conta () {
	}
	
	public Conta(String name, int number, double balance) {
		this.name = name;
		this.number = number;
		this.balance = balance;
	}
	
	public void Deposit (double deposit) {
		balance += deposit;
	}
	
	public void Withdraw (double withdraw) {
		if (balance > withdraw) {
		balance -= withdraw;
		} else {
			System.out.println("Saque não autorizado, sem saldo suficiente!");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String toString() {
		return "Conta: " + number + 
				" Nome: " + name + 
				" Saldo: " + balance;
	}
	
}
