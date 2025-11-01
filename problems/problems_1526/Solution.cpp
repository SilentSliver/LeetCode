//go:build ignore
#include "cpp/common/Solution.h"


using namespace std;
using json = nlohmann::json;

class Solution {
public:
    int minNumberOperations(vector<int>& target) {
        int ans = target[0];
        for (int i = 1; i < target.size(); ++i) {
            ans += max(0, target[i] - target[i - 1]);
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
	vector<int> target = json::parse(inputArray.at(0));
	return solution.minNumberOperations(target);
}
