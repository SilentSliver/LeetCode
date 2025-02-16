package silversliver.silversliver_2860;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int countWays(List<Integer> nums) {
        Collections.sort(nums);
        var n = nums.size();
        var ans = 0;
        for (var i = 0; i <= n; i++)
            if ((i == 0 || nums.get(i - 1) < i) && (i == n || nums.get(i) > i))
                ans++;

        return ans;

    }

    @Override
    public Object solve(String[] inputJsonValues) {
        List<Integer> nums = jsonArrayToIntList(inputJsonValues[0]);
        return JSON.toJSON(countWays(nums));
    }
}
