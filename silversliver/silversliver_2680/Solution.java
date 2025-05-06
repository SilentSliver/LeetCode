package silversliver.silversliver_2680;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public long maximumOr(int[] nums, int k) {
        int n = nums.length;
        // suf[i] 表示 nums[i+1] 到 nums[n-1] 的 OR
        int[] suf = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            suf[i] = suf[i + 1] | nums[i + 1];
        }

        long ans = 0;
        // pre 表示 nums[0] 到 nums[i-1] 的 OR
        int pre = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, pre | ((long) nums[i] << k) | suf[i]);
            pre |= nums[i];
        }
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
		int k = Integer.parseInt(inputJsonValues[1]);
        return JSON.toJSON(maximumOr(nums, k));
    }
}
