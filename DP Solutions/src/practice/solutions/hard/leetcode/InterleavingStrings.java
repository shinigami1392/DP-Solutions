package practice.solutions.hard.leetcode;

public class InterleavingStrings {
	
	public static void main(String[] args) {
		InterleavingStrings is = new InterleavingStrings();
		System.out.println(is.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
	}
	
	
	public boolean isInterleave(String s1, String s2, String s3) {
        int i = 0;
        int j = 0;
        int k = 0;
        System.out.println(s3.length());
        while(k < s3.length()){
            // if(i == s1.length() && j == s2.length()){
            //     break;
            // }
            if(i < s1.length() && s3.charAt(k) == s1.charAt(i)){
                k++;
                i++;
            }else if( j < s2.length() && s3.charAt(k) == s2.charAt(j)){
                k++;
                j++;
            }
            else{
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        
        if( i == s1.length() && j == s2.length() && k == s3.length()){
            return true;
        }
        return false;
    }
}
