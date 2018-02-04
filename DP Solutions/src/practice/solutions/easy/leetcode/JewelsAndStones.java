package practice.solutions.easy.leetcode;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {

	public static void main(String[] args) {
		JewelsAndStones js = new JewelsAndStones();
		System.out.println(js.numJewelsInStones("aA", "aAAbbbb"));
	}
	
	public int numJewelsInStones(String J, String S) {
        int sol = 0;
        Map<Character, Integer> jewelMap = new HashMap<>();
        for(int i = 0; i<J.length(); i++){
        	if(jewelMap.containsKey(J.charAt(i))){
        		jewelMap.put(J.charAt(i), jewelMap.get(J.charAt(i))+1);
        	}
        	else{
        		jewelMap.put(J.charAt(i), 1);
        	}
        }
        
        for(int i = 0; i<S.length(); i++){
        	if(jewelMap.containsKey(S.charAt(i)))
        	{
        		sol++;
        		jewelMap.put(S.charAt(i), jewelMap.get(S.charAt(i))-1);
        	}
        }
        return sol;
    }

}
