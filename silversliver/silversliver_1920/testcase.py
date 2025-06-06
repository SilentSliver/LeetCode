from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[0, 2, 1, 5, 3, 4], Output=[0, 1, 2, 4, 5, 3]))
		self.testcases.append(case(Input=[5, 0, 1, 2, 3, 4], Output=[4, 5, 0, 1, 2, 3]))

	def get_testcases(self):
		return self.testcases
