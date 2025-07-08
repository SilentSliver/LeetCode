package silversliver.silversliver_1751;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.Array;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int maxValue(int[][] events, int k) {
        var n = events.length;
        Arrays.sort(events, (a, b) -> a[1] - b[1]);
        var dp = new int[n + 1][k + 1];
        for (var i = 1; i <= n; i ++) {
            var cur_event = events[i - 1];
            int l = 1, r = i - 1;
            while (l < r) {
                var m = l + r + 1 >> 1;
                var mid_event = events[m - 1];
                if (mid_event[1] < cur_event[0]) l = m;
                else r = m - 1;
            }
            var last_sat = (r > 0 && events[r - 1][1] < cur_event[0]) ? r : 0;
            // 对于当前事件有选和不选两种选择，这里先完成状态转移, 此处需要获取last_sat
            for (var j = 1; j <= k; j++)
                dp[i][j] = Math.max(dp[i - 1][j], dp[last_sat][j - 1] + cur_event[2]);
        }
        return dp[n][k];
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[][] events = jsonArrayToInt2DArray(inputJsonValues[0]);
		int k = Integer.parseInt(inputJsonValues[1]);
        return JSON.toJSON(maxValue(events, k));
    }
}
