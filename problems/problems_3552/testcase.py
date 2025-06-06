from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
	def __init__(self):
		self.testcases = []
		self.testcases.append(case(Input=['A..', '.A.', '...'], Output=2))
		self.testcases.append(case(Input=['.#...', '.#.#.', '.#.#.', '...#.'], Output=13))

	def get_testcases(self):
		return self.testcases
