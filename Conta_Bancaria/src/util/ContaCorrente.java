package util;

public class ContaCorrente {
       	
		private int accountNumber;
		private String name;
		private double saldo;
				
		public ContaCorrente(int accountNumber, String name, double initialDeposit) {
			this.accountNumber = accountNumber;
			this.name = name;
			deposit(initialDeposit);
		}
		public ContaCorrente(int accountNumber, String name) {
			this.accountNumber = accountNumber;
			this.name = name;
		}
		public int getAccountNumber() {
			return accountNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSaldo() {
			return saldo;
		}
		public void deposit(double deposit) {
			this.saldo += deposit;
		}
		public void withdraw(double withdraw) {
			this.saldo -=  withdraw + 5.0;
		}		
		public String toString() {
			return "Account: "
					+ accountNumber
					+ ", Holder: "
					+ name
					+ ", Balance: $ "
					+ saldo;
					
		}
}
