package silversliver.silversliver_120;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
        public int minimumTotal(List<List<Integer>> triangle) {
            var n = triangle.size();
            var f = new int[n + 1][n + 1];
            for (var i = n - 1; i >= 0; --i)
                for (var j = 0; j <= i; ++j)
                    f[i][j] = Math.min(f[i + 1][j], f[i + 1][j + 1]) + triangle.get(i).get(j);
            return f[0][0];
        }

    @Override
    public Object solve(String[] inputJsonValues) {
        List<List<Integer>> triangle = jsonArrayTo2DIntList(inputJsonValues[0]);
        return JSON.toJSON(minimumTotal(triangle));
    }
}
