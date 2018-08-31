package practice.solutions.ctci.arrays.strings;

/*
* @author: pushkarladhe
*
* 1.7 Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
* bytes, write a method to rotate the image by 90 degrees. Done in place.
* TODO: NOTE: The matrix rotates by 90 degrees clockwise
*
* */
public class RotateMatrix {
    public static void main(String[] args) {
        RotateMatrix rm = new RotateMatrix();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rm.rotateMatrix(matrix);
    }

    public void rotateMatrix(int[][] matrix){

        // Print before rotation

        for (int i = 0; i <matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println();

        for (int i = 0; i < matrix.length/2; i++){
            for (int j = i; j < matrix.length-i-1; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-j-1][i];
                matrix[matrix.length-j-1][i] = matrix[matrix.length-i-1][matrix.length-j-1];
                matrix[matrix.length-i-1][matrix.length-j-1] = matrix[j][matrix.length-i-1];
                matrix[j][matrix.length-i-1] = temp;
            }
        }

        System.out.println();

        // Print after rotation
        for (int i = 0; i <matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
