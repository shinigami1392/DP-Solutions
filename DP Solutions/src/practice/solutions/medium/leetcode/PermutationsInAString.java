package practice.solutions.medium.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationsInAString {
	
	public static void main(String[] args) {
		PermutationsInAString perm = new PermutationsInAString();
		Set<String> permutations = new HashSet<>();
		String str= "ABC";
		int right = str.length()-1;
		perm.permute(str, 0, right, permutations);
		
		System.out.println(permutations.size());
		for(String st: permutations) {
			System.out.println(st);
		}
	}
	
	public void permute(String str, int left, int right, Set<String> permutations){
		if(left == right) {
			permutations.add(str);
		}
		else {
			for(int i = 0; i <= right; i++) {
				str = swap(str, left, i);
				permute(str, left+1, right, permutations);
				str = swap(str, left, i);
			}
		}
	}
	
	public String swap(String str, int left, int right) {
		char[] arr = str.toCharArray();
		char temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		
		return String.valueOf(arr);
	}
}
