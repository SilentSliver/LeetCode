package silversliver.silversliver_1299;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int[] replaceElements(int[] arr) {
        var tmp = -1;
        for (var i = arr.length - 1; i >= 0; i--) {
            var cur = arr[i];
            arr[i] = tmp;
            tmp = Math.max(cur, tmp);
        }
        return arr;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] arr = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(replaceElements(arr));
    }
}
