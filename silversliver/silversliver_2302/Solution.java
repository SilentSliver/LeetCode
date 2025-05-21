package silversliver.silversliver_2302;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public long countSubarrays(int[] nums, long k) {
        long ans = 0, s = 0;
        for (int i = 0, j = 0; i < nums.length; ++i) {
            s += nums[i];
            while (s * (i - j + 1) >= k)
                s -= nums[j++];
            ans += i - j + 1;
        }
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
		long k = Long.parseLong(inputJsonValues[1]);
        return JSON.toJSON(countSubarrays(nums, k));
    }
}
