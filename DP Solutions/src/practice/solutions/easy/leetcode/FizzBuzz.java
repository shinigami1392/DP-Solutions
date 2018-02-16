package practice.solutions.easy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public List<String> fizzBuzz(int n) {
        List<String> solution = new ArrayList<>();
        for (int i = 1; i<=n; i++){
            if(i%3==0 && i%5==0){
                solution.add("FizzBuzz");
            }
            else if(i%3==0){
            	solution.add("Fizz");
            }
            else if(i%5==0){
            	solution.add("Buzz");
            }
            else{
            	solution.add(Integer.toString(i));
            }
        }
        return solution;
    }
}
