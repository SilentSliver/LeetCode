package silversliver.silversliver_2101;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        List<Integer>[] g = new List[n];
        Arrays.setAll(g, k -> new ArrayList<>());
        for (var i = 0; i < n - 1; i++) {
            for (var j = i + 1; j < n; j++) {
                int[] p1 = bombs[i], p2 = bombs[j];
                var dist = Math.hypot(p1[0] - p2[0], p1[1] - p2[1]);
                if (dist <= p1[2])
                    g[i].add(j);
                if (dist <= p2[2])
                    g[j].add(i);
            }
        }
        var ans = 0;
        var vis = new boolean[n];
        for (var k = 0; k < n; k++) {
            Arrays.fill(vis, false);
            vis[k] = true;
            var cnt = 0;
            var q = new ArrayDeque<Integer>();
            q.offer(k);
            while (!q.isEmpty()) {
                var i = q.poll();
                cnt++;
                for (int j : g[i])
                    if (!vis[j]) {
                        vis[j] = true;
                        q.offer(j);
                    }

            }
            if (cnt == n)
                return n;
            ans = Math.max(ans, cnt);
        }
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[][] bombs = jsonArrayToInt2DArray(inputJsonValues[0]);
        return JSON.toJSON(maximumDetonation(bombs));
    }
}
