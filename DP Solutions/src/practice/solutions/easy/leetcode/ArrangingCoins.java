package practice.solutions.easy.leetcode;

public class ArrangingCoins {
	public int arrangeCoins1(int n) {
        int count = 0;
        int rowSize = 1;
        while (n >0){
            n = n- rowSize;
            if (n > 0) {
            		count++;
            }
            rowSize++;
        }
        return count;
    }
    public int arrangeCoins(int n) {
        if (n == 0) return 0;
        int countRows=0;
        int count = 0;
        int i=0;
        int limit = 1;
        while(count <= n){
            if(i == limit){
                countRows++;
                limit++;
                i=0;
                count++;
            }
            else {
                count++;
            }
            i++;
        }
        if(i == count){
                countRows++;
            }
        return countRows;
    }
}
