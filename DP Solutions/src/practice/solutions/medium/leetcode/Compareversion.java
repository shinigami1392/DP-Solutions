package practice.solutions.medium.leetcode;


public class Compareversion {
	public static void main(String[] args) {
		Compareversion cv = new Compareversion();
		
		System.out.println(cv.compareVersion("0.1", "1.1"));
	}
	
	
	public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int i = 0;
        int j = 0;
        System.out.println(v1.length);
        boolean larger = true;
        if(Integer.parseInt(v1[0])!=Integer.parseInt(v2[0])){
            larger = Integer.parseInt(v1[0]) > Integer.parseInt(v2[0]);
            return larger ? 1:-1;
        }
        while(i < v1.length && j <v2.length){
            
        }
        return 1;
    }
}
