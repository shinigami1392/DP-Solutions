package practice.solutions.easy.leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 
 
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
}
