from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[2, 9, [4, 6]], Output=3))
		self.testcases.append(case(Input=[6, 8, [7, 6, 8]], Output=0))

	def get_testcases(self):
		return self.testcases
