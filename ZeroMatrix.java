import java.util.HashSet;

//Given an m x n matrix. If an element is 0, set its entire row and column to 0. Do it in-place.
//Follow up:
//    A straight forward solution using O(mn) space is probably a bad idea.
//    A simple improvement uses O(m + n) space, but still not the best solution.
//    Could you devise a constant space solution?
//Example:
//        Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
//        Output: [[1,0,1],[0,0,0],[1,0,1]]
//
//        Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
//        Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
public class ZeroMatrix {
    public static void solutionMPlusNSpace(int[][] matrix){
        //m+n space solution
        HashSet<Integer> rowSet=new HashSet<>();
        HashSet<Integer> colSet=new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(rowSet.contains(i)|| colSet.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }


}
