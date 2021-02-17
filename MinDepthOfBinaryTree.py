# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def minDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if not root: return 0
        if(not root.left) and (not root.right):
            return 1
        l=-1
        r=-1
        if root.left:
            l=self.minDepth(root.left)
        if root.right:
            r=self.minDepth(root.right)
        if l==-1: return r+1
        if r==-1: return l+1
        return min(l,r)+1
        
