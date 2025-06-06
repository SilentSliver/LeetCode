from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[3, [[0, 1, 1], [1, 2, 2]], 2, 4], Output=3))
		self.testcases.append(case(Input=[3, [[0, 1, 2], [0, 2, 3]], 1, 3], Output=2))
		self.testcases.append(case(Input=[3, [[0, 1, 6], [1, 2, 8]], 1, 6], Output=-1))

	def get_testcases(self):
		return self.testcases
