package silversliver.silversliver_3341;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;

public class Solution extends BaseSolution {
    final int[] dirs = {-1, 0, 1, 0, -1};

    public int minTimeToReach(int[][] moveTime) {
        var n= moveTime.length;
        var m = moveTime[0].length;
        var dist = new int[n][m];
        for (var row : dist) Arrays.fill(row, Integer.MAX_VALUE);
        dist[0][0] = 0;

        var pq = new PriorityQueue<int[]>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[] {0, 0, 0});

        while (!pq.isEmpty()) {
            var p = pq.poll();
            int current_cost = p[0], i = p[1], j = p[2];

            if (i == n - 1 && j == m - 1) return current_cost;
            if (current_cost > dist[i][j]) continue;

            for (var k = 0; k < 4; k++) {
                var x = i + dirs[k];
                var y = j + dirs[k + 1];
                if (x >= 0 && x < n && y >= 0 && y < m) {
                    var step_cost = Math.max(moveTime[x][y], dist[i][j]) + 1;
                    if (dist[x][y] > step_cost) {
                        dist[x][y] = step_cost;
                        pq.offer(new int[]{step_cost, x, y});
                    }
                }
            }
        }
        return -1;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[][] moveTime = jsonArrayToInt2DArray(inputJsonValues[0]);
        return JSON.toJSON(minTimeToReach(moveTime));
    }
}
