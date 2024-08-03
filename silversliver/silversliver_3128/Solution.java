package silversliver.silversliver_3128;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public long numberOfRightTriangles(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        var rows = new int[m];
        var cols = new int[n];
        for (var i = 0; i < m; ++i) 
            for (var j = 0; j < n; ++j) {
                rows[i] += grid[i][j];
                cols[j] += grid[i][j];
            }
        var ans = 0L;
        for (var i = 0; i < m; ++i) 
            for (var j = 0; j < n; ++j) 
                if (grid[i][j] == 1) 
                    ans += (rows[i] - 1) * (cols[j] - 1);

        return ans;
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[][] grid = jsonArrayToInt2DArray(inputJsonValues[0]);
        return JSON.toJSON(numberOfRightTriangles(grid));
    }
}
