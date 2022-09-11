package application;

import java.util.Locale;
import java.util.Scanner;

import util.ContaCorrente;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaCorrente conta;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)?: ");
		char haveDeposit = sc.next().charAt(0);
		
		if(haveDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			conta = new ContaCorrente(accountNumber, name, deposit);
		} else {
			conta = new ContaCorrente(accountNumber, name);			
		} 
		
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		conta.deposit(deposit);
		System.out.println("Update account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		conta.withdraw(withdraw);
		System.out.println("Update account data:");
		System.out.println(conta);
		
		
		sc.close();
	}

}
