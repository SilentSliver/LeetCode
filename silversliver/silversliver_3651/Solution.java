package silversliver.silversliver_3651;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int minCost(int[][] grid, int k) {
        
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int[][] grid = jsonArrayToInt2DArray(inputJsonValues[0]);
		int k = Integer.parseInt(inputJsonValues[1]);
        return JSON.toJSON(minCost(grid, k));
    }
}
