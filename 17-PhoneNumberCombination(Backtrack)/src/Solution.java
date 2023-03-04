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
	 * ���ݺ���
	 * @param digits �����ռ�
	 * @param digitIndex Ŀǰ�����ռ��λ�ã�Ҳ��digits�ĵ�ǰ�±�
	 * @param str ����Ľ�
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
