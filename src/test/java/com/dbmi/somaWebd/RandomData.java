package com.dbmi.somaWebd;

import java.util.*;

public class RandomData {
	private final char[] alphanumeric = alphanumeric();
	private final Random rand;

	public RandomData() {
		this(null);
	}

	public RandomData(Random rand) {
		this.rand = (rand != null) ? rand : new Random();
	}

	public String get(int len) {
		StringBuffer out = new StringBuffer();

		int counter = 0;
		while (out.length() < len) {
			int idx = Math.abs((rand.nextInt() % alphanumeric.length));
			out.append(alphanumeric[idx]);
			if (++counter == 5) {
				out.append(' ');
				counter = 0;
			}
		}
		return out.toString();
	}

	// create alphanumeric char array
	private char[] alphanumeric() {
		StringBuffer buf = new StringBuffer();
		// for(int i=32; i<= 47;i++)buf.append((char)i); // space-/
		//for (int i = 48; i <= 57; i++)
			//buf.append((char) i); // 0-9
		for (int i = 65; i <= 90; i++)
			buf.append((char) i); // A-Z
		for (int i = 97; i <= 122; i++)
			buf.append((char) i); // a-z
		return buf.toString().toCharArray();
	}
	
	public static String getRandomData3() {
		RandomData rand = new RandomData();
		return (rand.get(3));
	
	}

	public static String getRandomData14() {
		RandomData rand = new RandomData();
		return (rand.get(14));
	
	}
	public static String getRandomData5() {
		RandomData rand = new RandomData();
		return (rand.get(5));
	
	}

	public static String getRandomData25() {
		RandomData rand = new RandomData();
		return (rand.get(25));
	}

	public static String getRandomData250() {
		RandomData rand = new RandomData();
		return (rand.get(250));
	}

	public static String getRandomData1000() {
		RandomData rand = new RandomData();
		return (rand.get(1000));
	}
	public static String getRandomData1024() {
		RandomData rand = new RandomData();
		return (rand.get(1024));
	}
	
	public static String getRandomData2000() {
		RandomData rand = new RandomData();
		return (rand.get(2000));
	}

	public static String getRandomData3000() {
		RandomData rand = new RandomData();
		return (rand.get(3000));
	}

	public static String getRandomData4000() {
		RandomData rand = new RandomData();
		return (rand.get(4000));
	}

	public static void main(String[] args) {
		// RandomData rand=new RandomData();
		System.out.println("10 chars random string=" + getRandomData4000());
		System.out.println(
		// chars random string="+rand.get(128)
				);
	}
}