package silversliver.silversliver_3102;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int minimumDistance(int[][] points) {
        var tm1 = new TreeMap<Integer, Integer>();
        var tm2 = new TreeMap<Integer, Integer>();
        for (var p : points) {
            int x = p[0], y = p[1];
            tm1.merge(x + y, 1, Integer::sum);
            tm2.merge(x - y, 1, Integer::sum);
        }
        var ans = Integer.MAX_VALUE;
        for (var p : points) {
            int x = p[0], y = p[1];
            if (tm1.merge(x + y, -1, Integer::sum) == 0)
                tm1.remove(x + y);
            if (tm2.merge(x - y, -1, Integer::sum) == 0)
                tm2.remove(x - y);
            ans = Math.min(
                    ans, Math.max(tm1.lastKey() - tm1.firstKey(), tm2.lastKey() - tm2.firstKey()));
            tm1.merge(x + y, 1, Integer::sum);
            tm2.merge(x - y, 1, Integer::sum);
        }
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[][] points = jsonArrayToInt2DArray(inputJsonValues[0]);
        return JSON.toJSON(minimumDistance(points));
    }
}
