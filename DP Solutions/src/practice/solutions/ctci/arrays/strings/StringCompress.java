package practice.solutions.ctci.arrays.strings;

/**
 * @author pushkarladhe
 * 
 * 1.6 String Compression: Implement a method to perform basic string compression using the counts 
 *	   of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the 
 *	   "compressed" string would not become smaller than the original string, your method should return 
 *	   the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 *
 */
public class StringCompress {
	public String stringCompress(String s){
		StringBuilder sb = new StringBuilder();
		int count = 1;
		char current = s.charAt(0);
		for(int i = 1; i < s.length(); i++){
			if(s.charAt(i)==current){
				count++;
			}else{
				sb.append(current);
				sb.append(count);
				count = 1;
				current = s.charAt(i);
			}
		}
		sb.append(current);
		sb.append(count);
		return sb.toString();
	}
}
