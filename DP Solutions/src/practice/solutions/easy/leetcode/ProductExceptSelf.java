package practice.solutions.easy.leetcode;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        int zeroCount = 0;
        int[] sol = new int[nums.length];
        for (int i= 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeroCount++;
            }
            else if(zeroCount <= 1 && nums[i] != 0){
                totalProduct = totalProduct * nums[i];
            }
            else if(zeroCount>1){
                break;
            }
        }
        if(zeroCount>1){
            return sol;
        }
        else{
            for(int i= 0; i < nums.length; i++){
                if(nums[i]!=0&& zeroCount==0){
                    sol[i] = totalProduct/nums[i];
                }
                else if(nums[i]==0 && zeroCount==1){
                    sol[i]=totalProduct;
                }
                else{
                    sol[i]=0;
                }
            }
        }
        return sol;
    }
}
