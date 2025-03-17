package silversliver.silversliver_2506;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int similarPairs(String[] words) {
        int ans = 0;
        var cnt = new HashMap<Integer, Integer>();
        for (var s : words) {
            int x = 0;
            for (char c : s.toCharArray()) {
                x |= 1 << (c - 'a');
            }
            ans += cnt.merge(x, 1, Integer::sum) - 1;
        }
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String[] words = jsonArrayToStringArray(inputJsonValues[0]);
        return JSON.toJSON(similarPairs(words));
    }
}
