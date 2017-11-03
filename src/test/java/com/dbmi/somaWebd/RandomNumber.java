package com.dbmi.somaWebd;

import java.util.*;

public class RandomNumber

{
	private final char[] numeric = numeric();
	private final Random rand;

	public RandomNumber() {
		this(null);
	}

	public RandomNumber(Random rand) {
		this.rand = (rand != null) ? rand : new Random();
	}

	public String get(int len) {
		StringBuffer out = new StringBuffer();

		while (out.length() < len) {
			int idx = Math.abs((rand.nextInt() % numeric.length));
			out.append(numeric[idx]);
		}
		return out.toString();
	}

	// create alphanumeric char array
	private char[] numeric() {
		StringBuffer buf = new StringBuffer();
		for (int i = 48; i <= 57; i++)
			buf.append((char) i); // 0-9
		// for(int i=65; i<= 90;i++)buf.append((char)i); // A-Z
		// for(int i=97; i<=122;i++)buf.append((char)i); // a-z
		return buf.toString().toCharArray();
	}

	public static String getRandomNumer25() {
		RandomNumber rand = new RandomNumber();
		return (rand.get(25));
	}
	
	public static String getRandomNumer14() {
		RandomNumber rand = new RandomNumber();
		return (rand.get(14));
	}

	public static String getRandomNumer10() {
		RandomNumber rand = new RandomNumber();
		return (rand.get(10));
	}

	public static String getRandomNumer9() {
		RandomNumber rand = new RandomNumber();
		return (rand.get(9));
	}

	public static String getRandomNumer8() {
		RandomNumber rand = new RandomNumber();
		return (rand.get(8));
	}
	
	public static String getRandomNumer5() {
		RandomNumber rand = new RandomNumber();
		return (rand.get(5));
	}
	public static String getRandomNumer4() {
		RandomNumber rand = new RandomNumber();
		return (rand.get(4));
	}
	
	public static String getRandomNumer3() {
		RandomNumber rand = new RandomNumber();
		return (rand.get(3));
	}
	
	public static String getRandomNumer2() {
		RandomNumber rand = new RandomNumber();
		
		return (rand.get(2));
		/*
		 * public static void main(String[] args){ RandomNumber rand=new
		 * RandomNumber(); System.out.println(
		 * "10 chars random string="+rand.get(10) ); System.out.println(
		 * "128 chars random string="+rand.get(128) ); }
		 */
	}
}