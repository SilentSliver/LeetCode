import solution
from typing import *


class Solution(solution.Solution):
    def solve(self, test_input=None):
        return self.searchMatrix(*test_input)

    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        range_list = [(line[0], line[-1]) for line in matrix]
        idx = -1
        for i in range(len(range_list)):
            min, max = range_list[i]
            if target >= min and target <= max:
                idx = i
                break
        if idx == -1:
            return False
        return target in matrix[idx]


