package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;

import main.Calculator;

class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		// Implement
		int expectedResult = 2 + 3;
		int actualResult = calculator.add(2, 3);

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void Should_substract_two_numbers_and_return_result() {
		// Implement
		int expectedResult = 5 - 2;
		int actualResult = calculator.sub(5, 2);

		assertEquals(expectedResult, actualResult);

	}

	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		// Implement
		int expectedResult = 5 * 2;
		int actualResult = calculator.multiply(5, 2);

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void Should_divide_two_numbers_and_return_result() {
		// Implement
		
		float expectedResult = 6/ 2;
		float actualResult = calculator.divide(6, 2);

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		// Implement
		float actualResult = calculator.divide(0, 2);
		Assert.assertThrows(ArithmeticException.class, null);
	}
}
