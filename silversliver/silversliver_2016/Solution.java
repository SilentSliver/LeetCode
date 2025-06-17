package silversliver.silversliver_2016;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int maximumDifference(int[] nums) {
        var n = nums.length;
        var ans = -1;
        var cur_min = nums[0];
        for (var i = 1; i < n; i++) {
            if (cur_min > nums[i])
                cur_min = nums[i];
            else
                ans = Math.max(ans, nums[i] - cur_min);
        }
        return ans > 0 ? ans : -1;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(maximumDifference(nums));
    }
}
