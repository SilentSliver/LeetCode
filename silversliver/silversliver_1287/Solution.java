package silversliver.silversliver_1287;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int findSpecialInteger(int[] arr) {
        var n = arr.length;
        for (int i = 0; i < n; i++)
            if (arr[i] == (arr[i + (n >> 2)]))
                return arr[i];
        return -1;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] arr = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(findSpecialInteger(arr));
    }
}
