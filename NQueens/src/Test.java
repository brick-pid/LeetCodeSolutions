import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test1Queens() {
		System.out.println("Test N = 1");
		System.out.println(new Solution().totalNQueens(1));
		assertEquals(1, new Solution().totalNQueens(1));
	}
	
	@org.junit.jupiter.api.Test
	void test4Queens() {
		System.out.println("Test N = 4");
		System.out.println(new Solution().totalNQueens(4));
		assertEquals(2, new Solution().totalNQueens(4));
	}
	
	@org.junit.jupiter.api.Test
	void test8Queens() {
		System.out.println("Test N = 8");
		System.out.println(new Solution().totalNQueens(8));
		assertEquals(92, new Solution().totalNQueens(8));
	}
	
	@org.junit.jupiter.api.Test
	void test10Queens() {
		System.out.println("Test N = 10");
		System.out.println(new Solution().totalNQueens(10));
		assertEquals(724, new Solution().totalNQueens(10));
	}
}
