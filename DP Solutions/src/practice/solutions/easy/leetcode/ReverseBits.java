package practice.solutions.easy.leetcode;

public class ReverseBits {
	public static void main(String[] args) {
	}
	
	public int reverseBits(int n) {
		String s = "";
		while(n>0){
			s = s + (n%2);
			n  = n/2;
		}
		int zeros = 32-s.length();
		for(int i = 0; i < zeros; i++){
			s=s+"0";
		}
		int power = 31;
		double number = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i)=='1'){
				number = number + Math.pow(2, power);
			}
			power--;
		}
		return (int)number;
	}
}
