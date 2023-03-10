/*
 * 因为题目要求输出原有下标, 所以我们在输出子串以后并不直接修改字符串, 而是用一个数组flag记录已经输出的字符
 * 并且在遍历字符串时，通过自定义迭代器的接口进行遍历，实现getFirst(), getNext(), getValidLen()等方法
 * 这些方法都会先检查flag, 实现逻辑上的删除子串功能
 * 注意: getFirst(), getNext()当没有有效字符时返回-1, 这么做是因为我没有实现hasNext()方法, 而是直接用str.length()来判定终止
 * 
 */
public class Solution {
	private String str;
	private boolean[] flag; //已输出字符标记为true
	
	public void findMaxSubstring(String str) {
		this.str = str;
		this.flag = new boolean[str.length()];
		while(findMax()) {
			// nothing to do
		}
	}
	
	/*
	 * 格式化输出当前靠左的最长子串, 并将已输出的字符标记flag数组
	 * 格式为: `[字符]( [原下标])*`
	 * @return 是否存在Max串, 当所有字符都输出时返回false
	 */
	private boolean findMax() {
		int i = getFirst();
		int max = 0, maxi = 0, maxj = 0; //[maxi, maxj) 左闭右开
		while(i < this.str.length()) {
			int j = getNext(i);
			while(j < str.length() && str.charAt(i) == str.charAt(j)) j = getNext(j);
			if(max < getValidLen(i, j)) {
				max = getValidLen(i, j);
				maxi = i;
				maxj = j;
			}
			i = getNext(i);
		}
		
		if(max > 0) {
			System.out.print(str.charAt(maxi));
			for(int k = maxi; k < maxj; k = getNext(k)) {
				flag[k] = true;
				System.out.print(" " + (k+1));
			}
			System.out.println();
			return true;
		}else {
			System.out.println();
			return false;
		}
		
	}
	
	/*
	 * @param: cur 当前下标
	 * @return: cur 之后首个未被输出的下标; 如果全部都输出则返回length(1 past the last valid index)
	 */
	private int getNext(int cur) {
		cur++;
		while(cur < this.str.length()) {
			if(flag[cur] == false) return cur;
			
			cur++;
		}
		return str.length();
	}
	
	/*
	 * 返回首个未输出的字符的下标
	 * @return 首个 flag[i]==false 字符下标i
	 */
	private int getFirst() {
		for(int i = 0; i < this.str.length(); i++) {
			if(flag[i] == false) return i;
		}
		return str.length();
	}
	
	/*
	 * 给出下标i, j, 返回[i, j)中未输出字符的长度
	 * @param i: 起始下标
	 * @param j: 终止下标(不包含)
	 */
	private int getValidLen(int i, int j) {
		int validLen = 0;
		for(; i < j; i++) {
			if(flag[i] == false) validLen++;
		}
		return validLen;
	}
}
