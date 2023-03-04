import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

class SolutionTest {

	@Test
    public void test1() {
        Solution solution = new Solution();
        String digits = "23";
        List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        List<String> actual = solution.letterCombinations(digits);
        System.out.println("expected: " + expected + "\n; Actual"+ actual);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test2() {
        Solution solution = new Solution();
        String digits = "79";
        List<String> expected = Arrays.asList("pw", "px", "py", "pz", "qw", "qx", "qy", "qz", "rw", "rx", "ry", "rz", "sw", "sx", "sy", "sz");
        List<String> actual = solution.letterCombinations(digits);
        System.out.println("expected: " + expected + "\n; Actual"+ actual);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test3() {
        Solution solution = new Solution();
        String digits = "";
        List<String> expected = new ArrayList<>();
        List<String> actual = solution.letterCombinations(digits);
        System.out.println("expected: " + expected + "\n; Actual"+ actual);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test4() {
        Solution solution = new Solution();
        String digits = "2";
        List<String> expected = Arrays.asList("a", "b", "c");
        List<String> actual = solution.letterCombinations(digits);
        assertEquals(expected, actual);
    }
    
    @Test
    public void test5() {
        Solution solution = new Solution();
        String digits = "999";
        List<String> expected = new ArrayList<>();
        List<String> actual = solution.letterCombinations(digits);
        System.out.println("expected: " + expected + "\n; Actual"+ actual);
        assertEquals(expected, actual);
    }


}
