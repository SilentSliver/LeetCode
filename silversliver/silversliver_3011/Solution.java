package silversliver.silversliver_3011;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public boolean canSortArray(int[] nums) {
        var n = nums.length;
        for (var i = 0; i < n;) {
            var start = i;
            var ones = Integer.bitCount(nums[i++]);
            while (i < n && Integer.bitCount(nums[i]) == ones)
                i++;
            Arrays.sort(nums, start, i);
        }
        for (var i = 1; i < n; i++)
            if (nums[i] < nums[i - 1])
                return false;
        return true;
    }



    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(canSortArray(nums));
    }
}
