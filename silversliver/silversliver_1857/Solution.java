package silversliver.silversliver_1857;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int largestPathValue(String colors, int[][] edges) {
        int n = colors.length();
        List<Integer>[] list_out_edge;
        list_out_edge = new ArrayList[n];
        Arrays.setAll(list_out_edge, k -> new ArrayList<>());
//        定义入边数量
        var cnt_in_edge = new int[n];
        for (var e : edges) {
            int start = e[0], stop = e[1];
            list_out_edge[start].add(stop);
            ++cnt_in_edge[stop];
        }
        var q = new ArrayDeque<Integer>();
        var dp = new int[n][26];
        for (int i = 0; i < n; ++i) {
            if (cnt_in_edge[i] == 0) {
                q.push(i);
                int c = colors.charAt(i) - 'a';
                ++dp[i][c];
            }
        }
        int cnt = 0, ans = 1;
        while (!q.isEmpty()) {
            var i = q.poll();
            ++cnt;
            for (var j : list_out_edge[i]) {
                if (--cnt_in_edge[j] == 0)
                    q.push(j);
                var cur = colors.charAt(j) - 'a';
                for (var k = 0; k < 26; ++k) {
                    dp[j][k] = Math.max(dp[j][k], dp[i][k] + (cur == k ? 1 : 0));
                    ans = Math.max(ans, dp[j][k]);
                }
            }
        }
        return cnt == n ? ans : -1;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        String colors = jsonStringToString(inputJsonValues[0]);
		int[][] edges = jsonArrayToInt2DArray(inputJsonValues[1]);
        return JSON.toJSON(largestPathValue(colors, edges));
    }
}
