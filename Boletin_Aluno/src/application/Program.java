package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String name = sc.nextLine();
		
		System.out.print("Digite a primeira nota do aluno: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota do aluno: ");
		double nota2 = sc.nextDouble();
		
		System.out.print("Digite a terceira nota do aluno: ");
		double nota3 = sc.nextDouble();
		
		Aluno aluno = new Aluno(name, nota1, nota2, nota3);
		
		System.out.printf("Nota Final: %.2f%n", aluno.media());
		
		if(aluno.media() < 60.0) {
			System.out.println("Reprovado!");
			System.out.printf("Pontos Faltando: %.2f%n", aluno.pontosFaltando());				
		} else {
			System.out.println("Aprovado!");
		}	
		sc.close();
	}

}
