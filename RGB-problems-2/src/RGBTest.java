import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RGBTest {
	
	@Test
	void testGB() {
		System.out.println("\nstart test case GB:");
		Solution s = new Solution();
		s.findMaxSubstring("GB");
	}
	
	@Test
	void testRRRBBB() {
		System.out.println("\nstart test case RRRBBB:");
		Solution s = new Solution();
		s.findMaxSubstring("RRRBBB");
	}
	
	
	
	@Test
	void testRBBGGR() {
		System.out.println("\nstart test case RBBGGR:");
		Solution s = new Solution();
		s.findMaxSubstring("RBBGGR");
	}
}
