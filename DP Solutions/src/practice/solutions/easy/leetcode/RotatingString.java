package practice.solutions.easy.leetcode;

public class RotatingString {
	public boolean rotateString(String A, String B) {
        StringBuilder sbA = new StringBuilder(A);
        if(A.length() != B.length()){
        	return false;
        }
        if (A.equals(B)){
        	return true;
        }
        for (int i=0; i < sbA.length(); i++){
        	if((sbA.substring(i, sbA.length()) + sbA.substring(0,i)).equals(B)){
        		return true;
        	}
        }
        return false;
    }
	
}
