package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos pessoas serao digitadas?: ");
		int n = sc.nextInt();
		Pessoa[] pessoa = new Pessoa[n];

		for (int i = 0; i < pessoa.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			pessoa[i] = new Pessoa(name, idade, altura);
		}

		double media = 0;
		double menores = 0;

		for (int i = 0; i < pessoa.length; i++) {
			media += pessoa[i].getAltura() / pessoa.length;
		}

		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				menores++;
			}
		}
		double percentualMenores = ((double) menores / n) * 100.0;

		System.out.printf("\nAltura media = %.2f\n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getName());
			}
		}

		sc.close();
	}

}
