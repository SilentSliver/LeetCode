package silversliver.silversliver_3423;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int maxAdjacentDistance(int[] nums) {
        var n = nums.length;
        var ans = 0;
        for (var i = 0; i < n; i++)
            ans = Math.max(ans, Math.abs(nums[(i + 1) % n] - nums[i]));
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(maxAdjacentDistance(nums));
    }
}
