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
class AverageOfLevelsBinaryTree {
    class Data{
        TreeNode node;
        int level;
        Data(TreeNode n, int l){
            node=n;
            level=l;
        }
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<Double>();
        Queue<Data> q=new LinkedList<Data>();
        q.offer(new Data(root,0));
        int currentLevel=0;
        double currentLevelSum=0;
        int currentLevelNodeCount=0;
        while(q.size()>0){
            Data d=q.poll();
            if(d.node.left!=null){
                q.add(new Data(d.node.left,d.level+1));
            }
            
            if(d.node.right!=null){
                q.add(new Data(d.node.right,d.level+1));
            }
            
            if(d.level!=currentLevel){
                res.add((double)currentLevelSum/(double)currentLevelNodeCount);
                currentLevelSum=0;
                currentLevelNodeCount=0;
                currentLevel++;
            }
            currentLevelSum=currentLevelSum+d.node.val;
            currentLevelNodeCount++;
            
        }
        
        res.add((double)currentLevelSum/(double)currentLevelNodeCount);
        
        return res;
    }
}
