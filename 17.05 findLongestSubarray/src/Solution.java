import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * preSum: 前缀和数组, preSum[i] = nums[0..i-1]之和
 * map<Integer, Integer>: preSum[k] -> 这个值首次出现的PreSum下标
 * - 将字母和数字分别转换为+1和-1进而将问题转换为**求区间和为0的最长子数组**；
 * - 对于区间 `[l..r]` ，其和为 `preSum[r+1]-preSum[l]` ，从而转化为求前缀和数组的两个元素相减=0且区间长度最长的问题；
 * - 进一步等价，转化为找到前缀和数组中两个相等元素 `preSum[i], preSum[j]`，且 `j-i` 最大。
 * - 算法：建立前缀和数组，然后遍历前缀和数组对于每个 `preSum[k]`，查看它第一次出现的下标t，记录 `k-t` ，求出最大的 `k-t` 就是目标。
 * 易错点：map 存储的是preSum的下标
 * 如果preSum[m] == preSum[n], 则返回数组是 array[m..n)
 */
public class Solution {
	public String[] findLongestSubarray(String[] array) {
		int[] preSum = new int[array.length + 1];
		Map<Integer, Integer> firstOccur = new HashMap<>();
		
		preSum[0] = 0;
		firstOccur.put(0, 0); //漏了这一句就会报错！
		for(int i = 0, sum = 0; i < array.length; i++) {
			sum += getVal(array[i].charAt(0));
			preSum[i+1] = sum;
			if(!firstOccur.containsKey(sum)) {
				firstOccur.put(sum, i+1); //i+1表示preSum下标
			}
		}
		
//		System.out.print("preSum: ");
//		Arrays.stream(preSum).forEach(item -> System.out.print(item + " "));
//		System.out.println();
		
		
		int maxLen = 0;
		int start = -1, end = -1;
		// i 是preSum的下标, preSum[i] 表示 Array[0..i-1]的和
		for(int i = 0; i < preSum.length; i++) {
			int first = firstOccur.get(preSum[i]);
			if(i - first > maxLen) {
				maxLen = i - first;
				start = first;
				end = i;
			}
		}
//		System.out.println("start: " + start + ", end: " + end);
		
		if(maxLen == 0) {
			return new String[0];
		}else {
			return Arrays.copyOfRange(array, start, end);
		}
    }
	
	private int getVal(Character ch) {
		if(Character.isDigit(ch)) {
			return -1;
		}else {
			return 1;
		}
	}
}
