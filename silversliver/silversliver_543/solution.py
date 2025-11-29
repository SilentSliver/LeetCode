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
        return self.diameterOfBinaryTree(root0)

    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        ans = 0
        def dfs(node: Optional[TreeNode]) -> int:
            if node is None:
                return -1
            left_max = dfs(node.left) + 1
            right_max = dfs(node.right) + 1
            nonlocal ans
            ans = max(ans, left_max + right_max)
            return max(left_max, right_max)
        dfs(root)
        return ans