package practice.solutions.easy.leetcode;

import java.util.HashSet;
import java.util.Set;

public class DistributingCandies {
	public int distributeCandies(int[] candies) {
	        Set<Integer> candyType = new HashSet<>();
	        for (int i = 0; i<candies.length; i++){
	        	if (!candyType.contains(candies[i])) {
					candyType.add(candies[i]);
				}
	        }
	        if(candyType.size() >= candies.length/2){
	        	return candies.length/2;
	        }
	        else{
	        	return candyType.size();
	        }
	    }

	public static void main(String[] args) {
		DistributingCandies dc = new DistributingCandies();
		System.out.println(dc.distributeCandies(new int[] {1,1,2,1}));
	}
}
