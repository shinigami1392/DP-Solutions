package dp.solutions.easy.mincoins;

/**
 * @author pushkarladhe
 * leetcode: 121. Best Time To Buy And Sell Stock
 */
public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
        if (prices.length<=1){
            return 0;
        }
        int min = prices[0];
        int max = 0;
        int[] maxProfit = new int[prices.length];
        for(int i = 1; i < prices.length; i++){
            if(prices[i]<min){
                min = prices[i];
            }
            max = (int)Math.max(prices[i]-min, max);
            maxProfit[i] = max;
        }
        return maxProfit[maxProfit.length-1];
    }
}
