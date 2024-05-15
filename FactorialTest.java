package com.Factorial.Code;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		Factorial fact= new Factorial();
		int Sum=fact.calculate(2);
		int expected=2;
		assertEquals(expected, Sum);
	}

}
