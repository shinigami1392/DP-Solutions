package practice.solutions.medium.leetcode;

public class LCS {
	public static void main(String[] args) {
		LCS lcs = new LCS();
		System.out.println(lcs.largestCommonSubsequence("BANANA", "ATANA"));
	}
	
	public String largestCommonSubsequence(String s, String t) {
		int[][] dp = new int[s.length()+1][t.length()+1];
		char[][] chars = new char[s.length()+1][t.length()+1];
		for(int i = 0; i <s.length(); i++) {
			for(int j = 0; j < t.length(); j++) {
				if(s.charAt(i) == t.charAt(j)) {
					dp[i+1][j+1] = dp[i][j]+1;
					chars[i+1][j+1] = 'D';
				}else {
					if(dp[i][j+1]>dp[i+1][j]) {
						dp[i+1][j+1] = dp[i][j+1];
						chars[i+1][j+1] = 'U';
					}
					else {
						dp[i+1][j+1] = dp[i+1][j];
						chars[i+1][j+1] = 'L';
					}
				}
			}
		}
		
		int i = dp.length-1;
		int j = dp[0].length-1;
		StringBuilder sb = new StringBuilder();
		
		
		while(i>0) {
			if(j == 0) {
				break;
			}
			while(j>0) {
				if(chars[i][j]=='D') {
					sb.append(s.charAt(i-1));
					i--;
					j--;
				}
				if(chars[i][j]=='L') {
					j--;
				}
				if(chars[i][j]=='U') {
					i--;
				}
			}
		}
		
		return sb.reverse().toString();
	}
}
