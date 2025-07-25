from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=['cba', 'abcd'], Output="cbad"))
		self.testcases.append(case(Input=['bcafg', 'abcd'], Output="bcad"))

	def get_testcases(self):
		return self.testcases
