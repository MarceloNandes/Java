package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?: ");
		int n = sc.nextInt();
		double[] numeros = new double[n];
		double maiorValor = 0;
		int posicao = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > maiorValor) {
				maiorValor = numeros[i];
				posicao = i;
			}
		}
		
		System.out.println();
		System.out.println("Maior Valor = " + maiorValor);
		System.out.print("Posicao do maior valor =" + posicao);
		
		sc.close();
	}

}
