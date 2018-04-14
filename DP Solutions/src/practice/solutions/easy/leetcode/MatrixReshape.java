package practice.solutions.easy.leetcode;

public class MatrixReshape {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int[][] reshaped = new int[r][c];
		int rc = 0;
		int cc=-1;
		for(int i = 0; i < nums.length; i++){
			
			if(cc >= c){
				rc ++;
				cc = -1;
			}
			for(int j = 0; j<nums[0].length; j++){
				cc++;
				if(cc<c && rc < r){
					reshaped[rc][cc] = nums[i][j];
				}else{
					cc=0;
					rc++;
					reshaped[rc][cc] = nums[i][j];
				}
			}
		}
		return reshaped;
	}
	
	public static void main(String[] args) {
		MatrixReshape mr = new MatrixReshape();
		int[][] reshaped = mr.matrixReshape(new int[][]{{1,2,3},{4,5,6}}, 3, 2);
		for(int i = 0; i < reshaped.length; i++){
			for (int j = 0; j < reshaped[0].length; j++){
				System.out.print(reshaped[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
