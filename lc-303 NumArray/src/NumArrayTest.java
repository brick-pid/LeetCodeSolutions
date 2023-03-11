import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumArrayTest {

//	@Test
//	void testPreSum() {
//		int[] a = {3, 5, 2, -2, 4, 1};
//		int[] expect = {0, 3, 8, 10, 8, 12, 13};
//		int[] actual = new NumArray(a).getPreSum();
//		assertEquals(actual, expect);
//	}
	
	@Test
	void test() {
		int[] a = {3, 5, 2, -2, 4, 1};
		int expect = 9;
		int actual = new NumArray(a).sumRange(1, 4);
		assertEquals(actual, expect);
	}
}
