from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[[2, 11, 10, 1, 3], 10], Output=2))
		self.testcases.append(case(Input=[[1, 1, 2, 4, 9], 20], Output=4))

	def get_testcases(self):
		return self.testcases
