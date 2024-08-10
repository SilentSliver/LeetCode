package silversliver.silversliver_2940;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        int n = heights.length;
        mx = new int[2 << (Integer.SIZE - Integer.numberOfLeadingZeros(n))];
        build(1, 0, n - 1, heights);

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            if (a > b) {
                int tmp = a;
                a = b;
                b = tmp; // 保证 a <= b
            }
            if (a == b || heights[a] < heights[b]) {
                ans[i] = b; // a 直接跳到 b
            } else {
                // 线段树二分，找 [b+1,n-1] 中的第一个 > heights[a] 的位置
                ans[i] = query(1, 0, n - 1, b + 1, heights[a]);
            }
        }
        return ans;
    }

    private int[] mx;

    // 用 heights 初始化线段树，维护区间最大值
    private void build(int o, int l, int r, int[] heights) {
        if (l == r) {
            mx[o] = heights[l];
            return;
        }
        int m = (l + r) / 2;
        build(o * 2, l, m, heights);
        build(o * 2 + 1, m + 1, r, heights);
        mx[o] = Math.max(mx[o * 2], mx[o * 2 + 1]);
    }

    private int query(int o, int l, int r, int L, int v) {
        if (mx[o] <= v)
            return -1;
        if (l == r)
            return l;
        int m = (l + r) / 2;
        if (L <= m) {
            int pos = query(o * 2, l, m, L, v);
            if (pos >= 0)
                return pos;
        }
        return query(o * 2 + 1, m + 1, r, L, v);
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[] heights = jsonArrayToIntArray(inputJsonValues[0]);
		int[][] queries = jsonArrayToInt2DArray(inputJsonValues[1]);
        return JSON.toJSON(leftmostBuildingQueries(heights, queries));
    }
}
