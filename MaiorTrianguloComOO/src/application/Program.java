package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos trigulos deseja comparar: ");
		int n = sc.nextInt();
		
		Triangulo[] triangulos = new Triangulo[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite as medidas do #" + (i + 1) + " triangulo");
			System.out.print("Digite o lado A: ");
			double a = sc.nextDouble();
			System.out.print("Digite o lado B: ");
			double b = sc.nextDouble();
			System.out.print("Digite o lado C: ");
			double c = sc.nextDouble();
			triangulos[i] = new Triangulo(a, b, c);	
		}
		
		int maiorTriangulo = 0;
		double areaMaiorTriangulo = 0.0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Area triangulo #" + (i + 1) + ": " + triangulos[i].area());
			if (triangulos[i].area() > triangulos[0].area()) {
				areaMaiorTriangulo = triangulos[i].area();
				maiorTriangulo = i + 1;
			}
		}
			
		System.out.println("O maior triangulo é o " + maiorTriangulo + " com area: " + areaMaiorTriangulo);
		
		sc.close();
	}

}
