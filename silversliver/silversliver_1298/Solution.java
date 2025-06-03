package silversliver.silversliver_1298;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    private ArrayDeque<Integer> cur_box_que;
    private int[] g_candies;
    private int[] used;
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        cur_box_que = new ArrayDeque<Integer>();
        g_candies = candies;
        used = new int[status.length];
        var ans = 0;
        for (var cur_box_id: initialBoxes){
            used[cur_box_id] = 1;
            if (status[cur_box_id] == 1)
                ans += getCandies(cur_box_id);
        }
        while (!cur_box_que.isEmpty()) {
            var cur_box_id = cur_box_que.poll();
            for (var key: keys[cur_box_id])
                if (status[key] == 0) {
                    status[key] = 1;
                    if (used[key] == 1)
                        ans += getCandies(key);

                }

            for (var con_box_id : containedBoxes[cur_box_id]) {
                used[con_box_id] = 1;
                if (status[con_box_id] == 1 && used[con_box_id] == 1)
                    ans += getCandies(con_box_id);

            }
        }
        return ans;
    }

    private int getCandies(int cur_box_id){
        cur_box_que.offer(cur_box_id);
        used[cur_box_id] = 2;
        return g_candies[cur_box_id];
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] status = jsonArrayToIntArray(inputJsonValues[0]);
		int[] candies = jsonArrayToIntArray(inputJsonValues[1]);
		int[][] keys = jsonArrayToInt2DArray(inputJsonValues[2]);
		int[][] containedBoxes = jsonArrayToInt2DArray(inputJsonValues[3]);
		int[] initialBoxes = jsonArrayToIntArray(inputJsonValues[4]);
        return JSON.toJSON(maxCandies(status, candies, keys, containedBoxes, initialBoxes));
    }
}
