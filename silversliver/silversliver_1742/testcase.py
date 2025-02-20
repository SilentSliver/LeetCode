from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[1, 10], Output=2))
		self.testcases.append(case(Input=[5, 15], Output=2))
		self.testcases.append(case(Input=[19, 28], Output=2))

	def get_testcases(self):
		return self.testcases
