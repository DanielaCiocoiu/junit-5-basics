package io.home;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils mathUtils  = new MathUtils();
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		mathUtils.add(1, 1);
		assertEquals(expected, actual);
	}

	
	@Test
	void testComputeCircleArea() {
		MathUtils mathUtils  = new MathUtils();
		
		assertEquals(314.159, mathUtils.computeCircleArea(10), "Should return right circle area");
	}
}
