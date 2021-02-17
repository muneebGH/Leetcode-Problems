
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
class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null) return null;
        if(root1==null || root2==null){
            if(root1==null){
                return root2;
            }else{  
                return root1;
            }
        }
        
        TreeNode toReturn=new TreeNode(root1.val+root2.val);
        toReturn.left=mergeTrees(root1.left,root2.left);
        toReturn.right=mergeTrees(root1.right,root2.right);
        return toReturn;       
    }
}
