import java.util.ArrayList;
import java.util.List;

/**
 * 南软算法题练习, 三色球问题
 * @author winph
 *
 */
public class Solution {
	
	public void findLongestBall(String str) {
		List<Ball> list = new ArrayList<>();
		
		// 分割字符串
		int l = 0, r = 0; //用于遍历字符串
		while( l <= r && r < str.length()) {
			char ch = str.charAt(l); //当前字符
			while(r < str.length() && str.charAt(r) == ch) r++; //右移r指针
			list.add(new Ball(str.charAt(l), l, r, str));
			l = r;
		}
		
		
		list.sort(null);
		for(Ball b : list) {
			System.out.println(b.toString());
		}
	}
}

class Ball implements Comparable<Ball>{
	private char color; // R, G, B
	private int startIndex;
	private int endIndex; // [start, end) 左闭右开
	private String input; //输入串
	
	public Ball(char color, int startIndex, int endIndex, String input) {
		super();
		this.color = color;
		this.startIndex = startIndex;
		this.endIndex = endIndex;
		this.input = input;
	}


	@Override
	public int compareTo(Ball o) {
		int flag = 0;
		if(this.endIndex - this.startIndex > o.endIndex - o.startIndex) {
			flag = 1;
		} else if (this.endIndex - this.startIndex < o.endIndex - o.startIndex) {
			flag = -1;
		} else if (this.endIndex - this.startIndex == o.endIndex - o.startIndex) {
			if(this.startIndex < o.startIndex) flag = 1;
			else flag = -1;
		}
		
		return -flag; // 降序排列
	}	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.color);
		int l = this.startIndex;
		while(l < this.endIndex) {
			sb.append(" " + (l+1));
			l++;
		}
		return sb.toString();
	}
}
