package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		int idadeMaisAlta = 0;
		String pessoaMaisVelha = "";
		Pessoa[] pessoa = new Pessoa[n];
		
		for (int i = 0; i < pessoa.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			pessoa[i] = new Pessoa(name, idade);
		}
		
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdade() > idadeMaisAlta) {
				idadeMaisAlta = pessoa[i].getIdade();
				pessoaMaisVelha = pessoa[i].getName();
			}
		}
		System.out.print("Pessoa mais velha: " + pessoaMaisVelha);
		
		sc.close();	
	}

}
