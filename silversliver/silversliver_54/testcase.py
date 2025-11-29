from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[[1, 2, 3], [4, 5, 6], [7, 8, 9]], Output=[1, 2, 3, 6, 9, 8, 7, 4, 5]))
		self.testcases.append(case(Input=[[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]], Output=[1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]))

	def get_testcases(self):
		return self.testcases
