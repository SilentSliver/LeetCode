from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[[[1, 2, 5], [2, 1, 7], [3, 1, 9]], 2], Output=[2, 1]))
		self.testcases.append(case(Input=[[[23, 11, 21]], 9], Output=[23, 11]))
		self.testcases.append(case(Input=[[[1, 2, 13], [2, 1, 7], [0, 1, 9]], 2], Output=[1, 2]))

	def get_testcases(self):
		return self.testcases
