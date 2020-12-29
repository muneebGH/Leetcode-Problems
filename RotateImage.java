//You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
//You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
//Example:
//        Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
//        Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

public class RotateImage {
    public void rotate(int[][] mat) {
        //take transpose
        int n=mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        //flip

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n/2); j++) {
                int temp=mat[i][j];
                mat[i][j]=mat[i][n-1-j];
                mat[i][n-1-j]=temp;
            }
        }
    }
}
