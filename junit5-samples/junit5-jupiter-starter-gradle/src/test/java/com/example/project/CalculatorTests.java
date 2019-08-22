/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals (2, calculator.add(1, 1), "1 + 1 should equal 2");
	}
	@Test
	@DisplayName("1 - 1 = 0")
	void subTwoNumbers(){
		Calculator calculator = new Calculator();
		assertEquals(0,calculator.sub(1,1), "1 - 1 deverá ser igual a 0");
	}
	@Test
	@DisplayName("1 * 1 = 1")
	void multTwoNumbers(){
		Calculator calculator = new Calculator();
		assertEquals(1,calculator.mult(1,1),"1 * 1 deverá ser igual a 1");
	}
	@Test
	@DisplayName("1 * 1 = 1")
	void divTwoNumbers(){
		Calculator calculator = new Calculator();
		assertEquals(1,calculator.div(2,2),"2 / 2 deverá ser igual a 1");
	}
	

	/*@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void add(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.add(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}*/
	
}