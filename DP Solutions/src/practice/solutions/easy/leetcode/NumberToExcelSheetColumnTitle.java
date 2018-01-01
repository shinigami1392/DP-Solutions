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
	    
	    public int arrangeCoins1(int n) {
	        int count = 0;
	        int rowSize = 1;
	        while (n >0){
	            n = n- rowSize;
	            if (n > 0) {
	            		count++;
	            }
	            rowSize++;
	        }
	        return count;
	    }
	    public int arrangeCoins(int n) {
	        if (n == 0) return 0;
	        int countRows=0;
	        int count = 0;
	        int i=0;
	        int limit = 1;
	        while(count <= n){
	            if(i == limit){
	                countRows++;
	                limit++;
	                i=0;
	                count++;
	            }
	            else {
	                count++;
	            }
	            i++;
	        }
	        if(i == count){
	                countRows++;
	            }
	        return countRows;
	    }
	    
	    public String addBinary(String a, String b) {
	        StringBuffer aSB = new StringBuffer(a);
	        StringBuffer bSB = new StringBuffer(b);
	        StringBuffer sol = new StringBuffer();
	        int i,j;
	        int carry = 0;
	        for (i = aSB.length()-1, j = bSB.length()-1;i >=0  && j >= 0; i--, j--) {
	        		if(aSB.charAt(i) == '1' && bSB.charAt(j) == '1' && carry == 0) {
	        			sol.append("0");
	        			carry = 1;
	        		}
	        		else if(aSB.charAt(i) == '1' && bSB.charAt(j) == '1' && carry == 1) {
	        			sol.append("1");
	        			carry = 1;
	        		}
	        		else if(aSB.charAt(i) == '1' && bSB.charAt(j) == '0' && carry == 0) {
	        			sol.append("1");
	        			carry = 0;
	        		}
	        		else if(aSB.charAt(i) == '1' && bSB.charAt(j) == '0' && carry == 1) {
	        			sol.append("0");
	        			carry = 1;
	        		}
	        		else if(aSB.charAt(i) == '0' && bSB.charAt(j) == '1' && carry == 0) {
	        			sol.append("1");
	        			carry = 0;
	        		}
	        		else if(aSB.charAt(i) == '0' && bSB.charAt(j) == '1' && carry == 1) {
	        			sol.append("0");
	        			carry = 1;
	        		}
	        		else if(aSB.charAt(i) == '0' && bSB.charAt(j) == '0' && carry == 0) {
	        			sol.append("0");
	        			carry = 0;
	        		}
	        		else if(aSB.charAt(i) == '0' && bSB.charAt(j) == '0' && carry == 1) {
	        			sol.append("1");
	        			carry = 0;
	        		}
	        }
	        if(i>=0) {
	        	for (int temp = i; temp>=0; temp--) {
	        			if(aSB.charAt(temp)=='1' && carry == 1) {
	        				sol.append("0");
	        				carry = 1;
	        			}
	        			else if(aSB.charAt(temp)=='1' && carry == 0) {
	        				sol.append("1");
	        				carry = 0;
	        			}
	        			else if(aSB.charAt(temp)=='0' && carry == 1) {
	        				sol.append("1");
	        				carry = 0;
	        			}
	        			else if(aSB.charAt(temp)=='0' && carry == 0) {
	        				sol.append("0");
	        				carry = 0;
	        			}
	        		}
	        }
	        if(j>=0) {
	        	for (int temp = j; temp>=0; temp--) {
	        			if(bSB.charAt(temp)=='1' && carry == 1) {
	        				sol.append("0");
	        				carry = 1;
	        			}
	        			else if(bSB.charAt(temp)=='1' && carry == 0) {
	        				sol.append("1");
	        				carry = 0;
	        			}
	        			else if(bSB.charAt(temp)=='0' && carry == 1) {
	        				sol.append("1");
	        				carry = 0;
	        			}
	        			else if(bSB.charAt(temp)=='0' && carry == 0) {
	        				sol.append("0");
	        				carry = 0;
	        			}
	        		}
	        }
	        if(carry == 1) {
	        		sol.append("1");
	        }
	        return sol.reverse().toString();
	    }
	    
	    public static void main(String[] args) {
			NumberToExcelSheetColumnTitle n = new NumberToExcelSheetColumnTitle();
			System.out.println(n.addBinary("101111", "10"));
		}
}
