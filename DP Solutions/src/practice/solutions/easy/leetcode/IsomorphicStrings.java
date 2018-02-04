package practice.solutions.easy.leetcode;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        boolean flag = false;
        StringBuffer isoS = new StringBuffer();
        StringBuffer isoT = new StringBuffer();

        for(int i = 0;i<s.length(); i++){
            isoS.append(s.indexOf(s.charAt(i)));
            isoT.append(t.indexOf(t.charAt(i)));
        }
        if (isoS.toString().equals(isoT.toString())){
            return true;
        }
        return false;
    }

}
