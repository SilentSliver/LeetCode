from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input="successes", Output=6))
		self.testcases.append(case(Input="aeiaeia", Output=3))
		self.testcases.append(case(Input="aeiaeia", Output=3))

	def get_testcases(self):
		return self.testcases
