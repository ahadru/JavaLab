package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.TS;

class Testing {
	TS ob = new TS();
	
	@Test
	void testOperateBuy() {
		assertEquals(true, ob.OperateBuy(3), "answer should to be true");
	}

	@Test
	void testGetSoldTickets() {
		assertEquals(10, ob.getSoldTickets(), "buyed ticket");
	}

	@Test
	void testGetBuyer() {
		assertEquals(1, ob.getBuyer(), "buyer");
	}
}
