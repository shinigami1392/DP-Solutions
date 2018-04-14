package practice.solutions.easy.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays {
	
	public int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> sol = new ArrayList<Integer>();
		for (int i = 0; i < nums1.length; i++){
			if(map.containsKey(nums1[i])){
				map.put(nums1[i], map.get(nums1[i])+1);
			}
			else{
				map.put(nums1[i], 1);
			}
		}
		for(int i = 0; i < nums2.length; i++){
			if(map.containsKey(nums2[i])){
				sol.add(nums2[i]);
				map.put(nums2[i], map.get(nums2[i])-1);
				if(map.get(nums2[i])==0){
					map.remove(nums2[i]);
				}
			}
		}
		int[] solArr = new int[sol.size()];
		int c = 0;
		for(int i : sol){
			solArr[c] = i;
			c++;
		}
		return solArr;
	}
}
