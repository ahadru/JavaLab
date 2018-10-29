package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.Calc;

class Testing {

	@Test
	public void test() {
		Calc tester = new Calc();
		assertEquals(12,tester.add(3, 9), "3 + 9 must be 12");
		assertEquals(6,tester.sub(9, 3), "9 - 3 must be 6");
		assertEquals(27,tester.mul(3, 9), "3 * 9 must be 27");
		assertEquals(3,tester.div(3, 9), "9 / 3 must be 3");
	}

}
