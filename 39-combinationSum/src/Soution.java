import java.util.ArrayList;
import java.util.List;

class Solution {
	List<List<Integer>> ans;
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	ans = new ArrayList<>();
    	if(candidates == null || candidates.length == 0) return ans;
    	backtrack(candidates, target, new ArrayList<Integer>(), 0);
    	return ans;
    }

    public void backtrack(int[] candidates, int target, List<Integer> combination, int start) {
        if(target < 0) return;
        if(target == 0) {
        	ans.add(new ArrayList(combination));
        	return;
        }
        
        
        
        for(int i = start; i < candidates.length; i++) {
        	combination.add(candidates[i]);
        	backtrack(candidates, target - candidates[i], combination, i);
        	combination.remove(combination.size() - 1);
        }
    }
}