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
class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null){
            return new ArrayList<String>();
        }else if(root.left==null && root.right==null){
            List<String> ls= new ArrayList<String>();
            ls.add(String.valueOf(root.val));
            return ls;
        }
        
        List<String> leftPaths=new ArrayList<String>();
        List<String> rightPaths=new ArrayList<String>();
        if(root.left!=null){
            leftPaths=binaryTreePaths(root.left);
        }
        if(root.right!=null){
            rightPaths=binaryTreePaths(root.right);
        }
        
        leftPaths.addAll(rightPaths);
        return leftPaths.stream().map(str -> String.valueOf(root.val)+"->"+str).collect(Collectors.toList());
        
        
    }
}
