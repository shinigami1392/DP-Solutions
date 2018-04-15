package practice.solutions.ctci.arrays.strings;

/**
 * @author pushkarladhe
 *1.4 Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
 *A palindrome is a word or phrase that is the same forwards and backwards. A permutation
 *is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
 */
public class PalindromePermutation {
	
	public static void main(String[] args) {
		PalindromePermutation pp = new PalindromePermutation();
		System.out.println(pp.palindromePermutation("babae"));
	}
	
	public boolean palindromePermutation(String s1){
		int[] charSet = new int[26];
		s1 = s1.toLowerCase();
		
		for(int i = 0; i < s1.length(); i++){
			charSet[s1.charAt(i)-'a'] = (charSet[s1.charAt(i)-'a']%2) +1;
		}
		boolean oneSet = false;
		for(int i = 0; i < charSet.length; i++){
			if(charSet[i]==1){
				if(oneSet){
					return false;
				}else{
					oneSet = true;
				}
			}
		}
		return true;
	}
}
