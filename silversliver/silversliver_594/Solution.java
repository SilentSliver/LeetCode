package silversliver.silversliver_594;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int findLHS(int[] nums) {
                var cnt = new HashMap<Integer, Integer>();
        for (var n: nums) cnt.merge(n, 1, Integer::sum);
        var ans = 0;
        for(var entry: cnd.entrySet()) {
            int key = entry.getKey(), val = entry.getValue();
            if (cnt.containsKey(key + 1))
                ans = Math.max(ans, val + cnt.get(key + 1))
        }
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(findLHS(nums));
    }
}
