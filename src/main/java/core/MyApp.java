package core;

import java.math.BigDecimal;

public class MyApp {

	public static void main(String[] args) {
		// long
		long actualSum = Calc.sum(1, 1);
		System.out.println(actualSum);	// 2

		actualSum = Calc.sum(Long.MAX_VALUE, 1);
		System.out.println(actualSum);	// -9_223_372_036_854_775_808
		
		// BigDecimal
		BigDecimal x = new BigDecimal(1);
		BigDecimal y = new BigDecimal(1);
		BigDecimal actualSum2 = Calc.sum(x, y);
		System.out.println(actualSum2);	// 2
		
		actualSum2 = Calc.sum(new BigDecimal(Long.MAX_VALUE), y);
		System.out.println(actualSum2);	// 9_223_372_036_854_775_808
	}
}