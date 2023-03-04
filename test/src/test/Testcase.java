package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testcase {

	@Test
	public void test() {
		Solution solution = new Solution();
		String s = "cbbd";
		System.out.println(solution.longestPalindrome(s));
		assertEquals("bb", solution.longestPalindrome(s));
	}

}
