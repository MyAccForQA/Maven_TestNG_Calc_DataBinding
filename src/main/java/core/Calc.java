package core;

import java.math.BigDecimal;

public class Calc {

	public static long sum(long a, long b) {
		return a + b;
	}
	
	public static BigDecimal sum(BigDecimal a, BigDecimal b) {
		return (a.add(b));
	}
}