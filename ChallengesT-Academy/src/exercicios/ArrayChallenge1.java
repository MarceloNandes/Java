package exercicios;


public class ArrayChallenge1 {

	public static String ArrayChallenge(String[] strArr) {
		String palavraParaSeparar = strArr[0];
		String dicionario = strArr[1];

	    for (int i = palavraParaSeparar.length() - 1; i > 0; i--) {
	        String firstWord = palavraParaSeparar.substring(0, i);
	        String lastWord = palavraParaSeparar.substring(i);

	        if (dicionario.contains(firstWord) && dicionario.contains(lastWord)) {
	        	String resultado =  firstWord + "," + lastWord;
	        	String resultadoInvertido = new StringBuilder(resultado).reverse().toString();
	        	return resultadoInvertido;
	        }
	    }
	    return "not possible";
	}
	
	

	public static void main(String[] args) {
		String[] strArr = {"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"};
		System.out.println(ArrayChallenge(strArr));
	}

}