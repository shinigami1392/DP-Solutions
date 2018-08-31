package practice.solutions.medium.leetcode;

public class Atoi {
	
	public static void main(String[] args) {
		System.out.println(myAtoi("-91283472332"));
	}
	
	public static Integer myAtoi(String str) {
		str = str.trim();
		int positive = 1;
		if(!(str.charAt(0) >= 48 && str.charAt(0) <= 57) && str.charAt(0) != 43 && str.charAt(0) != 45) {
			return 0;
		}
		if(str.charAt(0) == 45) {
			positive = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		int pointer = 0;
		if(str.charAt(0) == 45 || str.charAt(0) == 43) {
			pointer = 1;
		}
		for(int i = pointer; i < str.length(); i++) {
			if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
				sb.append(str.charAt(i));
			} else {
				break;
			}
		}
		if(positive * Double.parseDouble(sb.toString())<Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		if(positive * Double.parseDouble(sb.toString())>Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		return positive * Integer.parseInt(sb.toString());
	}
}
