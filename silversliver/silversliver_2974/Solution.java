package silversliver.silversliver_2974;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        var n = nums.length;
        for (int i = 0; i < n; i += 2){
            var tmp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = tmp;
        }
        return nums;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(numberGame(nums));
    }
}
