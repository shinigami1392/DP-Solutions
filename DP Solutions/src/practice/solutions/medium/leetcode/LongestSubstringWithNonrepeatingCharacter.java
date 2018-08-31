package practice.solutions.medium.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithNonrepeatingCharacter {
	public static void main(String[] args) {
		System.out.println(longestSubstring("PuPsPh"));
	}
	
	public static String longestSubstring(String s) {
		int maxLen = 0;
		int maxStart = 0;
		for(int i = 0; i <s.length(); i++) {
			Set<Character> tempSet = new HashSet<>();
			int tempMax = 0;
			for(int j = i; j < s.length(); j++) {
				if(tempSet.contains(s.charAt(j))) {
					break;
				}
				else {
					tempSet.add(s.charAt(j));
					tempMax++;
				}
				if(tempMax > maxLen) {
					maxLen = tempMax;
					maxStart = i;
				}
			}
		}
		return s.substring(maxStart, maxStart+maxLen);
	}
}
