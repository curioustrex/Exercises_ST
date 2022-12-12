package test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import main.Calendar;

class TestCalendar {

	Calendar calendar;
	GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();

	@ParameterizedTest
	@ValueSource(ints = { 1920, 1916, 1996, 1904, 1960 })
	public void Should_return_true(int year) {
		// Implement

		calendar = new Calendar(year);
		boolean expectedResult = cal.isLeapYear(year);
		boolean actualResult = calendar.isLeapYear();
		assertEquals(expectedResult, actualResult);
		
	}

	@ParameterizedTest
	@ValueSource(ints = { 1825, 1919, 1955, 2002, 2021 })
	public void Should_return_false(int year) {
		// Implement
		calendar = new Calendar(year);
		boolean expectedResult = cal.isLeapYear(year);
		boolean actualResult = calendar.isLeapYear();
		
		assertFalse(expectedResult == actualResult);

	}

	@ParameterizedTest
	@ValueSource(ints = {1904, 1912, 1908, 1996, 1992})
	public void Should_return_if_year_is_leap(int year) {
		// Implement
		calendar = new Calendar(year);
		boolean expectedResult = cal.isLeapYear(year);
		boolean actualResult = calendar.isLeapYear();
		
		if(actualResult == expectedResult) {
			assertTrue(expectedResult);
		} else {
			assertFalse(expectedResult);
		}
		
	}

	// Create a new method for boundary testing
	
	@ParameterizedTest
	@ValueSource(ints = {1904, 1912, 1908, 1964, 1988})
	public void is_range_acceptable(int year) {
		calendar = new Calendar(year);
		if(year >= 1900 && year <2000) {
			assertTrue(calendar.isLeapYear());
		} else {
			assertFalse(calendar.isLeapYear());
		}
	}
	
}
