package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.BitwiseOperator;
import main.JavaOperators;

class Tests {
	JavaOperators test = new JavaOperators();
	BitwiseOperator bit = new BitwiseOperator();
	
	@Test
	void test() {
		assertEquals(10,test.addition(5, 5));
		assertEquals(2,test.subtraction(8, 6));
		assertEquals(48,test.multiplication(8, 6));
		assertEquals(3,test.divition(15, 5));
	
	}
	
	@Test
	void bitWise() {
		assertEquals(1,bit.and(5, 3));
		assertEquals(7,bit.or(5, 3));
		assertEquals(-6,bit.not(5));
		assertEquals(10,bit.lestShift(5, 1));
		assertEquals(2,bit.rightShift(5, 1));
	}
	
}