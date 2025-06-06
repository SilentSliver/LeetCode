from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[1, 2, 1, 4, 1], Output=1))
		self.testcases.append(case(Input=[1, 1, 1], Output=0))
		self.testcases.append(case(Input=[7,8,-3], Output=1))

	def get_testcases(self):
		return self.testcases
