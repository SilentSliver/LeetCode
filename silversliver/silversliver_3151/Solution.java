package silversliver.silversliver_3151;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public boolean isArraySpecial(int[] nums) {
        var stat = 0;
        for (var n: nums)
            if (((n % 2 == 0) ? 1 : -1) != stat)
                stat = (n % 2 == 0) ? 1 : -1;
            else
                return false;
        return true;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(isArraySpecial(nums));
    }
}
