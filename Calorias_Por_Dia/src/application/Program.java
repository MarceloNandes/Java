package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		int peso = sc.nextInt();
		System.out.print("Digite sua altura em centímetros: ");
		int altura = sc.nextInt();
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.print("Vocé é homen ou mulher (H/M): ");
		char hm = sc.next().charAt(0);
		double resultado = 0;
		
		if (hm == 'H') {
			resultado = ((13.75 * peso) + (5 * altura) - (6.76 * idade) + 66.5);
		} 
		if (hm == 'M') {
			resultado = ((9.56 * peso) + (1.85 * altura) - (4.68 * idade) + 665);
		}
		
		System.out.print("Vocé é 1-sedentario, 2-levemente ativo, 3-moderadamente ativo, 4-muito ativo, 5-extremamente ativo: ");
		int atividade = sc.nextInt();
		
		
		switch (atividade) {
		case 1 :
			resultado = resultado * 1.2;
		    System.out.printf("Calorias nessesarias: %.2f%n", resultado);
		break;
		case 2 :
			resultado = resultado * 1.375;
		    System.out.printf("Calorias nessesarias: %.2f%n", resultado);
		break;
		case 3 :
			resultado = resultado * 1.55;
		    System.out.printf("Calorias nessesarias: %.2f%n", resultado);
		break;
		case 4 :
			resultado = resultado * 1.725;
		    System.out.printf("Calorias nessesarias: %.2f%n", resultado);
		break;
		case 5 :
			resultado = resultado * 1.9;
		    System.out.printf("Calorias nessesarias: %.2f%n", resultado);
		break;
		default:
			System.out.printf("Opção invalida");
		}
		
		
		
		sc.close();
	}

}
