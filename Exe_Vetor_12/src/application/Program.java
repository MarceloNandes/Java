package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Locador;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos serao alugados?: ");
		int n = sc.nextInt();
		Locador[] quartos = new Locador[10];
				
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Locador #" + (i+1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			quartos[quarto] = new Locador(nome, email);
		}
		
		System.out.println();
		System.out.println("Quarto ocupados:");
		
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.println(i + ": " + quartos[i]);
			}
		}
		
		sc.close();
	}

}
