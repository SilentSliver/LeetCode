package silversliver.silversliver_3024;

import com.alibaba.fastjson.JSON;
import java.util.*;
import java.util.stream.Collectors;

import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] + nums[1] <= nums[2])
            return "none";
        if (nums[0] == nums[2])
            return "equilateral";
        if (nums[0] == nums[1] || nums[1] == nums[2])
            return "isosceles";
        return "scalene";
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(triangleType(nums));
    }
}
