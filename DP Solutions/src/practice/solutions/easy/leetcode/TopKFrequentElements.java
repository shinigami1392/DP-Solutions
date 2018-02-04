package practice.solutions.easy.leetcode;

import java.util.ArrayList;

import java.util.List;

public class TopKFrequentElements {
	public List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer> topK = new ArrayList<>();
		
		TopKFrequentElements top = new TopKFrequentElements();
		
		top.sort(nums, 0, nums.length-1);
		int current = nums[nums.length-1];
		for (int i=nums.length-1; i >= 0 ; i--){
			if(current != nums[i]){
				current = nums[i];
				topK.add(nums[i+1]);
				k--;
			}
			if(k==0){
				break;
			}
		}
		return topK;
	}
	
	
	int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; 
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 
 
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
}
