package practice.solutions.easy.leetcode;

import java.util.Arrays;

public class RelativeRanks {
	public String[] findRelativeRanks(int[] nums) {
        int count = 1;
        int currentMax = -2;
        int currentMaxIndex = -1;
        int lastMax = 0;
        String[] sol = new String[nums.length];
        for(int i = 0; i<nums.length; i++){
        	
            for (int j = 0; j < nums.length; j++){
            		if(currentMax == -2) {
            			if(nums[j]> lastMax) {
            				//currentMax = 0;
            				lastMax = nums[j];
            				currentMaxIndex = j;
            			}
            		}
            		else {
            			if(nums[j]>currentMax && nums[j]<lastMax) {
            				currentMax = nums[j];
            				currentMaxIndex = j;
            			}
            		}
            }
            if(currentMax == -2) {
            		currentMax = -1;
            }
            else {
            		lastMax = currentMax;
            		currentMax = -1;
            }
            if(count > 3) {
    				sol[currentMaxIndex] = "" +count;
	    		}
	    		if(count == 3) {
	    			sol[currentMaxIndex] = "Bronze Medal";
	    		}
	    		if(count == 2) {
	    			sol[currentMaxIndex] = "Silver Medal";
	    		}
	    		if(count == 1) {
	    			sol[currentMaxIndex] = "Gold Medal";
	    		}
	    		count++;
        }
        return sol;
    }
	
public String solution(String S, int K) {
        
		String s = S.toUpperCase().replace("-", "");
		
		int b = s.length() % K;
		StringBuilder sol = new StringBuilder();
		if(b!=0){
		    sol.append(s.substring(0, b));
		    sol.append("-");
		    }
		
		for (int i= b; i < s.length(); i+= K){
			sol.append(s.substring(i,i+K));
			sol.append("-");
		}
		return sol.substring(0, sol.length()-1);
    }


	public boolean isValid(String time) {
		if(time.charAt(0) >='0' && time.charAt(0)<='2' && time.charAt(1) >='0' && time.charAt(1)<='9' && time.charAt(3) >='0' && time.charAt(3)<='5' && time.charAt(4) >='0' && time.charAt(1)<='9') {
			if(time.charAt(0)=='2' && time.charAt(1)>='4') {
				return false;
			}
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		RelativeRanks rr = new RelativeRanks();
		char[] arr = {'1','1','0','0'};
		//RelativeRanks.findNext(arr, 4);
	}
}
