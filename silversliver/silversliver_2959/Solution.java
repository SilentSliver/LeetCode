package silversliver.silversliver_2959;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int numberOfSets(int n, int maxDistance, int[][] roads) {
        var ans = 0;
        for (var mask = 0; mask < 1 << n; mask++) {
            var g = new int[n][n];
            for (var e : g) Arrays.fill(e, 1 << 29);

            for (var e : roads) {
                int u = e[0], v = e[1], w = e[2];
                if ((mask >> u & 1) == 1 && (mask >> v & 1) == 1) {
                    g[u][v] = Math.min(g[u][v], w);
                    g[v][u] = Math.min(g[v][u], w);
                }
            }
            for (var k = 0; k < n; ++k)
                if ((mask >> k & 1) == 1) {
                    g[k][k] = 0;
                    for (var i = 0; i < n; ++i)
                        for (var j = 0; j < n; ++j)
                            g[i][j] = Math.min(g[i][j], g[i][k] + g[k][j]);
                }

            var ok = 1;
            for (var i = 0; i < n && ok == 1; ++i)
                for (var j = 0; j < n && ok == 1; ++j)
                    if ((mask >> i & 1) == 1 && (mask >> j & 1) == 1)
                        if (g[i][j] > maxDistance)
                            ok = 0;
            ans += ok;
        }
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int n = Integer.parseInt(inputJsonValues[0]);
		int maxDistance = Integer.parseInt(inputJsonValues[1]);
		int[][] roads = jsonArrayToInt2DArray(inputJsonValues[2]);
        return JSON.toJSON(numberOfSets(n, maxDistance, roads));
    }
}
