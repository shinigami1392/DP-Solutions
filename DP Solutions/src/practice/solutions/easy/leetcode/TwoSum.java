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
	
	public static int twoSumCount(int[] nums, int target) {
//        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();  
//        
//        int count=0;
//        for (int i = 0; i < nums.length; i++) {
//            int current = nums[i];
//            int other = target - current;
//            if (map.containsKey(other)) {
//                count++;
//            } else {
//              map.put(current, other); 
//            } 
//        }
//        return count;
		
		int[] arr = nums;
        if(arr.length==0)
            return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i],i);
        }
        int[] res = new int[2];
        int count=0;
        for(int i=0; i<arr.length; i++){
            int temp=target-arr[i];
            if(map.containsKey(temp) && map.get(temp)!=i){
                res[0] = i;
                res[1] = map.get(temp);
                count++;
            }
        }

        
        return count;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,2,2};
		System.out.println(twoSumCount(nums, 3));
	}
}
