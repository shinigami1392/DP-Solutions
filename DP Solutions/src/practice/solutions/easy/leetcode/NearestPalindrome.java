package practice.solutions.easy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class NearestPalindrome {
	public String nearestPalindromic(String n) {
		StringBuffer sb = new StringBuffer(n);
		int mid = n.length()/2;
		//System.out.println(sb.toString());
		Long test = new Long(n);
		int l1 = test.toString().length();
		test = test -2;
		int l2 = test.toString().length();
		test = test+4;
		int l3 = test.toString().length();
		boolean flag1 = true;
		if(l1==l2 && l2==l3){
			flag1 = false;
		}
		test = test-1;
		
		///boolean flag2 = false;
		/*if(test.toString().length()!=n.length() || test%100 == 0 || n.length()<=2 || (test+2)%100 == 0){
			flag1 = true;
		}*/
		test = test+1;
//		if(test%100==0){
//			flag2 = true;
//		}
        if(!sb.toString().equals(sb.reverse().toString()) && !flag1){
        	sb = new StringBuffer(n);
			if(n.length() == 1){
		           Integer sol = Integer.parseInt(n)-1;
		           return sol.toString();
		       }
		       if(n.equals("10")){
		           return "9";
		       }
		       if(n.equals("11")){
		           return "9";
		       }
	        Long number = Long.parseLong(n);
	        Long solution = new Long(0);
	        
	         
	        if(n.length()%2 == 0){
	            for(int i = mid-1; i>=0; i--){
	            	if(i != mid-1){
	            		//System.out.println(sb.toString());
	            		sb.replace(n.length()-i-1, n.length()-i, sb.substring(i, i+1));
	            		//System.out.println(sb.toString());
	            	}
	            }
	            if(n.charAt(mid-1)=='0' && n.charAt(mid)=='0' ){
	            	solution = Long.parseLong(sb.toString());
	            }
	            else{
	            	StringBuffer sbTemp1 = new StringBuffer(sb);
	                StringBuffer sbTemp3 = new StringBuffer(sb);
	                Integer change1 = (Integer.parseInt(sb.substring(mid-1, mid))+1)%10;
	                Integer change2 = new Integer(0);
	                if(n.charAt(mid-1)!='0'){
	                	change2 = Integer.parseInt(sb.substring(mid-1, mid))-1;
	                }
	                else
	                {
	                	change2 = Integer.parseInt(sb.substring(mid-1, mid));
	                }
	                sbTemp1.replace(mid-1, mid, change1.toString());
	                sbTemp1.replace(mid, mid+1, change1.toString());
	                sbTemp3.replace(mid-1, mid, change2.toString());
	                sbTemp3.replace(mid, mid+1, change2.toString());
	                StringBuffer sbTemp2 = new StringBuffer(sb);
	                change1 = Integer.parseInt(sb.substring(mid-1, mid));
	                sbTemp2.replace(mid, mid+1, change1.toString());
	                //System.out.println(sbTemp1);
	                //System.out.println(sbTemp2);
	                Long temp1 = Long.parseLong(sbTemp1.toString());
	                Long temp2 = Long.parseLong(sbTemp2.toString());
	                Long temp3 = Long.parseLong(sbTemp3.toString());
	                if(Math.abs(temp1-number) < Math.abs(temp2-number) && Math.abs(temp1-number) < Math.abs(temp3-number)){
	                	solution = temp1;
	                }
	                else if(Math.abs(temp2-number) < Math.abs(temp1-number) && Math.abs(temp2-number) < Math.abs(temp3-number)){
	                	solution = temp2;
	                }
	                else if(Math.abs(temp3-number) < Math.abs(temp1-number) && Math.abs(temp3-number) < Math.abs(temp2-number)){
	                	solution = temp3;
	                }
	                else if(Math.abs(temp1-number) == Math.abs(temp2-number)){
	                	solution = Math.min(temp1, temp2);
	                }
	                else if(Math.abs(temp2-number) == Math.abs(temp3-number)){
	                	solution = Math.min(temp2, temp3);
	                }
	                else if(Math.abs(temp1-number) == Math.abs(temp3-number)){
	                	solution = Math.min(temp1, temp3);
	                }
	            }
	            
	            
	        }
	        else{
	        	for(int i = mid-1; i>=0; i--){
	            	//System.out.println(n.charAt(i));
	            	//System.out.println(n.charAt(n.length()-i-1));
	            	
	            	sb.replace(n.length()-i-1, n.length()-i, sb.substring(i, i+1));
	            	//System.out.println(sb.toString());
	            	
	            }
	        	if(n.charAt(mid)=='0'){
	            	solution = Long.parseLong(sb.toString());
	            }
	        	else if(n.charAt(mid)=='9'){
	        		StringBuffer sbTemp1 = new StringBuffer(sb);
		        	sbTemp1.replace(mid, mid+1, new Character((char) (n.charAt(mid)-1)).toString());
	                //StringBuffer sbTemp2 = new StringBuffer(sb);
	                Long temp1 = new Long(sbTemp1.toString());
	                Long temp2 = new Long(sb.toString());
	                
	                if(Math.abs(temp1-number) > Math.abs(temp2-number)){
	                	solution = Long.parseLong(temp2.toString());
		        	}else{
		        		solution = Long.parseLong(temp1.toString());
		        	}
	        	}
	        	else{
	        		StringBuffer sbTemp1 = new StringBuffer(sb);
		        	sbTemp1.replace(mid, mid+1, new Character((char) (n.charAt(mid)-1)).toString());
	                StringBuffer sbTemp2 = new StringBuffer(sb);
	                sbTemp2.replace(mid, mid+1, new Character((char) (n.charAt(mid)+1)).toString());
	                Long temp1 = new Long(sbTemp1.toString());
	                Long temp2 = new Long(sbTemp2.toString());
	                Long temp3 = new Long(sb.toString());
	                
	                if(Math.abs(temp1-number) < Math.abs(temp2-number) && Math.abs(temp1-number) < Math.abs(temp3-number)){
	                	solution = temp1;
	                }
	                else if(Math.abs(temp2-number) < Math.abs(temp1-number) && Math.abs(temp2-number) < Math.abs(temp3-number)){
	                	solution = temp2;
	                }
	                else if(Math.abs(temp3-number) < Math.abs(temp1-number) && Math.abs(temp3-number) < Math.abs(temp2-number)){
	                	solution = temp3;
	                }
	                else if(Math.abs(temp1-number) == Math.abs(temp2-number)){
	                	solution = Math.min(temp1, temp2);
	                }
	                else if(Math.abs(temp2-number) == Math.abs(temp3-number)){
	                	solution = Math.min(temp2, temp3);
	                }
	                else if(Math.abs(temp1-number) == Math.abs(temp3-number)){
	                	solution = Math.min(temp1, temp3);
	                }
	        	}
	        	
	        }
	        
	        return solution.toString();
        }else if(sb.toString().equals(sb.reverse().toString()) && !flag1){
        	if(n.length()%2 == 0){
        		int change=1;
        		int i = 0;
        		while(change!=0 && i < mid){
        			if(n.charAt(mid+i)!='0'){
        				sb.replace(mid+i, mid+i+1, new Character((char) (n.charAt(mid+i)-1)).toString());
        				sb.replace(mid-i-1, mid-i, new Character((char) (n.charAt(mid+i)-1)).toString());
        				break;
        			}else{
        				sb.replace(mid+i, mid+i+1, new Character((char) ('9')).toString());
        				sb.replace(mid-i-1, mid-i, new Character((char) ('9')).toString());
        				i++;
        			}
        			System.out.println(sb);
        			
        		}
        	}
        	else{
        		if(n.charAt(mid)=='0'){
        			sb.replace(mid, mid+1, new Character('1').toString());
        		}else{
        			sb.replace(mid, mid+1, new Character((char) (n.charAt(mid)-1)).toString());
        		}
        	}
        	return sb.toString();
        }
        else{
        	String sol = "";
    		Long num = new Long(n);
    		Long tempNum = num-1;
    		List<Long> dp = new ArrayList<>();
    		while(!tempNum.toString().equals(new StringBuffer(tempNum.toString()).reverse().toString())){
    			tempNum = tempNum-1;
    		}
    		Long low = tempNum;
    		tempNum = num+1;
    		while(!tempNum.toString().equals(new StringBuffer(tempNum.toString()).reverse().toString())){
    			tempNum = tempNum+1;
    		}
    		Long high = tempNum;
    		if(Math.abs(num-high)<Math.abs(num-low)){
    			sol = high.toString();
    		}
    		else{
    			sol = low.toString();
    		}
    		return sol;
        }
    }
	
	String nearestPalindromeDP(String n){
		String sol = "";
		Long num = new Long(n);
		Long tempNum = num-1;
		List<Long> dp = new ArrayList<>();
		while(!tempNum.toString().equals(new StringBuffer(tempNum.toString()).reverse().toString())){
			tempNum = tempNum-1;
		}
		Long low = tempNum;
		tempNum = num+1;
		while(!tempNum.toString().equals(new StringBuffer(tempNum.toString()).reverse().toString())){
			tempNum = tempNum+1;
		}
		Long high = tempNum;
		if(Math.abs(num-high)<Math.abs(num-low)){
			sol = high.toString();
		}
		else{
			sol = low.toString();
		}
		return sol;
	}
	
	public static void main(String[] args) {
		NearestPalindrome np = new NearestPalindrome();
		System.out.println(np.nearestPalindromeDP("1234576754"));
		System.out.println(np.nearestPalindromic("360287970189639800"));
	}
}
