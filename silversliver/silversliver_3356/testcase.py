from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[[2, 0, 2], [[0, 2, 1], [0, 2, 1], [1, 1, 3]]], Output=2))
		self.testcases.append(case(Input=[[4, 3, 2, 1], [[1, 3, 2], [0, 2, 1]]], Output=-1))

	def get_testcases(self):
		return self.testcases
