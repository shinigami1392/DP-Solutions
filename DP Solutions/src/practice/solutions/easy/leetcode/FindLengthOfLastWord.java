package practice.solutions.easy.leetcode;

public class FindLengthOfLastWord {
	
	public static void main(String[] args) {
		FindLengthOfLastWord fl = new FindLengthOfLastWord();
		System.out.println(fl.lengthOfLastWord("Hello World"));
	}
	
	public int lengthOfLastWord(String s) {
	        String[] words = s.split(" ");
	        return words[words.length-1].length();
	    }

}
