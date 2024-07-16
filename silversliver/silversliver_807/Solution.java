package silversliver.silversliver_807;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        var ans = 0;
        var n = grid.length;
        var max = new int[2][n];
        for (var i = 0; i < n; i++)
            for (var j = 0; j < n; j++){
                max[0][i] = Math.max(max[0][i], grid[i][j]);
                max[1][i] = Math.max(max[1][i], grid[j][i]);
            }
        for (var i = 0; i < n; i++)
            for (var j = 0; j < n; j++)
                if (max[0][i] >= grid[i][j] && max[1][j] >= grid[i][j])
                    ans += Math.min(max[0][i], max[1][j]) - grid[i][j];
        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[][] grid = jsonArrayToInt2DArray(inputJsonValues[0]);
        return JSON.toJSON(maxIncreaseKeepingSkyline(grid));
    }
}
