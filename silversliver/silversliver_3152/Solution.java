package silversliver.silversliver_3152;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {

    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
		int[][] queries = jsonArrayToInt2DArray(inputJsonValues[1]);
        return JSON.toJSON(isArraySpecial(nums, queries));
    }
}
