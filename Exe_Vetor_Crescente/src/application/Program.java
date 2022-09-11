package application;

public class Program {
	
	public static void main(String[] args) {
	
	int [] numeros = { 30, 54, 56, 1, 60, 45, 79, 67,
			30, 30 };
	
	for(int i = 0; i < numeros.length; i++) {
		for(int j = 0; j <numeros.length; j++) {
			if (numeros[i] < numeros[j]) {
				int aux = numeros[i];
				numeros[i] = numeros[j];
				numeros[j] = aux;
			}
		}
	}
	for(int i = 0; i < numeros.length; i++) {
		System.out.print(numeros[i] + " ");
	}
	
	
	
	
	}
}
