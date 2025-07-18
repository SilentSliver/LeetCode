from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[2, 4, 6, 5, 7], Output=3))
		self.testcases.append(case(Input=[2, 4, 5, 7], Output=1))
		self.testcases.append(case(Input=[1, 2, 3], Output=0))
		self.testcases.append(case(Input=[4, 5, 6, 8], Output=-1))

	def get_testcases(self):
		return self.testcases
