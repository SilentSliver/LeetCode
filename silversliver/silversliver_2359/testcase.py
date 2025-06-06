from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[[2, 2, 3, -1], 0, 1], Output=2))
		self.testcases.append(case(Input=[[1, 2, -1], 0, 2], Output=2))

	def get_testcases(self):
		return self.testcases
