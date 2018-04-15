package practice.solutions.ctci.arrays.strings;



/**
 * @author pushkarladhe
 *
 *Chapter 1 : Arrays And Strings
 *1.1 Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you 
 *cannot use additional data structures?
 *
 *
 */
public class IsUnique {
	public boolean isUnique(String s){
		for(int i = 0; i < s.length(); i++){
			if(s.lastIndexOf(s.charAt(i))!=i){
				return false;
			}
		}
		return true;
	}
}
