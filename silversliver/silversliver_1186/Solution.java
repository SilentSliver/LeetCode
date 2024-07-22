package silversliver.silversliver_1186;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int maximumSum(int[] arr) {
        var n = arr.length;
        var left = new int[n];
        var right = new int[n];
        var ans = Integer.MIN_VALUE;
        for (int i = 0, s = 0; i < n; ++i) {
            s = Math.max(s, 0) + arr[i];
            left[i] = s;
            ans = Math.max(ans, left[i]);
        }
        for (int i = n - 1, s = 0; i >= 0; --i) {
            s = Math.max(s, 0) + arr[i];
            right[i] = s;
        }
        for (var i = 1; i < n - 1; ++i)
            ans = Math.max(ans, left[i - 1] + right[i + 1]);
        return ans;
    }



    @Override
    public Object solve(String[] inputJsonValues) {
        int[] arr = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(maximumSum(arr));
    }
}
