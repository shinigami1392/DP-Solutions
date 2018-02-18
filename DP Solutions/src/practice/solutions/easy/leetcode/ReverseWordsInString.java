package practice.solutions.easy.leetcode;

public class ReverseWordsInString {
	public String reverseWords(String s) {
		String[] words = s.split(" ");
		StringBuffer sol = new StringBuffer();
		for(int i = 0; i<words.length; i++){
			sol.append(new StringBuffer(words[i]).reverse());
			sol.append(" ");
		}
		return sol.toString().trim();
	}
	
	public static void main(String[] args) {
		ReverseWordsInString rw = new ReverseWordsInString();
		System.out.println(rw.reverseWords("abc def ghi"));
	}
}
