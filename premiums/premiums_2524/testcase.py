from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[[1, 1, 1, 2, 1, 2], 3], Output=5))
		self.testcases.append(case(Input=[[1, 1, 1, 1, 1, 1], 4], Output=1))

	def get_testcases(self):
		return self.testcases