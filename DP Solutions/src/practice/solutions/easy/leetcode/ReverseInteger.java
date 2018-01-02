package practice.solutions.easy.leetcode;

public class ReverseInteger {
	public int reverse(int x) {
	    	if (x <= Integer.MIN_VALUE || x > Integer.MAX_VALUE) {
	    		return 0;
	    	}
	    	StringBuffer sb = new StringBuffer(Long.toString(Math.abs(x)));
	    	String s = sb.reverse().toString();
	        if(x < 0 && -1*Long.parseLong(s)>=Integer.MIN_VALUE){
	            return -1*Integer.parseInt(s);
	        }else if(x > 0 && Long.parseLong(s)<=Integer.MAX_VALUE) {
	        		return Integer.parseInt(s);
	        }
	        return 0;
	    }
}
