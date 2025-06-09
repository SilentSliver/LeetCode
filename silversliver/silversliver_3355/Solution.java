package silversliver.silversliver_3355;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        var n = nums.length;
        var d = new int[n + 1];
        for (var q : queries) {
            int l = q[0], r = q[1];
            ++d[l];
            --d[r + 1];
        }
        for (int i = 0, s = 0; i < n; i++) {
            s += d[i];
            if (nums[i] > s)
                return false;
        }
        return true;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
		int[][] queries = jsonArrayToInt2DArray(inputJsonValues[1]);
        return JSON.toJSON(isZeroArray(nums, queries));
    }
}
