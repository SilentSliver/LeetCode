package silversliver.silversliver_3442;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int maxDifference(String s) {
        var cnt = new int[26];
        for (var c : s.toCharArray()) cnt[c - 'a']++;
        var a1 = Integer.MIN_VALUE;
        var a2 = Integer.MAX_VALUE;
        for (var val : cnt)
            if (val % 2 == 1)
                a1 = Math.max(a1, val);
            else if (val > 0)
                a2 = Math.min(a2, val);
        return a1 - a2;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String s = jsonStringToString(inputJsonValues[0]);
        return JSON.toJSON(maxDifference(s));
    }
}
