package practice.solutions.ctci.arrays.strings;

public class OneAway {
	
	public static void main(String[] args) {
		OneAway oa = new OneAway();
		System.out.println(oa.oneAway("pale", "apla"));
	}
	
	public boolean oneAway(String s1, String s2){
		int[] charSet = new int[26];
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		int n = Math.max(s1.length(), s2.length());
		for(int i = 0; i < n; i++){
			if(i<s1.length()){
				charSet[s1.charAt(i)-'a']++;
			}
			if(i<s2.length()){
				charSet[s2.charAt(i)-'a']--;
			}
		}
		int sum = 0;
		for(int i = 0; i < charSet.length; i++){
			sum = sum + Math.abs(charSet[i]);
		}
		System.out.println(sum);
		return sum <= 2;
	}
}
