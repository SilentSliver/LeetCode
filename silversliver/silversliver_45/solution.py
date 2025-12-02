import solution
from typing import *


class Solution(solution.Solution):
    def solve(self, test_input=None):
        return self.jump(test_input)

    def jump(self, nums: List[int]) -> int:
        ans = 0
        cur_r = 0
        next_r = 0
        for i in range(len(nums) - 1):
            next_r = max(next_r, i + nums[i])
            if i == cur_r:
                cur_r = next_r
                ans += 1
        return ans

