package silversliver.silversliver_2962;

import com.alibaba.fastjson.JSON;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public long countSubarrays(int[] nums, int k) {
        var max = 0;
        for (var x : nums)
            max = Math.max(max, x);

        var ans = 0L;
        int max_cnt = 0, left = 0;
        for (var n : nums) {
            if (n == max)
                max_cnt++;
            while (max_cnt == k) {
                if (nums[left] == max) {
                    max_cnt--;
                }
                left++;
            }
            ans += left;
        }
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
		int k = Integer.parseInt(inputJsonValues[1]);
        return JSON.toJSON(countSubarrays(nums, k));
    }
}
