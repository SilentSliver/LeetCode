from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[[6, 4, 8, 5, 2, 7], [[0, 1], [0, 3], [2, 4], [3, 4], [2, 2]]], Output=[2, 5, -1, 5, 2]))
		self.testcases.append(case(Input=[[5, 3, 8, 2, 6, 1, 4, 6], [[0, 7], [3, 5], [5, 2], [3, 0], [1, 6]]], Output=[7, 6, -1, 4, 6]))

	def get_testcases(self):
		return self.testcases