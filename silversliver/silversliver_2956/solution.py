import solution
from typing import *


class Solution(solution.Solution):
    def solve(self, test_input=None):
        return self.findIntersectionValues(*test_input)

    def findIntersectionValues(self, nums1: List[int], nums2: List[int]) -> List[int]:
        s1, s2 = set(nums1), set(nums2)
        return [sum(n in s2 for n in nums1), sum(n in s1 for n in nums2)]

