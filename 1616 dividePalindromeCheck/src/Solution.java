
/*
 * 1. 实现isPalindrome(String str)函数，用于判断一个字符串是否为回文串
 * 2. 遍历a, b每个可能的下标，进行分割，检查分割结果是否满足要求
 * sum: 91/109, 剩一些超时了, 确实遍历效率不高(lll￢ω￢)
 */
public class Solution {
	
	public boolean checkPalindromeFormation(String a, String b) {
		
		if(isPalindrome(a) && isPalindrome(b)) return true;
		
		for(int i = 0; i < a.length(); i++) {
			String aPrefix = a.substring(0, i); // [0, .., i)
			String aPostfix = a.substring(i); //   [i, .., end]
			String bPrefix = b.substring(0, i); // [0, .., i)
			String bPostfix = b.substring(i); //   [i, .., end]
//			System.out.println("i:" + i);
//			System.out.println("aPrefix: " + aPrefix + "  aPostfix: " + aPostfix);
//			System.out.println("bPrefix: " + bPrefix + "  bPostfix: " + bPostfix);
//			System.out.println();
			if(isPalindrome(aPrefix+bPostfix) || isPalindrome(bPrefix + aPostfix)) {
				return true;
			}
		}
		
		return false;
    }
	
	
	public boolean isPalindrome(String str) {
		int len = str.length();
		if(len == 0 || len == 1) return true;
		if(len % 2 == 0) {
			int leftMid = len / 2 - 1;
			int rightMid = len / 2;
			while(leftMid > 0 && str.charAt(leftMid) == str.charAt(rightMid)) {
				leftMid--;
				rightMid++;
			}
			// post condition: leftMid == 0 or str[leftMid] != str[rightMid]
			// 只要检查str[leftMid] 是否等于 str[rightMid] 即可
//			System.out.println(str.charAt(leftMid) + " " + str.charAt(rightMid));
			if(str.charAt(leftMid) == str.charAt(rightMid)) return true;
			return false;
		}
		
		// len is odd number
		int mid = len / 2;
		int l = mid - 1;
		int r = mid + 1;
		while(l > 0 && str.charAt(l) == str.charAt(r)) {
			l--;
			r++;
		}
		if(str.charAt(l) == str.charAt(r)) return true;
		return false;
	}
}
