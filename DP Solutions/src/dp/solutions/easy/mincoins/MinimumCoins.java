package dp.solutions.easy.mincoins;
/**
 * @author https://github.com/shinigami1392 [Pushkar Ladhe]
 *
 * Dynamic Programming solution for reaching a specific sum using minimum coins 
 */
public class MinimumCoins {
/*	public static void main(String[] args) {
		int coins[] = {3,1,5};
		getMinimumCoins(coins, 12);
	}*/
	
	public static void getMinimumCoins(int[] coins, int sum) {
		int min[] = new int[sum+1];
		for (int i = 0; i < min.length; i++) {
			min[i]=Integer.MAX_VALUE;
		}
		min[0] = 0;
		for(int i = 1; i <= sum; i++) {
			for (int j = 0; j<coins.length; j++) {
				if(coins[j] <= i && min[i-coins[j]] < min[i]) {
					min[i] = min[i-coins[j]] +1;
				}
			}
		}
		for (int i = 0; i < min.length; i++) {
			System.out.println(i+": "+min[i]);
		}
	}
}
