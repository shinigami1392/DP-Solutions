package practice.solutions.easy.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDifferenceInStrings {
	public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
        		if(map.containsKey(t.charAt(i))){
        			map.put(t.charAt(i), map.get(t.charAt(i))+1);
        		}
        		else {
        			map.put(t.charAt(i), 1);
        		}
        }
        for (int i = 0; i < s.length(); i++) {
	    		if(map.get(s.charAt(i)) > 1){
	    			map.put(s.charAt(i), map.get(s.charAt(i))-1);
	    		}
	    		else if(map.get(s.charAt(i)) == 1){
	    			map.remove(s.charAt(i));
	    		}
    		}
        Set<Character> keySet = map.keySet();
        Object[] ch = keySet.toArray();
        
        return map.keySet().toArray()[0].toString().charAt(0);
    }
	
	public static void main(String[] args) {
		FindDifferenceInStrings fd = new FindDifferenceInStrings();
		System.out.println(fd.findTheDifference("aad", "aade"));
	}
}
