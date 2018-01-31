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
	
	public static void main(String[] args) {
		int[] nums1 = new int[5];
		int[] nums2 = new int[2];
		
		nums1[0] = 1;
		nums1[1] = 5;
		nums1[2] = 8;
		
		nums2[0] = 3;
		nums2[1] = 7;
		MergeSortedArrays ms = new MergeSortedArrays();
		ms.merge(nums1, 3, nums2, 2);
	}
}
