package dp.solutions.easy.mincoins;


/**
 * @author pushkarladhe
 * Leetcode : 746. Min Cost Climbing Stairs
 * DP Solution
 */
public class MinimumCostClimbingStairs {
	
	public static void main(String[] args) {
		MinimumCostClimbingStairs mcs = new MinimumCostClimbingStairs();
		System.out.println(mcs.minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1}));
	}
	
	public int minCostClimbingStairs(int[] cost) {
	        int[] minCosts = new int[cost.length+1];
	        minCosts[0] = cost[0];
	        minCosts[1] = cost[1];
	        
	        for(int i = 2; i <= cost.length; i++){
	        	int current;
	        	if(i >= cost.length){
	        		current = 0;
	        	}else{
	        		current = cost[i];
	        	}
	        	minCosts[i] = (int)Math.min(current + minCosts[i-1],current + minCosts[i-2] );
	        }
	        return minCosts[minCosts.length-1];
	    }
	
}
