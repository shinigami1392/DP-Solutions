package practice.solutions.easy.leetcode;

public class RemoveElements {
	public int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }
        int i = 0;
        int pivot = nums.length;
        int j = 0;
        while (i <= pivot && i < nums.length  && pivot >=0){
            if(nums[i]==val){

                for (j = i; j <pivot-1; j++){
                    nums[j] = nums[j+1];
                }
                
                pivot--;
            }
            if(nums[i]!=val && pivot>=0) {
    			i++;
        }
            
        }
        if(nums[j]==val && pivot!=0 && i <= pivot){
            pivot--;
        }
        for(int k = 0; k < pivot; k++) {
        		System.out.println(nums[k]);
        }
        return pivot;
    }
	
	public static void main(String[] args) {
		RemoveElements re = new RemoveElements();
		int[] nums = {3,2,2,2,3};
		int sol = re.removeElement(nums, 3);
		System.out.println(sol);
	}
}
