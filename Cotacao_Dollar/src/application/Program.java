package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What id the dollar price?: ");
		double priceDollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought?: ");
		double dollars = sc.nextDouble();
		
		double reais = CurrencyConverter.valorConvertido(priceDollar, dollars);
		
		System.out.printf("Amount to be pais in reais: %.2f%n", reais);
		
		sc.close();
	}

}
