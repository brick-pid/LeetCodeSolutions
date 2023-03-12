import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		String[] input = {"A", "1"};
		String[] actual = new Solution().findLongestSubarray(input);
		Arrays.stream(actual).forEach(item -> System.out.print(item + " "));
		System.out.println();
	}
	
	@Test
	void test3() {
		String[] input = {"A", "1", "1"};
		String[] actual = new Solution().findLongestSubarray(input);
		Arrays.stream(actual).forEach(item -> System.out.print(item + " "));
		System.out.println();
	}
	
	@Test
	void test2() {
		String[] input = {"A","1","B","C","D","2","3","4","E","5","F","G","6","7","H","I","J","K","L","M"};
		String[] actual = new Solution().findLongestSubarray(input);
		Arrays.stream(actual).forEach(item -> System.out.print(item + " "));
		System.out.println();
	}
}
