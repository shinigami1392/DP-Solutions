package practice.solutions.easy.leetcode;

public class HammingDistance {
	public static void main(String[] args) {
		HammingDistance hd = new HammingDistance();
		System.out.println(hd.hammingDistance(4, 5));
	}
	
	public int hammingDistance(int x, int y) {
        int xor = x^y;
        String s = Integer.toBinaryString(xor);
        int hammingDistance = 0;
        for(int i=0;i<s.length(); i++){
        	if(s.charAt(i)=='1'){
        		hammingDistance++;;
        	}
        }
        return hammingDistance;
      }
}
