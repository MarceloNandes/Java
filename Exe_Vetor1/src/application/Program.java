package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar?: ");
		int n = sc.nextInt();
		int[] numero = new int[n];

		for (int i = 0; i < numero.length; i++) {
			System.out.print("Digite um numero: ");
			numero[i] = sc.nextInt();
		}

		System.out.println("Numeros Negativos:");

		for (int i = 0; i < numero.length; i++) {
			if (numero[i] < 0) {
				System.out.printf("%d\n", numero[i]);
			}
		}
		sc.close();
	}

}
