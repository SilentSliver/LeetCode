from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=10, Output=4))
		self.testcases.append(case(Input=1, Output=0))
		self.testcases.append(case(Input=2, Output=1))
		self.testcases.append(case(Input=857, Output=247))

	def get_testcases(self):
		return self.testcases
