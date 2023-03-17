import java.util.Arrays;


/*
    这一题要求的是子序列的「最大长度」，不是求子序列本身，所以可以对nums进行排序操作；
    nums排序之后利用贪心思想，每次取最小值，再判断，即可；
    可以用前缀和进行优化。
 */

public class Solution {
	public int[] answerQueries(int[] nums, int[] queries) {
		int[] answer = new int[queries.length];
		Arrays.sort(nums);
		System.out.println(nums);
		
		// 计算 nums 的前缀和数组
		// preSum[i] = nums数组前i个元素之和 = sum{nums[0], .. , nums[i-1]}
		int[] preSum = new int[nums.length + 1];
		preSum[0] = 0;
		for(int i = 0, sum = 0; i < nums.length; i++) {
			sum += nums[i];
			preSum[i+1] = sum;
		}
		
		// 为每个queries[i] 计算 answer[i]
		for(int i = 0; i < answer.length; i++) {
			// 计算answer[i]
			int indexPreSum = 0;
			
			// 要避免indexPreSum越界！一定要有第一个条件
			while(indexPreSum < preSum.length && preSum[indexPreSum] <= queries[i]) {
				indexPreSum++;
			}
			// 此时preSum[indexPreSum] > queries[i]
			// 所以 minLen = indexPreSum - 1;
			answer[i] = indexPreSum - 1;
		}
//		for(int i : answer) {
//			System.out.print(i + " ");
//		}
		return answer;
    }

}
