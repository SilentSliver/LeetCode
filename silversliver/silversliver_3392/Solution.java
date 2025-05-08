package silversliver.silversliver_3392;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int countSubarrays(int[] nums) {
        var ans = 0;
        var n = nums.length;
        for (var i = 0; i < n - 2; i++)
            if ((nums[i] * 2 + nums[i + 2] * 2) == nums[i + 1])
                ans++;
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(countSubarrays(nums));
    }
}
