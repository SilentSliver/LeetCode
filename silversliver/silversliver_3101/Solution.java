package silversliver.silversliver_3101;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public long countAlternatingSubarrays(int[] nums) {
        long ans = 1, s = 1;
        for (int i = 1; i < nums.length; i++) {
            s = nums[i] != nums[i - 1] ? s + 1 : 1;
            ans += s;
        }
        return ans;
    }



    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(countAlternatingSubarrays(nums));
    }
}
