package practice.solutions.easy.leetcode;

import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();  
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int other = target - current;
            if (map.containsKey(other)) {
                return new int[]{(int)map.get(other), i};
            } else {
              map.put(current, i); 
            } 
        }
        return null;
    }
}
