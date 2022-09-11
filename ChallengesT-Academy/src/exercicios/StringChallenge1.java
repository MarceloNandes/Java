package exercicios;

public class StringChallenge1 {

	public static String StringChallenge(String str) {

		str = str.toLowerCase();
		str = str.replaceAll("[^a-zZ-Z1-9 ]", " ");
		while (str.contains(" ")) {
			str = str.replaceFirst(" [a-z]", String.valueOf(Character.toUpperCase(str.charAt(str.indexOf(" ") + 1))));
		}
		String token = "1hi0duw7c3";
		String outPutFinal = new StringBuilder(str).reverse().toString() + ":" + new StringBuilder(token).reverse().toString();
		return outPutFinal;
	}

	public static void main(String[] args) {
		String str = "a b c d-e-f%g";
		System.out.print(StringChallenge(str));
	}

}
