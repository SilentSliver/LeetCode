from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[[2, 4], [[1, 0, 1, 1], [2, 1, 1], [1, 0, 1, 0]]], Output=[2, 1]))
		self.testcases.append(case(Input=[[3, 5, 6], [[1, 0, 2, 2], [2, 1, 4], [1, 1, 2, 1], [1, 0, 1, 0]]], Output=[3, 1, 0]))
		self.testcases.append(case(Input=[[1, 2], [[1, 0, 1, 1], [2, 0, 3], [1, 0, 0, 1], [1, 0, 0, 2]]], Output=[1, 0, 1]))
		self.testcases.append(case(Input=[[1,2],[[1,0,1,1],[2,0,3],[1,0,0,1],[1,0,0,2]]], Output=[1,0,1]))

	def get_testcases(self):
		return self.testcases
