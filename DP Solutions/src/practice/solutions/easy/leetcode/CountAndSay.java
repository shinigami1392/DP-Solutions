package practice.solutions.easy.leetcode;

public class CountAndSay {
	public String countAndSay(int n) {
        String s = "1";
        for(int i = 1; i < n; i++){
            s = currentCountAndSay(s);
        }
        return s;
    }
    
    public String currentCountAndSay(String s){
        StringBuilder sb = new StringBuilder();
        char curr = s.charAt(0);
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i)==curr){
                count++;
            }
            else{
                sb.append(count);
                sb.append(curr);
                curr = s.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(curr);
        return sb.toString();
    }
}
