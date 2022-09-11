package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor?: ");
		int n = sc.nextInt();
		int[] numbers = new int[n];
		int somaPares = 0;
		int contador = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um numero: ");
			numbers[i] = sc.nextInt();
			if (numbers[i] % 2 == 0) {
				somaPares += numbers[i];
				contador++;
			}
		}
		
		
		if (contador == 0) {
			System.out.println("Nenhum numero par");
		} 
		else {		
			System.out.print("Media dos pares = " + somaPares / contador);
		}
		

		sc.close();
	}

}
