package silversliver.silversliver_1920;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int[] buildArray(int[] nums) {
        for(var i = 0; i < nums.length; i++)
            nums[i] = nums[nums[i]];
        return nums;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(buildArray(nums));
    }
}
