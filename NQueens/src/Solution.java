
public class Solution {
	// 记录每一行放置皇后的下标, 用于构造具体解, 如果只需要求解的个数, 可以不需要queens数组
	// private int[] queens;
	
	// 记录每一次搜索时，对列、主对角线、副对角线的占用情况
	private boolean[] cols;
	private boolean[] mainDiags;
	private boolean[] viceDiags;
	
	// 解的个数
	private int count;
	
	public int totalNQueens(int n) {
		// 初始化
		count = 0;
		//queens = new int[n];
		cols = new boolean[n];
		mainDiags = new boolean[2*n-1];
		viceDiags = new boolean[2*n-1];
		
		backtrack(0, n);
		
		return count;
    }
	
	private void backtrack(int row, int n) {
		if(row == n) {
			// 已经找到一个可行解，返回
			count++;
		}
		
		// 从当前行(row)的每一列开始搜索
		int col = 0;
		for(; col < n; col++) {
			// 剪枝: 先检查当前位置是否可以放置皇后，如果不能放置，则直接返回, 搜索下一列。
			// 当前列已被占用
			if(cols[col]) continue;
			// 当前主对角线被占用
			if(mainDiags[row-col+n-1]) continue;
			// 当前副对角线已被占用
			if(viceDiags[row+col]) continue;
			
			// 此时col是一个可用位置
			// [Place Queen]
			cols[col] = true;
			mainDiags[row-col+n-1] = true;
			viceDiags[row+col] = true;
			// 进一步搜索下一个位置
			backtrack(row+1, n);
			// revoke [Place Queen]
			// 执行到这里说明[遍历n个col都没有解, 则撤销在row=n时的操作，结束backtrack[row=n]后返回row-1行]
			cols[col] = false;
			mainDiags[row-col+n-1] = false;
			viceDiags[row+col] = false;
		}
	}
}
