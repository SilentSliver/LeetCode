from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[2, 6, 4, 1], Output=False))
		self.testcases.append(case(Input=[1, 2, 34, 3, 4, 5, 7, 23, 12], Output=True))

	def get_testcases(self):
		return self.testcases
