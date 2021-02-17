/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        return diameterOfBTUtil(root)[0];
        
    }
    
    
    private int[] diameterOfBTUtil(TreeNode root){
        //int[0] will be the return diameter of childern
        //int[1] will be the maximum depth of childs childerns
        if(root==null){
            return new int[]{-1,-1};
        }
        int[] leftData=diameterOfBTUtil(root.left);
        int[] rightData=diameterOfBTUtil(root.right);
        leftData[1]++;
        rightData[1]++;
        int maxDiameter=leftData[0]>rightData[0]?leftData[0]:rightData[0];
        if(leftData[1]+rightData[1]>maxDiameter){
            maxDiameter=leftData[1]+rightData[1];
        }
        return new int[]{maxDiameter,leftData[1]>rightData[1]?leftData[1]:rightData[1]};
    }
}
