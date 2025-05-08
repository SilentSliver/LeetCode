package silversliver.silversliver_3152;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        var n = nums.length;
        var d = new int[n];
        for (int i = 1; i < n; i++)
            if (nums[i] % 2 != nums[i - 1] % 2)
                d[i] = d[i - 1];
            else
                d[i] = i;
        var m = queries.length;
        var ans = new boolean[m];
        for (var i = 0; i < m; ++i)
            ans[i] = d[queries[i][1]] <= queries[i][0];
        return ans;
    }



    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
		int[][] queries = jsonArrayToInt2DArray(inputJsonValues[1]);
        return JSON.toJSON(isArraySpecial(nums, queries));
    }
}
