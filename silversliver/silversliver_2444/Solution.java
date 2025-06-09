package silversliver.silversliver_2444;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {

    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        int j1 = -1, j2 = -1, k = -1;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] < minK || nums[i] > maxK) {
                k = i;
            }
            if (nums[i] == minK) {
                j1 = i;
            }
            if (nums[i] == maxK) {
                j2 = i;
            }
            ans += Math.max(0, Math.min(j1, j2) - k);
        }
        return ans;
    }


    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
		int minK = Integer.parseInt(inputJsonValues[1]);
		int maxK = Integer.parseInt(inputJsonValues[2]);
        return JSON.toJSON(countSubarrays(nums, minK, maxK));
    }
}
