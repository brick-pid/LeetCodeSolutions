import org.junit.Test;
import org.junit.Assert;
import java.util.List;

public class SolutionTest {

    @Test
    public void testExample1() {
        int[] candidates = {2,3,6,7};
        int target = 7;
        Solution solution = new Solution();
        List<List<Integer>> result = solution.combinationSum(candidates, target);
        List<List<Integer>> expected = List.of(List.of(2, 2, 3), List.of(7));
        System.out.println("Expect: " + expected);
        System.out.println("Actual: " + result);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        int[] candidates = {2,3,5};
        int target = 8;
        Solution solution = new Solution();
        List<List<Integer>> result = solution.combinationSum(candidates, target);
        List<List<Integer>> expected = List.of(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5));
        System.out.println("Expect: " + expected);
        System.out.println("Actual: " + result);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testEmptyCandidates() {
        int[] candidates = {};
        int target = 8;
        Solution solution = new Solution();
        List<List<Integer>> result = solution.combinationSum(candidates, target);
        List<List<Integer>> expected = List.of();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testEmptyResult() {
        int[] candidates = {2, 4, 6};
        int target = 7;
        Solution solution = new Solution();
        List<List<Integer>> result = solution.combinationSum(candidates, target);
        List<List<Integer>> expected = List.of();
        Assert.assertEquals(expected, result);
    }
}
