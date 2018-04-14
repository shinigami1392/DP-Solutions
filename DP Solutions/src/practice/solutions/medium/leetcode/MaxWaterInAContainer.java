package practice.solutions.medium.leetcode;

public class MaxWaterInAContainer {
	public int maxArea(int[] height) {
        
        /*The solution uses two pointers left and right
        The left starts from leftmost index and the right one from rightmost index
        We calculate the maxArea and increment left unless the left bar is smaller than current left
        We calculate the maxArea and decrement right unless the right bar is smaller than current right
        Everytime we loop over check if the new area is more than current max and replace the max if needed
        */
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        
        while(left!=right){
            if(height[left]>height[right]){
                maxArea = Math.max((height[right])*(right-left),maxArea);
                int min = height[right];
                while(left!=right&& height[right]<=min){
                    right--;
                }
            }
            else{
                maxArea = Math.max((height[left])*(right-left),maxArea);
                int min = height[left];
                while(left!=right&& height[left]<=min){
                    left++;
                }
            }
        }
        return maxArea;
    }
}
