from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[[1, 2, 3, 1], 3, 0], Output=True))
		self.testcases.append(case(Input=[[1, 0, 1, 1], 1, 2], Output=True))
		self.testcases.append(case(Input=[[1,5,9,1,5,9],2,3], Output=False))

	def get_testcases(self):
		return self.testcases
