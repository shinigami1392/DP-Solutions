package practice.solutions.easy.leetcode;

public class MergeSortedArrays {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        while (i<m && j<n){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                int tempC = i+1;
                int temp = nums1[i];
                nums1[i] = nums2[j];
                while (tempC < m+n-1){
                	temp = nums1[tempC];
                	nums1[tempC] = temp;
                    tempC++;
                    
                }
                j++;
            }
        }
       
        
        for(int k = 0; k < nums1.length; k++){
        	System.out.println(nums1[k]);
        }
    }

}
