from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[[1, 2, 3, 5, 2], [3, 2, 1, 4, 2]], Output=7))
		self.testcases.append(case(Input=[[3, 0, 0, 0, 0, 2], [3, 0, 0, 0, 0, 2]], Output=5))

	def get_testcases(self):
		return self.testcases
