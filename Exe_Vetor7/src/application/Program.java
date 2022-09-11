package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor?: ");
		int n = sc.nextInt();
		double[] numbers = new double[n];

		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um numero: ");
			numbers[i] = sc.nextDouble();
		}

		double media = 0;

		for (int i = 0; i < numbers.length; i++) {
			media += numbers[i]/numbers.length;
		}
		System.out.println();
		System.out.println("Media do Vetor = " + media);

		System.out.println("Elementos abaixo da media:");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < media) {
				System.out.println(numbers[i]);
			}
		}

		sc.close();

	}

}
