import solution
from typing import *


class Solution(solution.Solution):
    def solve(self, test_input=None):
        return self.canJump(test_input)

    def canJump(self, nums: List[int]) -> bool:
        mx = 0
        for i, jump in enumerate(nums):
            if i > mx:  # 无法到达 i
                return False
            mx = max(mx, i + jump)
            if mx >= len(nums) - 1:
                return True
