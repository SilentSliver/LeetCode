package silversliver.silversliver_3362;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int maxRemoval(int[] nums, int[][] queries) {
//        对queries数组排列，按l下标从小到大排列
        Arrays.sort(queries,
                Comparator.comparingInt(a -> a[0]));
        var pq = new PriorityQueue<Integer>((a, b) -> b - a);
        var n = nums.length;
        var d = new int[n + 1];
        int s = 0, j = 0;
        for (var i = 0; i < n; i++) {
            s += d[i];
            while (j < queries.length && queries[j][0] <= i) {
                pq.offer(queries[j][1]);
                j++;
            }
            while (s < nums[i] && !pq.isEmpty() && pq.peek() >= i) {
                s++;
                d[pq.poll() + 1]--;
            }
            if (s < nums[i])
                return -1;
        }
        return pq.size();
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] nums = jsonArrayToIntArray(inputJsonValues[0]);
		int[][] queries = jsonArrayToInt2DArray(inputJsonValues[1]);
        return JSON.toJSON(maxRemoval(nums, queries));
    }
}
