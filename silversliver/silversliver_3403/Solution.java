package silversliver.silversliver_3403;

import com.alibaba.fastjson.JSON;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public String answerString(String word, int numFriends) {
        if (numFriends == 1)
            return word;
        var n = word.length();
        var ans = "";
        for (var i = 0; i < n; ++i) {
            var tmp = word.substring(i, Math.min(n, i + n - (numFriends - 1)));
            if (ans.compareTo(tmp) < 0)
                ans = tmp;
        }
        return ans;

    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String word = jsonStringToString(inputJsonValues[0]);
		int numFriends = Integer.parseInt(inputJsonValues[1]);
        return JSON.toJSON(answerString(word, numFriends));
    }
}
