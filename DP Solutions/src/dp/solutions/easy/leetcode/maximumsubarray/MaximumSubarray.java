package dp.solutions.easy.leetcode.maximumsubarray;

/**
 * @author https://github.com/shinigami1392 [Pushkar Ladhe]
 *
 * Dynamic Programming solution for finding subarray having max sum (Leetcode: 53)
 */

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		if (nums.length==0) {
			return -1;
		}
        int currentMax = nums[0];
        int finalMax = nums[0];
        for (int i = 1; i <nums.length; i++){
            currentMax = Math.max(nums[i],currentMax+nums[i]);
            finalMax = Math.max(currentMax, finalMax);
        }
        return finalMax;
    }
	
	public static void main(String[] args) {
		MaximumSubarray ms = new MaximumSubarray();
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(ms.maxSubArray(nums));
	}
}
