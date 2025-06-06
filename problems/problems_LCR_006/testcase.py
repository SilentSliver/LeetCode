from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[[1, 2, 4, 6, 10], 8], Output=[1, 3]))
		self.testcases.append(case(Input=[[2, 3, 4], 6], Output=[0, 2]))
		self.testcases.append(case(Input=[[-1, 0], -1], Output=[0, 1]))

	def get_testcases(self):
		return self.testcases
