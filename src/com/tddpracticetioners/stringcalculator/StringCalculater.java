package com.tddpracticetioners.stringcalculator;

import java.util.Iterator;

public class StringCalculater {

	private static final String Delimiter = ",|\n";

	public int calculatestring(String input) throws Exception {

		String[] numbers = input.split(Delimiter);

		if (isEmpty(input)) {
			return 0;
		}

		else if (input.length() == 1) {
			return StringtoInt(input);
		}

		else {
			return getSumIfValuesWithDelimiter(numbers);
		}

	}

	private int getSumIfValuesWithDelimiter(String[] numbers) throws Exception {

		CheckForNegativeNumbersAndThrowException(numbers);

		return CalculateValues(numbers);
	}

	private int CalculateValues(String[] numbers) {
		int sum = 0;
		for (String string : numbers) {
			if (StringtoInt(string) > 1000) {
				continue;
			}
			sum += StringtoInt(string);
		}
		return sum;
	}

	private void CheckForNegativeNumbersAndThrowException(String[] numbers) throws Exception {
		for (String string : numbers) {
			if (StringtoInt(string) < 0) {
				throw new Exception("no negative numbers");
			}
		}
	}

	private boolean isEmpty(String input) {
		return input.isEmpty();
	}

	private int StringtoInt(String input) {
		return Integer.parseInt(input);
	}

}
