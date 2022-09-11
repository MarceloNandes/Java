package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.println("Informe a largura e a altura do triangulo: ");
		double largura = sc.nextDouble();
		double altura = sc.nextDouble();
		Retangulo trig = new Retangulo(altura, largura);
		
		System.out.printf("AREA: %.2f%n", trig.area());
		System.out.printf("PERIMETRO: %.2f%n", trig.perimetro());
		System.out.printf("DIAGONAL: %.2f%n", trig.diagonal());
		
		sc.close();
	}

}
