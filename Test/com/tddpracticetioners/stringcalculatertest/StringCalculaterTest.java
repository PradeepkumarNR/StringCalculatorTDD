package com.tddpracticetioners.stringcalculatertest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tddpracticetioners.stringcalculator.StringCalculater;

class StringCalculaterTest {

	StringCalculater stringcalculater;

	@BeforeEach
	public void setup() {
		stringcalculater = new StringCalculater();
	}

	@Test
	public void should_return_zero_ifThe_inputString_isEmpty() throws Exception {

		assertEquals(stringcalculater.calculatestring(""), 0);

	}

	@Test
	public void should_return_singleValueIn_Integer_ifThe_inputString_isSingleValue() throws Exception {

		assertEquals(stringcalculater.calculatestring("1"), 1);

	}

	@Test
	public void should_return_sumOf_2Comma_Delimited_numbers() throws Exception {

		assertEquals(3, stringcalculater.calculatestring("1,2"));

	}

	@Test
	public void should_return_sumOf_2newLine_Delimited_numbers() throws Exception {

		assertEquals(3, stringcalculater.calculatestring("1\n2"));

	}

	@Test
	public void should_return_sum_of_3inputs_delimitedInAnyWay() throws Exception {

		assertEquals(6, stringcalculater.calculatestring("1,2,3"));
		assertEquals(6, stringcalculater.calculatestring("1\n2\n3"));

	}

	@Test
	public void should_throw_exception_ifInput_isNegative() {
		Assertions.assertThrows(Exception.class, () -> stringcalculater.calculatestring("-1"));
	}

	@Test
	public void should_ignore_if_AnyDigit_exceeds1000() throws Exception {

		assertEquals(20, stringcalculater.calculatestring("10,10,1001"));

	}

	/*
	 * @Test void
	 * should_return_doublevalue_Integer_ifThe_inputString_isDoubleValue() throws
	 * Exception {
	 * 
	 * assertEquals(stringcalculater.calculatestring("12"), 12);
	 * 
	 * }
	 * 
	 * @Test void
	 * should_return_3Digitvalue_Integer_ifThe_inputString_is3DigitValue() throws
	 * Exception {
	 * 
	 * assertEquals(stringcalculater.calculatestring("123"), 123);
	 * 
	 * }
	 */

}
