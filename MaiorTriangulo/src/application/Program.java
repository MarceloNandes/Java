package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as medidas do triangulo x:");
		double xA = sc.nextDouble();
		double xB = sc.nextDouble();
		double xC = sc.nextDouble();
		System.out.println("Digite as medidas do triangulo y:");
		double yA = sc.nextDouble();
		double yB = sc.nextDouble();
		double yC = sc.nextDouble();

		double xP = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(xP * (xP - xA) * (xP - xB) * (xP - xC));

		double yP = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(yP * (yP - yA) * (yP - yB) * (yP - yC));

		System.out.printf("Area triangulo X: %.2f%n", areaX);
		System.out.printf("Area triangulo Y: %.2f%n", areaY);

		if (areaX > areaY) {
			System.out.println("O maior area é do triangulo X");
		} else {
			System.out.println("O maior area é do triangulo Y");
		}

		sc.close();
	}
}