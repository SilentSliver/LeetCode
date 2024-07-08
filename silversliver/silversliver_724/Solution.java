package silversliver.silversliver_724;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int pivotIndex(int[] nums) {
        var l_sum = 0;
        var r_sum = 0;
        for (int i = 0; i < nums.length; i++) r_sum += nums[i];
        for (int i = 0; i < nums.length; ++i) {
            r_sum -= nums[i];
            if (l_sum == r_sum)
                return i;
            l_sum += nums[i];
        }
        return -1;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(pivotIndex(nums));
    }
}
