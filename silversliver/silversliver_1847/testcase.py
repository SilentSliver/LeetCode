from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[[[2, 2], [1, 2], [3, 2]], [[3, 1], [3, 3], [5, 2]]], Output=[3, -1, 3]))
		self.testcases.append(case(Input=[[[1, 4], [2, 3], [3, 5], [4, 1], [5, 2]], [[2, 3], [2, 4], [2, 5]]], Output=[2, 1, 3]))

	def get_testcases(self):
		return self.testcases
