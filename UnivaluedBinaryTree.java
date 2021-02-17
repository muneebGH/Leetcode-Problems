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
class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {

        return isUnivalHelper(root,root.val);
    }
    
    private boolean isUnivalHelper(TreeNode root, int val){
        
        if(root==null){
            return true;
        }
        
        return (root.val==val && isUnivalHelper(root.left,val) && isUnivalHelper(root.right,val));
              
    }
}
