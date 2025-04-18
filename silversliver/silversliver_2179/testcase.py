from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[[2, 0, 1, 3], [0, 1, 2, 3]], Output=1))
		self.testcases.append(case(Input=[[4, 0, 1, 3, 2], [4, 1, 0, 2, 3]], Output=4))

	def get_testcases(self):
		return self.testcases
