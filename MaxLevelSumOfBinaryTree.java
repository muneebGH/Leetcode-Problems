//Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.
//Return the smallest level X such that the sum of all the values of nodes at level X is maximal.
//Example:
//        Input: root = [1,7,0,7,-8,null,null]
//        Output: 2
//        Explanation:
//        Level 1 sum = 1.
//        Level 2 sum = 7 + 0 = 7.
//        Level 3 sum = 7 + -8 = -1.
//        So we return the level with the maximum sum which is level 2.


import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class MaxLevelSumOfBinaryTree {
    private class QueueStoredObject {

        public int level;
        public TreeNode n;

        public QueueStoredObject(int level, TreeNode n) {
            this.level = level;
            this.n = n;
        }
    }

    public int maxLevelSum(TreeNode root) {
        HashMap<Integer, Integer> levelSums = new HashMap<>();
        LinkedList<QueueStoredObject> queue = new LinkedList<>();
        queue.add(new QueueStoredObject(1, root));
        while (!queue.isEmpty()) {
            QueueStoredObject obj = queue.poll();
            int level = obj.level;
            TreeNode node = obj.n;
            Integer existingSumOfLevel = levelSums.getOrDefault(level, 0);
            levelSums.put(level, node.val + existingSumOfLevel);

            if (node.left != null) {
                queue.add(new QueueStoredObject(level + 1, node.left));
            }

            if (node.right != null) {
                queue.add(new QueueStoredObject(level + 1, node.right));
            }

        }
        return Collections.max(levelSums.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }
}
