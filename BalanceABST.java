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
    ArrayList<Integer> arr=new ArrayList<Integer>();
    public TreeNode balanceBST(TreeNode root) {       
        convertBSTToSortedArray(root);
        return balanceBSTUtil(0,arr.size()-1);
    }
    
    private TreeNode balanceBSTUtil(int start,int end){
       if(start>end) return null;
        int mid=(start+end)/2;
        TreeNode node=new TreeNode(arr.get(mid));   
        node.left=balanceBSTUtil(start,mid-1);
        node.right=balanceBSTUtil(mid+1,end);
        return node;
    }
    private void convertBSTToSortedArray(TreeNode root){
        if(root==null){
            return;
        }       
        convertBSTToSortedArray(root.left);
        arr.add(root.val);
        convertBSTToSortedArray(root.right);
    }
}
