package util;

public class CurrencyConverter {
	
	public static final double IOF = 6.00;
	
	public static double valorConvertido(double priceDollar, double dollars) {
		return priceDollar * dollars + priceDollar * dollars * IOF/100;
	}

}
