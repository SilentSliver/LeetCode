package silversliver.silversliver_3096;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int minimumLevels(int[] possible) {
        var l_sum = 0;
        var r_sum = 0;
        var n = possible.length;
        for (var i = 0; i < n; i++)
            r_sum += (possible[i] == 1? 1: -1);
        for (var i = 0; i < n - 1; i++) {
            var tmp = (possible[i] == 1? 1: -1);
            l_sum += tmp;
            r_sum -= tmp;
            if (l_sum > r_sum) return i + 1;
        }
        return -1;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] possible = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(minimumLevels(possible));
    }
}
