import solution
from typing import *


class Solution(solution.Solution):
    def solve(self, test_input=None):
        return self.searchRange(*test_input)

    def searchRange(self, nums: List[int], target: int) -> List[int]:
        l, r = 0, len(nums) - 1
        while l <= r:
            mid = l + ((r - l) >> 1)
            if nums[mid] >= target:
                r = mid - 1
            else:
                l = mid + 1
        if l == len(nums) or nums[l] != target:
            return [-1, -1]
        for r in range(l, len(nums)):
            if nums[r] != target:
                break
        return [l, r - 1] if nums[r] != target else [l, r]

