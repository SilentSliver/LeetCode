package silversliver.silversliver_3534;

import com.alibaba.fastjson.JSON;
import java.util.*;
import qubhjava.BaseSolution;


public class Solution extends BaseSolution {
    public int[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        
    }

    @Override
    public Object solve(String[] inputJsonValues) {
        int n = Integer.parseInt(inputJsonValues[0]);
		int[] nums = jsonArrayToIntArray(inputJsonValues[1]);
		int maxDiff = Integer.parseInt(inputJsonValues[2]);
		int[][] queries = jsonArrayToInt2DArray(inputJsonValues[3]);
        return JSON.toJSON(pathExistenceQueries(n, nums, maxDiff, queries));
    }
}
