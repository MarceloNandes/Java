package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados: ");
		int n = sc.nextInt();
		Aluno[] aluno = new Aluno[n];
		
		for (int i = 0; i < aluno.length; i++) {
			sc.nextLine();
			System.out.printf("Digite nome, Primeira e segunda nota do %do aluno: ", i + 1);
			String name = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			aluno[i] = new Aluno(name, nota1, nota2);
		}
		
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < aluno.length; i++) {
			if ((aluno[i].getNota1() + aluno[i].getNota2()) / 2 >= 6.0) {
				System.out.println(aluno[i].getName());
			}
		}

		
		sc.close();
	}

}
