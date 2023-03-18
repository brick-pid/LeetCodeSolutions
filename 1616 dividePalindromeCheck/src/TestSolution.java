import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSolution {

	@Test
	void testIsPalindrome() {
		System.out.println("Starting Test isPalindrome");
		String s1 = "";
		String s2 = "a";
		String s3 = "aba";
		String s4 = "baab";
		Solution s = new Solution();
		assertEquals(s.isPalindrome(s1), true);
		assertEquals(s.isPalindrome(s2), true);
		assertEquals(s.isPalindrome(s3), true);
		assertEquals(s.isPalindrome(s4), true);
	}
	
	@Test
	void testMainFunction() {
		String a = "x";
		String b = "j";
		assertEquals(new Solution().checkPalindromeFormation(a, b), true);
		
	}
	
	@Test
	void testMainFunctionComplex() {
		String a = "ulacfd";
		String b = "jizalu";
		assertEquals(new Solution().checkPalindromeFormation(a, b), true);
		
	}
}
