package practice.solutions.easy.leetcode;

//Leetcode 162

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int i = 1;
        if(nums.length==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        boolean flag = false;
        for (i=1; i < nums.length-1; i++){
            if(nums[i-1]<nums[i]&&nums[i+1]<nums[i]){
                return i;
            }
        }
        return i;
    }
}
