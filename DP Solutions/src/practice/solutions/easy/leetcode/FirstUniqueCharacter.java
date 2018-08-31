package practice.solutions.easy.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {
	
	public int firstUniqChar(String s) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for (int i = 0; i < s.length(); i++){
			if(map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else{
				map.put(s.charAt(i), 1);
			}
		}
		
		for (char ch: map.keySet()){
			if(map.get(ch) == 1){
				return s.indexOf(ch);
			}
		}
		return -1;
	}
}
