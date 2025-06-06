//go:build ignore
#include "cpp/common/Solution.h"


using namespace std;
using json = nlohmann::json;

class Solution {
public:
    int minimizedStringLength(string s) {
        int explored = 0, ans = 0;
		for (auto c: s) {
			int cur = c - 'a';
			if ((explored >> cur) & 1) {
				continue;
			}
			ans++;
			explored |= 1 << cur;
		}
		return ans;
    }
};

json leetcode::qubh::Solve(string input_json_values) {
	vector<string> inputArray;
	size_t pos = input_json_values.find('\n');
	while (pos != string::npos) {
		inputArray.push_back(input_json_values.substr(0, pos));
		input_json_values = input_json_values.substr(pos + 1);
		pos = input_json_values.find('\n');
	}
	inputArray.push_back(input_json_values);

	Solution solution;
	string s = json::parse(inputArray.at(0));
	return solution.minimizedStringLength(s);
}
