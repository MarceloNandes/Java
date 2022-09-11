package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas contas seram cadastradas: ");
		int n = sc.nextInt();
		Conta[] contas = new Conta[n];
		
		for (int i = 0; i < contas.length; i++) {
			sc.nextLine();
			System.out.println("Dados " + (i + 1) + "# conta");
			System.out.print("Digite o nome do dono da conta: ");
			String name = sc.nextLine();
			System.out.print("Digite o numero da conta: ");
			int number = sc.nextInt();
			System.out.print("Digite o saldo inicial da conta: ");
			double balance = sc.nextDouble();
			contas[i] = new Conta(name , number, balance);
		
		
			System.out.print("Quanto deseja depositar: ");
			double deposit = sc.nextDouble();
			contas[i].Deposit(deposit);
		
			System.out.print("Quanto deseja sacar: ");
			double withdraw = sc.nextDouble();
			contas[i].Withdraw(withdraw);
		}
		
		
		for (int i = 0; i < n; i++) {
			System.out.println(contas[i]);
		}
		
		sc.close();
	}

}
