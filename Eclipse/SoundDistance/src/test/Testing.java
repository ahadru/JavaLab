package test;
import main.Sound;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {
	Sound sound = new Sound();

	@Test
	void sTest() {
		assertEquals(sound.calculateDistance(7.2), 7920.0, "");
	}

	@Test
	void sTest2() {
		assertEquals(sound.calculateDistance(11), 12100.0, "");
	}

	@Test
	void sTest3() {
		assertEquals(sound.calculateDistance(10), 11000.0, "");
	}
}
