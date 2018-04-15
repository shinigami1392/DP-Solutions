package practice.solutions.ctci.arrays.strings;

/**
 * @author pushkarladhe
 *1.2 Check Permutation: Given two strings, write a method to decide if one 
 *	  is a permutation of the other.
 */
public class CheckPermutation {
	public boolean checkPermutation(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		}
		int[] charSet = new int[26];
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		for(int i = 0; i < s1.length(); i++){
			charSet[s1.charAt(i)-'a']++;
			charSet[s2.charAt(i)-'a']--;
		}
		
		for( int i = 0; i < charSet.length; i++){
			if(charSet[i]!=0){
				return false;
			}
		}
		return true;
	}
}
