package practice.solutions.easy.leetcode;

import java.util.HashMap;
import java.util.Map;

//All elements in array appear twice except one, find that one element
public class FindSingleElement {
	
	public int singleNumber(int[] nums) {
		//Solution in O(1) space and O(n) time
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            result = result ^ nums[i];
        }
        return result;
        /*
         * Solution in O(n) space and O(n) time
         *  
         Map<Integer, Integer> map = new HashMap<Integer, Integer>();
         for (int i = 0; i < nums.length; i++){
             if(map.containsKey(nums[i])){
             	map.put(nums[i], 2);
             }
             else{
             	map.put(nums[i], 1);
             }
         }
         for (int i: map.keySet()){
         	if(map.get(i)==1){
         		return i;
         	}
         }
         return 0;*/
    }
}
