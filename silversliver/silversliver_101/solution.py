import solution
from typing import *
from python.object_libs import list_to_tree


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution(solution.Solution):
    def solve(self, test_input=None):
        nums0 = test_input
        root0 = list_to_tree(nums0)
        return self.isSymmetric(root0)

    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        return self.isSymTree(left=root.left, right=root.right)

    def isSymTree(self, left: Optional[TreeNode], right: Optional[TreeNode]) -> bool:
        if left is None or right is None:
            return left is right
        return left.val == right.val and \
            self.isSymTree(left=left.left, right=right.right) and \
            self.isSymTree(left=right.left, right=left.right)

