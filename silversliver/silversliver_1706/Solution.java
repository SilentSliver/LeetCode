package silversliver.silversliver_1706;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    int[][] grid;
    int m, n;

    public int[] findBall(int[][] _grid) {
        grid = _grid;
        m = grid.length;
        n = grid[0].length;
        var ans = new int[n];
        for(var i = 0; i < n; i++)
            ans[i] = dfs(i, 0);
        return ans;
    }

    public int dfs(int x, int y){
        if (y == m) return x;
        if ((x == n - 1 && grid[y][x] == 1) || (x == 0 && grid[y][x] == -1)) return -1;
        if (grid[y][x] != grid[y][x + grid[y][x]]) return -1;
        return dfs(x + grid[y][x], y + 1);
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[][] grid = jsonArrayToInt2DArray(inputJsonValues[0]);
        return JSON.toJSON(findBall(grid));
    }
}
