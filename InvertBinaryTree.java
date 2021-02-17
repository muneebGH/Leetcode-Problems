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
    public TreeNode InvertBinaryTree(TreeNode root) {
        if(root==null){
            return root;
        }
        TreeNode fakeRootLeft=root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(fakeRootLeft);
        return root;
        
    }
}
