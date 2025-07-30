package silversliver.silversliver_2419;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int longestSubarray(int[] nums) {
        var max = Arrays.stream(nums).max().getAsInt();
        var ans = 0;
        var cnt = 0;
        for (var n: nums) 
            if (max == n)
                ans = Math.max(ans, ++cnt);
            else
                cnt = 0;
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(longestSubarray(nums));
    }
}
