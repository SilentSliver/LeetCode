package silversliver.silversliver_2900;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        var n = groups.length;
        var ans = new ArrayList<String>();
        for (var i = 0; i < n; ++i)
            if (i == 0 || groups[i] != groups[i - 1])
                ans.add(words[i]);
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String[] words = jsonArrayToStringArray(inputJsonValues[0]);
		int[] groups = jsonArrayToIntArray(inputJsonValues[1]);
        return JSON.toJSON(getLongestSubsequence(words, groups));
    }
}
