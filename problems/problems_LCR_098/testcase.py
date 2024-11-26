from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[3, 7], Output=28))
		self.testcases.append(case(Input=[3, 2], Output=3))
		self.testcases.append(case(Input=[7, 3], Output=28))
		self.testcases.append(case(Input=[3, 3], Output=6))

	def get_testcases(self):
		return self.testcases