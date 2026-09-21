# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        return self.validate(root,None,None)

    def validate(self,node:Optional[TreeNode], min: int, max: int) -> bool:
        if node is None:
            return True

        if(min is not None and node.val<=min or max is not None and node.val>=max):
            return False
        
        return self.validate(node.left, min,node.val) and self.validate(node.right,node.val, max)
        