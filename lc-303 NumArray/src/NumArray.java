
public class NumArray {
	private int[] NumArray;
	private int[] preSum;
	public NumArray(int[] nums) {
		this.NumArray = nums;
		calPreSum();
    }
    
	
    public int sumRange(int left, int right) {
    	return preSum[right+1] - preSum[left];
    }
    
    // 计算前缀和数组
    public void calPreSum() {
    	int sum = 0;
    	this.preSum = new int[NumArray.length + 1];
    	preSum[0] = 0;
    	
    	for(int i = 1; i < preSum.length; i++) {
    		sum += NumArray[i - 1];
    		preSum[i] = sum;
    	}
    	System.out.println("preSum: " + preSum.toString());
    }
    
    public int[] getPreSum() {
    	return this.preSum;
    }
}
