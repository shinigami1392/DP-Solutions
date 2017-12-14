package dp.solutions.easy.leetcode.rangesum;

/**
 * @author https://github.com/shinigami1392 [Pushkar Ladhe]
 *
 * Dynamic Programming solution to find sum of elements in an array in a given range. (Leetcode: 303)
 */


public class RangeSum {
	int[] sums;
    public RangeSum(int[] nums) {
        sums = new int[nums.length+1];
        for (int i = 0; i<nums.length; i++){
            sums[i+1] = sums[i] + nums[i];
        }
    }
    
    public long sumRange(int i, int j) {
        return sums[j+1]-sums[i];
    }
    
/*    public static void main(String[] args) {
		int[] nums= {-2, 0, 3, -5, 2, -1};
		RangeSum rs = new RangeSum(nums);
		System.out.println(rs.sumRange(0, 2));
	}*/
	
}
