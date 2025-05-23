from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=[3, 3, 3], Output="equilateral"))
		self.testcases.append(case(Input=[3, 4, 5], Output="scalene"))
		self.testcases.append(case(Input=[3,3,3], Output="equilateral"))
		self.testcases.append(case(Input=[9,4,9], Output="isosceles"))

	def get_testcases(self):
		return self.testcases
