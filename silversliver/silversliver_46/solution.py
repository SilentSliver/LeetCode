import solution
from typing import *


class Solution(solution.Solution):
    def solve(self, test_input=None):
        return self.permute(test_input)

    def permute(self, nums: List[int]) -> List[List[int]]:
        ans = list()
        self.dfs(ans, list(), nums, 0)
        return ans

    def dfs(self, res: List[List[int]], cur: List[int], nums: List[int], idx: int):
        if len(cur) ==  len(nums):
            res.append(cur[:])
            return
        for i in range(len(nums)):
            if nums[i] in cur:
                continue
            cur.append(nums[i])
            self.dfs(res, cur, nums, idx+1)
            cur.remove(nums[i])

