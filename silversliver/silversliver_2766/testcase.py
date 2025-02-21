from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[[1, 6, 7, 8], [1, 7, 2], [2, 9, 5]], Output=[5, 6, 8, 9]))
		self.testcases.append(case(Input=[[1, 1, 3, 3], [1, 3], [2, 2]], Output=[2]))
		self.testcases.append(case(Input=[[4,6,6,9,18],[18,6,17,4,9,19,2],[23,17,20,19,11,2,20]], Output=[11,20,23]))
		self.testcases.append(case(Input=[[5,7,8,15],[5,7,8,9],[9,15,2,7]], Output=[2,7,15]))
		self.testcases.append(case(Input=[[1,6,7,8],[1,7,2],[2,9,5]], Output=[5,6,8,9]))

	def get_testcases(self):
		return self.testcases
