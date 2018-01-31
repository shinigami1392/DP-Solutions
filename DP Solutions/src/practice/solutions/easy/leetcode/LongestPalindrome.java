package practice.solutions.easy.leetcode;

public class LongestPalindrome {
	/*public static void main(String[] args) {
		LongestPalindrome lp = new LongestPalindrome();
		int x = 'a';
		System.out.println(x);
		System.out.println(lp.longestPalindrome("Abccccdd"));
	}*/
	
	public int longestPalindrome(String s) {
        int[] arr = new int[52];
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)>=97){
                arr[s.charAt(i)-97]++;
            }
            else{
                arr[s.charAt(i)-65+26]++;
            }
        }
        int evens = 0;
        int odds = 0;
        int count = 0;
        for (int i = 0; i< arr.length; i++){
            if(arr[i]%2 == 0){
                count = count + arr[i]/2;
            }
            else{
                count = count + arr[i]/2;
                odds++;
            }
        }
        if(odds>0){
            count = (2*count)+1;
        }
        else{
        	count =  2*count;
        }  
        return count;
    }

}
