package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o nome do funcionario: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite o salario do funcionario: ");
		double salarioBruto = sc.nextDouble();
		
		System.out.println("Digite a taxa do salario do funcionario: ");
		double tax = sc.nextDouble();
		
		Funcionario fun = new Funcionario(nome, salarioBruto, tax);
		
		System.out.println();
		System.out.println("Funcionario: "+ fun);
		System.out.println();
		System.out.println("Quer dar um aumento de quantos %: ");
		double percentage = sc.nextInt();
		fun.aumento(percentage);
		
		System.out.println();
		System.out.println("Atualização: "+ fun);
				
		sc.close();
	}

}
