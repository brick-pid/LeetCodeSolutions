import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class test3sum {

	@Test
	void test() {
		int[] nums = {-1,0,1,2,-1,-4};
		List<List<Integer>> expect = new LinkedList<>();
		expect.add(Arrays.asList(-1, -1, 2));
		expect.add(Arrays.asList(-1, 0, 1));
		assertEquals(expect, new sum3().threeSum(nums));
	}

}
