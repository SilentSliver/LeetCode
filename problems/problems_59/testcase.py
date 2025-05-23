from collections import namedtuple
import testcase

case = namedtuple("Testcase", ["Input", "Output"])


class Testcase(testcase.Testcase):
    def __init__(self):
        self.testcases = []
        self.testcases.append(case(Input=3, Output=[[1,2,3],[8,9,4],[7,6,5]]))
        self.testcases.append(case(Input=1, Output=[[1]]))
        self.testcases.append(case(Input=2, Output=[[1,2],[4,3]]))

    def get_testcases(self):
        return self.testcases