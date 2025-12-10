package silversliver.silversliver_3531;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int n = Integer.parseInt(inputJsonValues[0]);
		int[][] buildings = jsonArrayToInt2DArray(inputJsonValues[1]);
        return JSON.toJSON(countCoveredBuildings(n, buildings));
    }
}
