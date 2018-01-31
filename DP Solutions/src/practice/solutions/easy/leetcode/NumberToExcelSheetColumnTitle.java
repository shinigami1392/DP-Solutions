package practice.solutions.easy.leetcode;

public class NumberToExcelSheetColumnTitle {
	    public String convertToTitle(int n) {
	    		String sol = "";
	    		char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	    		if (n <= 26) {
	    			return Character.toString(arr[n-1]);
	    		}
	    		
	    		int last;
	    		if (n%26==0) {
	    			n = (n/26)-1;
	    			last = 26;
	    		}
	    		else {
	    			last = n%26;
	    			n = n/26;
	    		}
	    		while(n > 26) {
	    			int temp = n%26;
	    			sol = sol+Character.toString(arr[temp-1]);
	    			n = n/26;
	    		}
	    		sol = sol + Character.toString(arr[n-1]);
	    		StringBuffer sb = new StringBuffer(sol);
	    		sb = sb.reverse();
	    		sol = sb.toString();
	    		if(last>0) {
	    			sol = sol + Character.toString(arr[last-1]);
	    		}
	    		else {
	    			sol = sol + Character.toString(arr[0]);
	    		}
	    		return sol;
	    }

	    
	    public static void main(String[] args) {
			NumberToExcelSheetColumnTitle n = new NumberToExcelSheetColumnTitle();
			System.out.println(n.convertToTitle(8));
		}
}
