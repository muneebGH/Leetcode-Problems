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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length==0) return null;
        int max=Arrays.stream(nums).max().getAsInt();
        TreeNode n=new TreeNode(max);
        int indexOfMax=IntStream.range(0,nums.length).filter(i->max==nums[i]).findFirst().orElse(-1);
        int[] prefixArray=Arrays.copyOfRange(nums,0,indexOfMax);
        int[] suffixArray=Arrays.copyOfRange(nums,indexOfMax+1,nums.length);
        n.left=constructMaximumBinaryTree(prefixArray);
        n.right=constructMaximumBinaryTree(suffixArray);
        return n;
                
    }
}
