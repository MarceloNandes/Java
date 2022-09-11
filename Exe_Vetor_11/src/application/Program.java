package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas?: ");
		int n = sc.nextInt();
		Pessoa[] pessoa = new Pessoa[n];
		double menorAltura = 0;
		double maiorAltura = 0;
		double somaAlturaMulheres = 0;
		double mediaAlturaMulheres = 0;
		int homens = 0;
		int mulheres = 0;

		for (int i = 0; i < pessoa.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			double altura = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			char genero = sc.next().toUpperCase().charAt(0);
			pessoa[i] = new Pessoa(genero, altura);
		}

		maiorAltura = pessoa[0].getAltura();
		menorAltura = pessoa[0].getAltura();

		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getAltura() > maiorAltura) {
				maiorAltura = pessoa[i].getAltura();
			}
			if (pessoa[i].getAltura() < menorAltura) {
				menorAltura = pessoa[i].getAltura();
			}
			if ('M' == pessoa[i].getGenero()) {
				homens++;
			}
			if ('F' == pessoa[i].getGenero()) {
				somaAlturaMulheres += pessoa[i].getAltura();
				mulheres++;
			}
		}

		mediaAlturaMulheres = somaAlturaMulheres / mulheres;

		System.out.println("Menor altura = " + menorAltura);
		System.out.println("Maior altura = " + maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
		System.out.println("Numero de homens = " + homens);

		sc.close();
	}

}
