package practice.solutions.easy.leetcode;

public class AddBinary {
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

}
