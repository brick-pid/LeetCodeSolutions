import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class sum3 {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans = new LinkedList<>();
		if(nums.length < 3) return ans;
		if(nums.length == 3 && nums[0] + nums[1] + nums[2] != 0) return ans;
		
		// map: val -> index of input array
		Map<Integer, Integer> val2Index = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			val2Index.put(nums[i], i);
		}
		
		//find for each a+b, decide whether -a-b in nums array
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(val2Index.containsKey(-nums[i]-nums[j])) {
					int indexC = val2Index.get(-nums[i]-nums[j]);
					
					// c != a/b
					if(indexC == i || indexC == j) continue;
					
					// �ų��ظ����
					List<Integer> cur = new LinkedList<>(Arrays.asList(nums[i], nums[j], nums[indexC]));
					boolean isEqual = false;
					for(List<Integer> l : ans) {
						if(equalTriple(cur, l)) isEqual = true;
					}
					
					//System.out.println("cur triple: " + cur);
					//System.out.println("cur ans: " + ans);
					
					if(isEqual) continue;
					
					//System.out.println("i=" + i + " ; j=" + j);
					//System.out.println("add: a=" + nums[i] + "; b=" + nums[j] + "; c=" +nums[indexC]);
					ans.add(cur);
				}
			}
		}
		//System.out.println(ans);
		return ans;
    }
	
	private boolean equalTriple(List<Integer> t1, List<Integer> t2) {
		t1.sort(null);
		t2.sort(null);
		for(int i = 0; i < 3; i++) {
			if(t1.get(i) != t2.get(i)) return false;
		}
		return true;
	}
}
