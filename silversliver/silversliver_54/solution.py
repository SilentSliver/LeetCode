import solution
from typing import *


class Solution(solution.Solution):
    def solve(self, test_input=None):
        return self.spiralOrder(test_input)

    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        ans = list()
        m, n = len(matrix), len(matrix[0])
        c_min, c_max = 0, n
        r_min, r_max = 0, m
        while c_min < c_max or r_min < r_max:
            if r_min < r_max:
                for i in range(c_min, c_max):
                    ans.append(matrix[r_min][i])
                r_min += 1
            if c_min < c_max:
                for i in range(r_min, r_max):
                    ans.append(matrix[i][c_max - 1])
                c_max -= 1
            if r_min < r_max:
                for i in range(c_max - 1, c_min - 1, -1):
                    ans.append(matrix[r_max - 1][i])
                r_max -= 1
            if c_min < c_max:
                for i in range(r_max - 1, r_min - 1, -1):
                    ans.append(matrix[i][c_min])
                c_min += 1
        print(ans)
        return ans
    
