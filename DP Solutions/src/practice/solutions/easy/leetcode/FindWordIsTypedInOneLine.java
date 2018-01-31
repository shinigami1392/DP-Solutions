package practice.solutions.easy.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWordIsTypedInOneLine {
	
	public static void main(String[] args) {
		FindWordIsTypedInOneLine fw = new FindWordIsTypedInOneLine();
		String[] words = {"qer","asdw","asd","asc","zxc","zxs"};
		String[] sol = fw.findWords(words);
		
		for(int i = 0; i < sol.length; i++){
			System.out.println(sol[i]);
		}
	}
	
	public String[] findWords(String[] words) {
	        List<String> sol = new ArrayList<>();
	        Character[] r0 = {'q','w','e','r','t','y','u','i','o','p'};
	        Character[] r1 = {'a','s','d','f','g','h','j','k','l'};
	        Character[] r2 = {'z','x','c','v','b','n','m'};
	        List<Character> row0 = Arrays.asList(r0);
	        List<Character> row1 = Arrays.asList(r1);
	        List<Character> row2 = Arrays.asList(r2);
	        
	        for (int i = 0; i < words.length; i++){
	        	int rowNum = 0;
	        	boolean flag = true;
	        	if(row0.contains(words[i].charAt(0))){
	        		rowNum = 0;
	        	}
	        	if(row1.contains(words[i].charAt(0))){
	        		rowNum = 1;
	        	}
	        	if(row2.contains(words[i].charAt(0))){
	        		rowNum = 2;
	        	}
	        	for (int j = 0; j < words[i].length(); j++) {
	        		int currentNum = 0;
	        		if(row0.contains(words[i].charAt(j))){
	        			currentNum = 0;
		        	}
		        	if(row1.contains(words[i].charAt(j))){
		        		currentNum = 1;
		        	}
		        	if(row2.contains(words[i].charAt(j))){
		        		currentNum = 2;
		        	}
		        	if(currentNum!=rowNum){
		        		flag = false;
		        		break;
		        	}
				}
	        	if (flag){
	        		sol.add(words[i]);
	        	}
	        }
	        
	        return sol.toArray(new String[0]);
	    }

}
