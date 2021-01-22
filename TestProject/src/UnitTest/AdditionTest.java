package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mainCode.Addition;

class AdditionTest {

	@Test
	void sumTest() {
		Addition add = new Addition();
		int result = add.sum(10, 20);
		assertEquals(30, result);
	}

}
