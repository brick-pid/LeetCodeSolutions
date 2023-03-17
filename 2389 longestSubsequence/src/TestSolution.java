import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void test() {
		int[] nums = {4,5,2,1};
		int[] queries = {3, 10, 21};
		Solution s = new Solution();
		s.answerQueries(nums, queries);
	}

}
