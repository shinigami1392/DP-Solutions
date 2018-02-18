package practice.solutions.easy.leetcode;

public class OnesCompliment {
	public int findComplement(int num) {
		StringBuffer sb = new StringBuffer(Integer.toBinaryString(num));
			for(int i = 0; i < sb.length(); i++){
				if(sb.charAt(i)=='1'){
					sb.setCharAt(i, '0');
				}
				else{
					sb.setCharAt(i, '1');
				}
			}
			return Integer.parseInt(sb.toString(),2);
	    }
	
	public static void main(String[] args) {
		OnesCompliment oc = new OnesCompliment();
		System.out.println( oc.findComplement(1));
	}
}
