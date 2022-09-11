package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar?: ");
		int n = sc.nextInt();
		int[] numeros = new int[n];
		int pares = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.print("Numeros Pares: ");
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				pares++;
				System.out.printf(numeros[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Quantidade de Pares = " + pares);
		sc.close();
	}

}
