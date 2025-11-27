package silversliver.silversliver_1039;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {

    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int[][] memo = new int[n][n];
        for (int[] row : memo)
            Arrays.fill(row, -1); // -1 表示没有计算过
        return dfs(0, n - 1, values, memo);
    }

    private int dfs(int i, int j, int[] v, int[][] memo) {
        if (i + 1 == j)
            return 0; // 只有两个点，无法组成三角形


        if (memo[i][j] != -1)  // 之前计算过
            return memo[i][j];


        int res = Integer.MAX_VALUE;
        for (int k = i + 1; k < j; k++) { // 枚举顶点 k
            int subRes = dfs(i, k, v, memo) + dfs(k, j, v, memo) + v[i] * v[j] * v[k];
            res = Math.min(res, subRes);
        }

        return memo[i][j] = res; // 记忆化
    }


    @Override
    public Object solve(String[] inputJsonValues) {
        int[] values = jsonArrayToIntArray(inputJsonValues[0]);
        return JSON.toJSON(minScoreTriangulation(values));
    }
}
