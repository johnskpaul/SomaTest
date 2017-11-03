package com.dbmi.somaWebd;

import java.util.Calendar;
import java.util.Random;

public class RandomDate {

	static Random random = new Random();

	// generate a random date from today (inclusive) to 10 years in the future
	// NOTE: THIS DOES NOT HANDLE LEAP YEARS CORRECTLY! It will never generate a
	// 29th day in February
	// generate a random date from 5 years ahead to 10 years in the future
	public static String getRandomDate510() {

		Calendar date = Calendar.getInstance();
		int currentYear = date.get(Calendar.YEAR);
		int currentMonth = date.get(Calendar.MONTH);
		int currentDay = date.get(Calendar.DAY_OF_MONTH);

		Integer randomYear = new Integer(getRandomInRange(currentYear + 5,
				currentYear + 10));
		Integer randomMonth;
		Integer randomDay;
		if (randomYear.intValue() == currentYear)
			randomMonth = new Integer(getRandomInRange(currentMonth, 11));
		else
			randomMonth = new Integer(getRandomInRange(0, 11));

		if (randomMonth.intValue() == currentMonth
				&& randomYear.intValue() == currentYear)
			randomDay = new Integer(getRandomInRange(currentDay,
					lastDayOfMonth(randomMonth)));
		else
			randomDay = new Integer(getRandomInRange(1,
					lastDayOfMonth(randomMonth)));

		return dateIntegersToString(randomMonth + 1, randomDay, randomYear); 
	}

	// generate random date from current to 5 years ahead
	public static String getRandomDate5() {

		Calendar date = Calendar.getInstance();
		int currentYear = date.get(Calendar.YEAR);
		int currentMonth = date.get(Calendar.MONTH);
		int currentDay = date.get(Calendar.DAY_OF_MONTH);

		Integer randomYear = new Integer(getRandomInRange(currentYear,
				currentYear + 5));
		Integer randomMonth;
		Integer randomDay;
		if (randomYear.intValue() == currentYear)
			randomMonth = new Integer(getRandomInRange(currentMonth, 11));
		else
			randomMonth = new Integer(getRandomInRange(0, 11));

		if (randomMonth.intValue() == currentMonth
				&& randomYear.intValue() == currentYear)
			randomDay = new Integer(getRandomInRange(currentDay,
					lastDayOfMonth(randomMonth)));
		else
			randomDay = new Integer(getRandomInRange(1,
					lastDayOfMonth(randomMonth)));

		return dateIntegersToString(randomMonth + 1, randomDay, randomYear); 
	}

	// generate Random date between past 5 to current date
	public static String getRandomPastDate5() {

		Calendar date = Calendar.getInstance();
		int currentYear = date.get(Calendar.YEAR);
		int currentMonth = date.get(Calendar.MONTH);
		int currentDay = date.get(Calendar.DAY_OF_MONTH);

		Integer randomYear = new Integer(getRandomInRange(currentYear,
				currentYear - 5));
		Integer randomMonth;
		Integer randomDay;
		if (randomYear.intValue() == currentYear)
			randomMonth = new Integer(getRandomInRange(0, currentMonth));
		else
			randomMonth = new Integer(getRandomInRange(0, 11));

		if (randomMonth.intValue() == currentMonth
				&& randomYear.intValue() == currentYear)
			randomDay = new Integer(getRandomInRange(currentDay,
					lastDayOfMonth(randomMonth)));
		else
			randomDay = new Integer(getRandomInRange(1,
					lastDayOfMonth(randomMonth)));

		return dateIntegersToString(randomMonth + 1, randomDay, randomYear); 
	}

	// generate Random date between past 5 to 10 years
	public static String getRandomPastDate510() {

		Calendar date = Calendar.getInstance();
		int currentYear = date.get(Calendar.YEAR);
		int currentMonth = date.get(Calendar.MONTH);
		int currentDay = date.get(Calendar.DAY_OF_MONTH);

		Integer randomYear = new Integer(getRandomInRange(currentYear - 5,
				currentYear - 10));
		Integer randomMonth;
		Integer randomDay;
		if (randomYear.intValue() == currentYear)
			randomMonth = new Integer(getRandomInRange(0, currentMonth));
		else
			randomMonth = new Integer(getRandomInRange(0, 11));

		if (randomMonth.intValue() == currentMonth
				&& randomYear.intValue() == currentYear)
			randomDay = new Integer(getRandomInRange(currentDay,
					lastDayOfMonth(randomMonth)));
		else
			randomDay = new Integer(getRandomInRange(1,
					lastDayOfMonth(randomMonth)));

		// System.out.println(RandomDate.getRandomPastDate5());

		return dateIntegersToString(randomMonth + 1, randomDay, randomYear); 
	}

	
	
	
	// generate a random number between min and max (inclusive of min and max)
	private static int getRandomInRange(int min, int max) {
		double randomD = random.nextDouble();
		double randVal = (((double) (max - min)) * randomD) + min;
		return ((new Double(Math.round(randVal))).intValue());
	}

	private static int lastDayOfMonth(int month) {
		if (month == 0)
			return (31);
		else if (month == 1)
			return (28);
		else if (month == 2)
			return (31);
		else if (month == 3)
			return (30);
		else if (month == 4)
			return (31);
		else if (month == 5)
			return (30);
		else if (month == 6)
			return (31);
		else if (month == 7)
			return (31);
		else if (month == 8)
			return (30);
		else if (month == 9)
			return (31);
		else if (month == 10)
			return (30);
		else if (month == 11)
			return (31);
		else
			return (0);

	}
	
	private static String dateIntegersToString(Integer month, Integer day, Integer year) {
		return (month.toString() + "/" + day.toString() + "/" + year
				.toString());
	}
}
