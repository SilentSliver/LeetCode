from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[[9, 1, 2, 3, 9], 3], Output=20.0))
		self.testcases.append(case(Input=[[1, 2, 3, 4, 5, 6, 7], 4], Output=20.5))

	def get_testcases(self):
		return self.testcases
