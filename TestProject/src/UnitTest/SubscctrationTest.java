package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mainCode.Subsctration;

class SubscctrationTest {

	@Test
	void subTest() {
		Subsctration sub = new Subsctration();
		int res = sub.minus(30, 10);
		assertEquals(20, res);
	}

}
