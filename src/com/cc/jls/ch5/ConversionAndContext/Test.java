package com.cc.jls.ch5.ConversionAndContext;

public class Test {

	public static void main(String[] args) {
		int big = 1234567890;
		float approx = big;
		System.out.println(big - (int) approx);

		testNarrowPrimitiveConversion();
		
	}

	public static void testNarrowPrimitiveConversion() {
		
		System.out.println("===============NarrowPrimitiveConversion===============");
		float fmin = Float.NEGATIVE_INFINITY;
		float fmax = Float.POSITIVE_INFINITY;
		System.out.println("long: " + (long) fmin + ".." + (long) fmax);
		System.out.println("int: " + (int) fmin + ".." + (int) fmax);
		System.out.println("short: " + (short) fmin + ".." + (short) fmax);
		System.out.println("char: " + (int) (char) fmin + ".."
				+ (int) (char) fmax);
		System.out.println("byte: " + (byte) fmin + ".." + (byte) fmax);
		
	}

}
