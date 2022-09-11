package exercicios;

public class MathChallenge1 {

	public static int MathChallenge(int num1, int num2) {
		int multiploComum = 0;

		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				multiploComum = i;
			}
		}
		return multiploComum;
	}
	public static void main (String[] args) {
	System.out.print(MathChallenge(54, 7));
	}
}

