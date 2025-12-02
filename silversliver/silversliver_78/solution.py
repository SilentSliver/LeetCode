import solution
from typing import *


class Solution(solution.Solution):
    def solve(self, test_input=None):
        return self.subsets(test_input)

    def subsets(self, nums: List[int]) -> List[List[int]]:
        ans = []
        for i in range(1 << len(nums)):
            ans.append([x for j, x in enumerate(nums) if i >> j & 1])
        return ans
