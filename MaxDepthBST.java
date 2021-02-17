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
class MaxDepthBST {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftSubTreeLength=maxDepth(root.left);
        int rightSubTreeLength=maxDepth(root.right);
        int length=leftSubTreeLength>=rightSubTreeLength?leftSubTreeLength+1:rightSubTreeLength+1;
        return length;
        
    }
}
