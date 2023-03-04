import java.util.LinkedList;
import java.util.List;

public class Solution {
	// digit - 2 ==digitMap==> Letters
	private	String[] digitMap = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; 
	private List<String> ans = new LinkedList<>();

	public List<String> letterCombinations(String digits) {
		if(digits == null || digits.isEmpty()) return ans;
		
		backtrack(digits, 0, new StringBuilder());
		return ans;
	}

	/**
	 * 回溯函数
	 * @param digits 搜索空间
	 * @param digitIndex 目前搜索空间的位置，也即digits的当前下标
	 * @param str 构造的解
	 */
	private void backtrack(String digits, int digitIndex, StringBuilder str) {
		if(digitIndex == digits.length()) {
			ans.add(str.toString());
			return;
		}
		
		String letters = digitMap[digits.charAt(digitIndex) - '2'];
		for(char ch : letters.toCharArray()) {
			str.append(ch);
			backtrack(digits, digitIndex + 1, str);
			str.deleteCharAt(str.length() - 1);
		}
	}
}
