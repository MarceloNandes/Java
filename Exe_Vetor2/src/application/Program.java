package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar?: ");
		int n = sc.nextInt();
		double soma = 0;
		double[] numeros = new double[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
		}
		System.out.print("Valores = ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("%.1f  ", numeros[i]);

		}

		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}

		System.out.printf("\nSOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f\n", soma / numeros.length);

		sc.close();
	}
}
