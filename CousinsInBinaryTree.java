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
    class Data{
        int parentVal;
        int level;
        TreeNode node;
        Data(TreeNode n, int _parentVal,int _level){
            node=n;
            parentVal=_parentVal;
            level=_level;
        }
        Data(TreeNode n,int _level){
            node=n;
            level=_level;
        }
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null)return false;
        LinkedList<Data> q=new LinkedList<Data>();
        q.add(new Data(root,0));
        Data xData=null;
        Data yData=null;
        while(!q.isEmpty()){
               
            Data d=q.poll();  
            if(d.node.val==x){
                xData=d;
                if(yData!=null){
                    if(yData.level==xData.level && yData.parentVal!=xData.parentVal){
                        return true;
                    }else{
                        return false;
                    }   
                }
            }
            if(d.node.val==y){
                yData=d;
                if(xData!=null){
                    if(yData.level==xData.level && yData.parentVal!=xData.parentVal){
                        return true;
                    }else{
                        return false;
                    }   
                }
            }
            if(d.node.left!=null){
                q.add(new Data(d.node.left,d.node.val,d.level+1));
            }
            
            if(d.node.right!=null){
                q.add(new Data(d.node.right,d.node.val,d.level+1));
            }
            
        }
        
        return false;
        
        
    }
}
