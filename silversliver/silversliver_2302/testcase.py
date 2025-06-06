from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[[2, 1, 4, 3, 5], 10], Output=6))
		self.testcases.append(case(Input=[[1, 1, 1], 5], Output=5))

	def get_testcases(self):
		return self.testcases
