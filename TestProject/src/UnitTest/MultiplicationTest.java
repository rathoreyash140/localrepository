package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mainCode.Multiplication;

class MultiplicationTest {

	@Test
	void multiTest() {
		Multiplication mul = new Multiplication();
		int result = mul.mul(5, 6);
		assertEquals(50, result);
	}

}
